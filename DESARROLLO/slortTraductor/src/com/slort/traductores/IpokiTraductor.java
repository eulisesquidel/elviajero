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

public class IpokiTraductor {

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
 

        HttpGet request = new HttpGet("http://www.ipoki.com/followme.php?clave="+ puna_Unidad.getTokenIpoki());
        

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
        
        System.out.print(xmldatos.toString());
        // When HttpClient instance is no longer needed, 
        // shut down the connection manager to ensure
        // immediate deallocation of all system resources
        httpClient.getConnectionManager().shutdown();   


      
        IpokiParser un_ipokiparser = new IpokiParser ();
     	IpokiLocation un_IpokiLocation = un_ipokiparser.getIpokiLocation(xmldatos.toString());
        
     	Ubicacionreal una_UbicacionReal = new  Ubicacionreal();
        
     	error = "";
        if  ( un_IpokiLocation ==null){
        	error = IpokiLogin.getError();
        	return null;
        }    
        
        if (error!=""){
        	return null;
        }
        	
        // falta evaluar si el gps esta activo o no en base
        // a la fecha de localizacion 
        if (puna_Ubicacionreal==null){
            una_UbicacionReal.setGpsactivo("1");
        }
        else{
        	if (un_IpokiLocation.getEstado().compareToIgnoreCase("Offline")==0)
        		una_UbicacionReal.setGpsactivo("0");
        	else 
        		una_UbicacionReal.setGpsactivo("1");
        }
    
        una_UbicacionReal.setLongitud(un_IpokiLocation.getLongitud());
        una_UbicacionReal.setLatitud(un_IpokiLocation.getLatitud());
        una_UbicacionReal.setFlota(puna_Unidad);
        una_UbicacionReal.setFecha(DateUtils.getFechaActualasDate());
        una_UbicacionReal.setFlota(puna_Unidad);
        una_UbicacionReal.setSimulada("0");
    
        return una_UbicacionReal;
        
        
       
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




