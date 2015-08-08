package com.slort.traductores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.slort.utils.DateUtils;

public class IpokiParser {
	
	
	private String error; 
	private Integer DiferenciaHoraYahoo=20;  
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public IpokiLocation getIpokiLocation(String latitud,
											  String longitud,
											  String estado){
	
			

				
		    
		IpokiLocation una_ipokilocation = new IpokiLocation(
		    			new Double(latitud),  
		    			new Double(longitud),
		    			estado);
			return una_ipokilocation;
		    
	}
	
	public IpokiLocation getIpokiLocation(String document){
		  int start=0;
		  int end=0;
		  start = document.indexOf("map.setCenter(new GLatLng(") + "map.setCenter(new GLatLng(".length();
		  end = document.indexOf("), 15);");
		  String result = document.substring(start, end);
		  String datos[]=null;
		  datos = result.split(",");
		  IpokiLocation una_ipokilocation;
          try {
        	  				una_ipokilocation = new IpokiLocation(
			    			new Double(datos[0]),  
			    			new Double(datos[1]),
			    			"Online");
  		  } catch (Exception e) {
  			  error =""; return null;
  		  }
		  error ="";
		  return una_ipokilocation;
		 
	}


}
