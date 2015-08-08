package com.slort.traductores;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.ParseException;

import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.signature.SignatureMethod;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.slort.model.Flota;
import com.slort.model.Ubicacionreal;
import com.slort.utils.DateUtils;

public class FireEagleTraductor {

	private String error;
    private Integer diferenciaGpsActivo=10;
    private Byte simulada;
    
    public Ubicacionreal traducir(Flota puna_Unidad, Ubicacionreal puna_Ubicacionreal) throws Exception {
    	simulada=puna_Unidad.getFlSimulada();
        if (simulada==1){
            Ubicacionreal una_UbicacionReal = new  Ubicacionreal();
            una_UbicacionReal.setLongitud(Math.random()*-0.1778415 + -58.370361);
            una_UbicacionReal.setLatitud(Math.random()*-0.23145266 + -34.58573628);
            una_UbicacionReal.setFlota(puna_Unidad);
            una_UbicacionReal.setFecha(DateUtils.getFechaActualasDate());
            una_UbicacionReal.setFlota(puna_Unidad);
            una_UbicacionReal.setSimulada("1");
            una_UbicacionReal.setGpsactivo("1");
        
            return una_UbicacionReal;
        }
        else{
 
    	// datos que fueron asignados por Fire Eagle al momento de crear una
    	// aplicacion
    	// Consumer Key: VVcIsipjoqND
    	// Consumer Secret:  YvLOhwqZc2jzsjibMMMtDeic6diaKVaX
        //OAuthConsumer consumer = new CommonsHttpOAuthConsumer("VVcIsipjoqND",
    	//        "YvLOhwqZc2jzsjibMMMtDeic6diaKVaX", SignatureMethod.HMAC_SHA1);

    	error ="";
    	
        OAuthConsumer consumer = new CommonsHttpOAuthConsumer( 
        		puna_Unidad.getConsumerKeyYahoo(),
        		puna_Unidad.getConsumerSecretYahoo(), SignatureMethod.HMAC_SHA1);

        
        
        // URL de autorizacion para establecer la conección
        OAuthProvider provider = new DefaultOAuthProvider(consumer,
                "https://fireeagle.yahooapis.com/oauth/request_token",
                "https://fireeagle.yahooapis.com/oauth/access_token",
                "https://fireeagle.yahoo.net/oauth/authorize");

        System.out.println("Fetching request token from Fire Eagle...");

        // we do not support callbacks, thus pass OOB   OAuth.OUT_OF_BAND
        String authUrl = provider.retrieveRequestToken(OAuth.OUT_OF_BAND);
        
        //String datos[]=authUrl.split("=");
        System.out.println("Request token: " + consumer.getToken());
        System.out.println("Token secret: " + consumer.getTokenSecret());

        System.out.println("Now visit:\n" + authUrl
                + "\n... and grant this app authorization");
        System.out.println("Enter the verification code and hit ENTER when you're done");
        
        String code = YahooLogin.doLogin(authUrl, puna_Unidad.getUserYahoo(), puna_Unidad.getPasswYahoo());
        
        System.out.println("Fetching access token from Fire Eagle... Token: " + code);
        
        provider.retrieveAccessToken(code);
        //provider.retrieveAccessToken(consumer.getTokenSecret());
        System.out.println("Access token: " + consumer.getToken());
        System.out.println("Token secret: " + consumer.getTokenSecret());

        // URL para solicitar la ubicacion del dispositivo
        HttpGet request = new HttpGet("https://fireeagle.yahooapis.com/api/0.1/user");
        
        consumer.sign(request);

        System.out.println("Sending update request to Fire Eagle...");

        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(request);

        System.out.println("Response: "
                + response.getStatusLine().getStatusCode() + " "
                + response.getStatusLine().getReasonPhrase());
        
        // Get hold of the response entity
        HttpEntity entity = response.getEntity();
        StringBuffer xmldatos=null;
        // If the response does not enclose an entity, there is no need
        // to worry about connection release
        if (entity != null) {
            InputStream instream = entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
                xmldatos = new StringBuffer();
                int c;
                while ((c = reader.read()) != -1) xmldatos.append((char) c);     
        }    
        
        // When HttpClient instance is no longer needed, 
        // shut down the connection manager to ensure
        // immediate deallocation of all system resources
        httpClient.getConnectionManager().shutdown();   
        
        FireEagleXmlParser un_FireEagleXmlParser = new FireEagleXmlParser ();
        FireEagleLocation un_FireEagleLocation = un_FireEagleXmlParser.getFireEagleLocation(xmldatos);
 
        if  ( un_FireEagleLocation ==null){
        	error = un_FireEagleXmlParser.getError();
        }    
        
        Ubicacionreal una_UbicacionReal = new  Ubicacionreal();
        
        if (error!=""){
        	return null;
        }
        	
        long	diferencia;
        	
        // falta evaluar si el gps esta activo o no en base
        // a la fecha de localizacion 
        if (puna_Ubicacionreal==null){
            una_UbicacionReal.setGpsactivo("1");
        }
        else{
        	// obtener la diferencia de tiempo entre la anteultima captura y la ultima
        	// captura de coordenas
        	// comparar si supera el parametro establecido para dicha funcion
        	//puna_Ubicacionreal.getFecha()
        	diferencia = DateUtils.DateDiffMinutes( DateUtils.getFechaActualasDate(), un_FireEagleLocation.getFechahoradeLocalizacion() );
        	if (diferencia> this.diferenciaGpsActivo) 
        		una_UbicacionReal.setGpsactivo("0");
        	else 
        		una_UbicacionReal.setGpsactivo("1");
        }
    
        una_UbicacionReal.setLongitud(un_FireEagleLocation.getLongitud());
        una_UbicacionReal.setLatitud(un_FireEagleLocation.getLatitud());
        una_UbicacionReal.setFlota(puna_Unidad);
        una_UbicacionReal.setFecha(un_FireEagleLocation.getFechahoradeLocalizacion());
        una_UbicacionReal.setFlota(puna_Unidad);
        una_UbicacionReal.setSimulada("0");
    
        return una_UbicacionReal;
        
    }
    }   

  
    
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


	public Integer getDiferenciaGpsActivo() {
		return diferenciaGpsActivo;
	}


	public void setDiferenciaGpsActivo(Integer diferenciaGpsActivo) {
		this.diferenciaGpsActivo = diferenciaGpsActivo;
	}
    
    
    
}




