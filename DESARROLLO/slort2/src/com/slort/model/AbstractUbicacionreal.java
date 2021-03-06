package com.slort.model;

import java.util.Date;

/**
 * AbstractUbicacionreal generated by MyEclipse Persistence Tools
 */

public abstract class AbstractUbicacionreal implements java.io.Serializable {

	// Fields

	private Integer id;
	private Flota flota;
	private Calculoubicacion calculoubicacion;
	private Date fecha;
	private Date hora;
	private String gpsactivo;
	private Double latitud;
	private Double longitud;
	private String simulada;
	private Integer idCalculoDeUbicacionInt;

	// Constructors

	/** default constructor */
	public AbstractUbicacionreal() {
	}

	/** minimal constructor */
	public AbstractUbicacionreal(Integer id, Flota flota) {
		this.id = id;
		this.flota = flota;
	}

	/** full constructor */
	public AbstractUbicacionreal(Integer id, Flota flota,
			Calculoubicacion calculoubicacion, Date fecha, Date hora,
			String gpsactivo, Double latitud, Double longitud, String simulada,
			Integer idCalculoDeUbicacionInt) {
		this.id = id;
		this.flota = flota;
		this.calculoubicacion = calculoubicacion;
		this.fecha = fecha;
		this.hora = hora;
		this.gpsactivo = gpsactivo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.simulada = simulada;
		this.idCalculoDeUbicacionInt = idCalculoDeUbicacionInt;
	}

	// Property accessors


	public Flota getFlota() {
		return this.flota;
	}

	public void setFlota(Flota flota) {
		this.flota = flota;
	}

	public Calculoubicacion getCalculoubicacion() {
		return this.calculoubicacion;
	}

	public void setCalculoubicacion(Calculoubicacion calculoubicacion) {
		this.calculoubicacion = calculoubicacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getGpsactivo() {
		return this.gpsactivo;
	}

	public void setGpsactivo(String gpsactivo) {
		this.gpsactivo = gpsactivo;
	}

	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getSimulada() {
		return this.simulada;
	}

	public void setSimulada(String simulada) {
		this.simulada = simulada;
	}

	public Integer getIdCalculoDeUbicacionInt() {
		return this.idCalculoDeUbicacionInt;
	}

	public void setIdCalculoDeUbicacionInt(Integer idCalculoDeUbicacionInt) {
		this.idCalculoDeUbicacionInt = idCalculoDeUbicacionInt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getLatLongGoogleMap(){
		  return "(" + latitud.toString()+","+ longitud.toString() +")";
	}
}