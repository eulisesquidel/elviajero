package com.slort.traductores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.slort.utils.DateUtils;

public class FireEagleXmlParser {
	
	
	private String error; 
	private Integer DiferenciaHoraYahoo=20;  
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public FireEagleLocation getFireEagleLocation(StringBuffer pxmldatos){
	
			
		    String document = pxmldatos.toString();
		    
	        //<georss:point>-34.798636 -58.407192</georss:point>
	        
		    String startTag = "<query>";
		    String endTag = "</query>";
		    
		    int start=0;
		    int end=0;
			

		    start = document.indexOf(startTag) + startTag.length();
		    end = document.indexOf(endTag);
		    String result = document.substring(start, end);
	    
		    // <query>lat=-34.7986&amp;lon=-58.4072</query>
		    //<query>q=-34.60957%2C-58.39%2C%20Montserrat%2C%20Argentina</query>
		    String datos[]=null;
	
		    if (document.indexOf("<georss:point>")>0){
		    	datos = result.split("&amp;");
		    }else{
		    	datos = result.split("%2C");		    	
		    }
		    	
		    datos[0]=datos[0].replace("q=", "");
		    datos[0]=datos[0].replace("lat=", "");		    
		    datos[1]=datos[1].replace("lon=", "");
		          
		     startTag = "<located-at>";
		     endTag = "</located-at>";
		     start = document.indexOf(startTag) + startTag.length();
		     end = document.indexOf(endTag);
		     result = document.substring(start, end);
		     
		     result = result.replace("T", " ");
		     result = result.substring(0, 19);

		     Date fechadelocalizacion;

		     fechadelocalizacion = DateUtils.getFechaFormateada(result, "yyyy-MM-dd HH:mm:ss") ;
		     fechadelocalizacion = DateUtils.sumarRestarfechaActualHoras(fechadelocalizacion,5);
		     
				// TODO Auto-generated catch block
				//e.printStackTrace();
				 //this.error =  e.getMessage();
				 //return null;
				
		    
		    FireEagleLocation una_fireEaglelocation = new FireEagleLocation(  new Double(datos[0]),  new Double(datos[1]),fechadelocalizacion);
			return una_fireEaglelocation;
		    
	}

}
