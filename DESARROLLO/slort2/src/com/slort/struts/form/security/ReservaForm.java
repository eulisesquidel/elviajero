package com.slort.struts.form.security;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.slort.model.Calculoubicacion;
import com.slort.model.Cliente;
import com.slort.model.Flota;
import com.slort.model.Historicoubicaciondetalle;
import com.slort.model.Hotel;
import com.slort.model.Opcionmenu;
import com.slort.model.Perfil;
import com.slort.model.Usuario;
import com.slort.struts.action.ActionForm;

public class ReservaForm  extends ActionForm {

	private Integer idReserva;
	private Flota flota;
	private String licencia;
	private Integer codUnidad;
	private Hotel hotel;
	private Integer idHotel;
	private String nombre;
	private Cliente cliente;
	private Integer codCliente;
	private String numDoc;	
	private Calculoubicacion calculoubicacion;
	private String fecha;
	private String hora;
	private String estado;
	private Integer idUsuario;
	private String observaciones;
	private String direccion;
	private String telefono;
	private String entreCalles;
	private String localidad;
	private Double latitud;
	private Double longitud;
	private String[] unidadAsignada; 
	private String[] motivo; 
	private String[] unidad; 
	private String[] ranking; 
	private String[] tiempo; 
	private String[] distancia; 
	private String   liberadoparaAsignar;
	private Usuario  usuario;
	private String  direccionGoogle; 
	

	public ReservaForm() {
		super();
		this.unidadAsignada = new String[300];
		this.motivo = new String[300];
		this.unidad = new String[300];
		this.tiempo = new String[300];
		this.distancia = new String[300];
		this.cliente= new Cliente();
    	this.flota=new Flota();
    	this.hotel=new Hotel();
    	this.usuario = new Usuario(); 

	}
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Flota getFlota() {
		return flota;
	}    
	public void setFlota(Flota flota) {
		this.flota = flota;
	}

	public Integer getCodUnidad() {
		if (flota==null)
			return null;
		else
			return this.flota.getCodUnidad();
	}

	public void setCodUnidad(Integer codUnidad){
		if (flota==null)
			this.flota= new Flota();
		this.flota.setCodUnidad(codUnidad) ;
		this.flota.setLicencia(this.licencia);
	}
	
	public String getLicencia() {
		if (flota==null)
			return "";
		else
			return flota.getLicencia();
	}

	public void setLicencia(String flotaLicencia)  {
		if (flota==null)
			this.flota= new Flota();
		this.flota.setCodUnidad(this.codUnidad);
		this.flota.setLicencia(flotaLicencia);
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	public Integer getIdHotel() {
		if (hotel==null)
			return null;
		else
			return this.hotel.getIdHotel();
	}

	public void setIdHotel(Integer idHotel){
		if (hotel==null)
			this.hotel= new Hotel();
		this.hotel.setIdHotel(idHotel) ;
		this.hotel.setNombre(this.nombre);
	}

	public String getNombre()  {
		if (hotel==null)
			return "";
		else
			return hotel.getNombre();
	}

	public void setNombre(String hotelNombre)  {
		if (hotel==null)
			this.hotel= new Hotel();
		this.hotel.setIdHotel(this.codUnidad);
		this.hotel.setNombre(hotelNombre);
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Integer getCodCliente(){
		if (cliente==null)
			return null;
		else
			return this.cliente.getCodCliente();
	}

	public void setCodCliente(Integer codCliente){
		if (cliente==null)
			this.cliente= new Cliente();
		this.cliente.setCodCliente(codCliente) ;
		this.cliente.setNumDoc(this.numDoc);
		this.codCliente = codCliente;
	}

	public String getNumDoc() {
		if (cliente==null)
			return null;
		else
			return cliente.getNumDoc();
	}

	public void setNumDoc(String clienteNumDoc)  {
		if (cliente==null)
			this.cliente= new Cliente();
		this.cliente.setCodCliente(this.codCliente);
		this.cliente.setNumDoc(clienteNumDoc);
	}

	public Calculoubicacion getCalculoubicacion() {
		return calculoubicacion;
	}
	public void setCalculoubicacion(Calculoubicacion calculoubicacion) {
		this.calculoubicacion = calculoubicacion;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEntreCalles() {
		return entreCalles;
	}
	public void setEntreCalles(String entreCalles) {
		this.entreCalles = entreCalles;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Double getLatitud() {
		return latitud;
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

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "cliente", this.cliente);
        validateRequired(errors, "telefono", this.telefono);
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.cliente=new Cliente();
    	this.direccion=null;
    	this.estado=null;
    	this.telefono ="";
    	this.fecha = null;
    	this.hora = null;
    	this.latitud = null;
    	this.longitud = null;
    	this.flota=new Flota();
    	this.hotel=new Hotel();
    	this.usuario = new Usuario(); 
        super.reset(mapping, request);
        
    }
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String[] getUnidadAsignada() {
		return unidadAsignada;
	}
	public void setUnidadAsignada(String[] unidadAsignada) {
		this.unidadAsignada = unidadAsignada;
	}
	public String[] getMotivo() {
		return motivo;
	}
	public void setMotivo(String[] motivo) {
		this.motivo = motivo;
	}
	public String[] getUnidad() {
		return unidad;
	}
	public void setUnidad(String[] unidad) {
		this.unidad = unidad;
	}
	public String[] getRanking() {
		return ranking;
	}
	public void setRanking(String[] ranking) {
		this.ranking = ranking;
	}
	public String[] getTiempo() {
		return tiempo;
	}
	public void setTiempo(String[] tiempo) {
		this.tiempo = tiempo;
	}
	public String[] getDistancia() {
		return distancia;
	}
	public void setDistancia(String[] distancia) {
		this.distancia = distancia;
	}
	public String getLiberadoparaAsignar() {
		return liberadoparaAsignar;
	}
	public void setLiberadoparaAsignar(String liberadoparaAsignar) {
		this.liberadoparaAsignar = liberadoparaAsignar;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDireccionGoogle() {
		return direccionGoogle;
	}
	public void setDireccionGoogle(String direccionGoogle) {
		this.direccionGoogle = direccionGoogle;
	}

}