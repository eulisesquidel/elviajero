import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;

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

public class Main {

	
	   public static void main(String[] args) throws Exception {
		   System.out.print("iniciamos ");
		   for (Integer i=0;i<2;i++){
			   System.out.print("consulta numero ============================================ " +i.toString());
			   main2();
		   }
			   
		   
	   }
    public static void main2() throws Exception {

 
    	// datos que fueron asignados por Fire Eagle al momento de crear una
    	// aplicacion
    	// Consumer Key: VVcIsipjoqND
    	// Consumer Secret:  YvLOhwqZc2jzsjibMMMtDeic6diaKVaX
        OAuthConsumer consumer = new CommonsHttpOAuthConsumer("VVcIsipjoqND",
                "YvLOhwqZc2jzsjibMMMtDeic6diaKVaX", SignatureMethod.HMAC_SHA1);

        // URL de autorizacion para establecer la conección
        OAuthProvider provider = new DefaultOAuthProvider(consumer,
                "https://fireeagle.yahooapis.com/oauth/request_token",
                "https://fireeagle.yahooapis.com/oauth/access_token",
                "https://fireeagle.yahoo.net/oauth/authorize");

        System.out.println("Fetching request token from Fire Eagle...");

        // we do not support callbacks, thus pass OOB   OAuth.OUT_OF_BAND
        String authUrl = provider.retrieveRequestToken(OAuth.OUT_OF_BAND);
        
        String datos[]=authUrl.split("=");
        System.out.println("Request token: " + consumer.getToken());
        System.out.println("Token secret: " + consumer.getTokenSecret());

        System.out.println("Now visit:\n" + authUrl
                + "\n... and grant this app authorization");
        System.out.println("Enter the verification code and hit ENTER when you're done");
        
        String code = YahooLogin.doLogin(authUrl);
        
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
        
        // If the response does not enclose an entity, there is no need
        // to worry about connection release
        if (entity != null) {
            InputStream instream = entity.getContent();
            try {
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(instream));
                String str;
                // do something useful with the response
                while ((str = reader.readLine()) != null) 
                {  System.out.println(str); }            
            } finally {     
                // Closing the input stream will trigger connection release
                instream.close();    
            }
        }    
            // When HttpClient instance is no longer needed, 
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpClient.getConnectionManager().shutdown();    
            
    }
    
    
    
    
    
}




