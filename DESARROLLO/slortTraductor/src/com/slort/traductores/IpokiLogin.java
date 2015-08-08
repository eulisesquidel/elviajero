package com.slort.traductores;


	import java.io.IOException;
	import java.net.URL;

	import com.gargoylesoftware.htmlunit.BrowserVersion;
	import com.gargoylesoftware.htmlunit.Page;
	import com.gargoylesoftware.htmlunit.RefreshHandler;
	import com.gargoylesoftware.htmlunit.WebClient;
	import com.gargoylesoftware.htmlunit.html.HtmlElement;
	import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


	public class IpokiLogin {
		
		private static String error;
		private String estado="";
		private String latitud="";
		private String longitud="";
		
		public static IpokiLocation doLogin(String strURI, String pusuario , String ppassword  ) throws Exception {

			// Create and initialize WebClient object
		    WebClient webClient = new WebClient(BrowserVersion.FIREFOX_3);
		    webClient.setThrowExceptionOnScriptError(false);
		    webClient.setRefreshHandler(new RefreshHandler() {
				public void handleRefresh(Page page, URL url, int arg) throws IOException {
					System.out.println("handleRefresh");
				}

		    });

		    
		    // visit Yahoo Mail login page and get the Form object
		    HtmlPage page = (HtmlPage) webClient.getPage(strURI+ pusuario+ "&pin=" + ppassword);
		    
		    System.out.print( page.toString()); 
		    System.out.print( page.asText()); 
	
		    System.out.print(page.getScriptObject().toString()); 
		    
		    HtmlForm form = page.getFormByName("frmlogin");

		    // Enter login and passwd
		    //form.getInputByName("login").setValueAttribute("ferreyraru");
		    //form.getInputByName("passwd").setValueAttribute("udemmudemm");
		    form.getInputByName("login").setValueAttribute(pusuario);
		    form.getInputByName("pass").setValueAttribute(ppassword);
		    page  = (HtmlPage)  form.getButtonByName("botonlogin").click();	   

		    
	
		    System.out.print( page.toString()); 
		    
		    HtmlElement latitud = page.getElementByName("txtlati");
		    HtmlElement longitud = page.getElementByName("txtlongi");
		    HtmlElement estado = page.getElementByName("txtstatus");
		   
	        
	        IpokiParser un_ipokiparser = new IpokiParser ();
	        IpokiLocation un_IpokiLocation = un_ipokiparser.getIpokiLocation
	        		(latitud.asText(),longitud.asText(),estado.asText());
	        
	        if  ( un_IpokiLocation ==null){
	        	error = un_ipokiparser.getError();
	        }    
	        
		    webClient.closeAllWindows();
		    return un_IpokiLocation;
		
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getLatitud() {
			return latitud;
		}

		public void setLatitud(String latitud) {
			this.latitud = latitud;
		}

		public String getLongitud() {
			return longitud;
		}

		public void setLongitud(String longitud) {
			this.longitud = longitud;
		}

		public static String getError() {
			return error;
		}

		
	}
	
