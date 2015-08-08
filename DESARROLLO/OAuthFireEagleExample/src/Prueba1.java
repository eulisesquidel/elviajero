import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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
import org.apache.http.impl.client.DefaultHttpClient;


public class Prueba1 {

	
	  public static void Conecta1() throws Exception {

		 
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
	        
	        //System.out.println("Request token: " + consumer.getToken());
	        //System.out.println("Token secret: " + consumer.getTokenSecret());

	        //System.out.println("Now visit:\n" + authUrl
	        //        + "\n... and grant this app authorization");
	        //System.out.println("Enter the verification code and hit ENTER when you're done");

	        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        //String code = br.readLine();

	        //System.out.println("Fetching access token from Fire Eagle...");

	        //provider.retrieveAccessToken(code);
	        //provider.retrieveAccessToken(consumer.getTokenSecret());

	        System.out.println("Access token: " + consumer.getToken());
	        System.out.println("Token secret: " + consumer.getTokenSecret());

	       /* HttpPost request = new HttpPost(
	                "https://fireeagle.yahooapis.com/api/0.1/update");
	        StringEntity body = new StringEntity("city=hamburg&label="
	                + URLEncoder.encode("Send via Signpost!", "UTF-8"));
	        body.setContentType("application/x-www-form-urlencoded");
	        request.setEntity(body);
	        */
	        
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
