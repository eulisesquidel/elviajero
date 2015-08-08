package com.slort.traductores;

import java.util.Date;

public class FireEagleLocation {
	
    private Double latitud=new Double(0);
    private Double longitud=new Double(0);
    private Date fechahoradeLocalizacion=null;
    
	public Double getLatitud() {
		return latitud;
	}
	public FireEagleLocation(Double latitud, Double longitud,
			Date fechahoradeLocalizacion) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.fechahoradeLocalizacion = fechahoradeLocalizacion;
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
	public Date getFechahoradeLocalizacion() {
		return fechahoradeLocalizacion;
	}
	public void setFechahoradeLocalizacion(Date fechahoradeLocalizacion) {
		this.fechahoradeLocalizacion = fechahoradeLocalizacion;
	}

}
