package com.slort.admin;

import java.util.List;

import com.slort.model.Ubicacionreal;

public class AdmAdapterXML_PIPE {

	public static String ubicacionesrealestoXML(List<Ubicacionreal> ubicacionesreales){
		String xml="<Ubicacionesreales>";
		for (Ubicacionreal ubicacionreal : ubicacionesreales) {
			xml+=ubicacionrealtoXML(ubicacionreal);
		}
		xml+="</Ubicacionesreales>";
		return xml;
	}

	public static String ubicacionrealtoXML(Ubicacionreal un_Ubicacionreal){

		String xml="<Ubicacionreal>";
		xml+="<codUnidad>" + un_Ubicacionreal.getFlota().toString()+ "</codUnidad>";
		xml+="<latitud>" + un_Ubicacionreal.getLatitud().toString()+ "</latitud>";
		xml+="<longitud>" + un_Ubicacionreal.getLongitud().toString()+ "</longitud>";
		xml+="<flotaCompleta>" + un_Ubicacionreal.getFlota().getFlotaCompleta().toString()+ "</flotaCompleta>";
		xml+="</Ubicacionreal>";
		return xml;
	}

	public static String ubicacionesrealestoPipe(List<Ubicacionreal> ubicacionesreales){
		String pipe="";
		for (Ubicacionreal ubicacionreal : ubicacionesreales) {
			pipe+=ubicacionrealtoNumeral(ubicacionreal);
			pipe+="|";
		}
		return pipe;
	}

	public static String ubicacionrealtoNumeral(Ubicacionreal un_Ubicacionreal){

		String pipe="";
	
		pipe+=un_Ubicacionreal.getFlota().getCodUnidad().toString()+ "###";
		pipe+=un_Ubicacionreal.getLatitud().toString()+ "###";
		pipe+=un_Ubicacionreal.getLongitud().toString()+ "###";
		pipe+=un_Ubicacionreal.getFlota().getFlotaCompleta().toString()+ "###";
		pipe+=un_Ubicacionreal.getLatLongGoogleMap() ;
		return pipe;
	}
}
