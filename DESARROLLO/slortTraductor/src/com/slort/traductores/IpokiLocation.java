package com.slort.traductores;

import java.util.Date;

public class IpokiLocation {
	
    private Double latitud=new Double(0);
    private Double longitud=new Double(0);
    private String estado=null;
    
	public Double getLatitud() {
		return latitud;
	}
	public IpokiLocation(Double latitud, Double longitud,
			String estado) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.estado = estado;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
