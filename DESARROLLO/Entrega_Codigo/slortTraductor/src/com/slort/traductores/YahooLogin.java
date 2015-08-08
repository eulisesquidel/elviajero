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


	public class YahooLogin {
		
		
		public static String doLogin(String strURI, String pusuario , String ppassword  ) throws Exception {

			// Create and initialize WebClient object
		    WebClient webClient = new WebClient(BrowserVersion.FIREFOX_3);
		    webClient.setThrowExceptionOnScriptError(false);
		    webClient.setRefreshHandler(new RefreshHandler() {
				public void handleRefresh(Page page, URL url, int arg) throws IOException {
					System.out.println("handleRefresh");
				}

		    });

		    // visit Yahoo Mail login page and get the Form object
		    HtmlPage page = (HtmlPage) webClient.getPage(strURI);
		    HtmlForm form = page.getFormByName("login_form");

		    // Enter login and passwd
		    //form.getInputByName("login").setValueAttribute("ferreyraru");
		    //form.getInputByName("passwd").setValueAttribute("udemmudemm");
		    
		  form.getInputByName("login").setValueAttribute(pusuario);
		  form.getInputByName("passwd").setValueAttribute(ppassword);
		    
		    
		    
		    page  = (HtmlPage)  form.getButtonByName(".save").click();	    
		    HtmlForm form_autorize = page.getFormByName("authorize");    
		    page  = (HtmlPage)  form_autorize.getButtonByName("commit").click();
		    
		    HtmlElement elem = (HtmlElement) page.getElementById("oauth_verifier");
		
		    String code =  elem.asText();
		    webClient.closeAllWindows();
		    return code;
		
		}
		
	}
	
