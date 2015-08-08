package com.slort.struts.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import com.slort.model.Reserva;
import com.slort.model.Usuario;
import com.slort.struts.action.ActionForm;

public class ReporteHistoricoForm  extends ActionForm {

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
	private String estado;
	private Integer idUsuario;
	private Usuario usuario;
	private String fechadesde;
	private String fechahasta;
	private List<Historicoubicaciondetalle> listaResultado;
	
	

	public List<Historicoubicaciondetalle> getListaResultado() {
		return listaResultado;
	}
	public void setListaResultado(List<Historicoubicaciondetalle> listaResultado) {
		this.listaResultado = listaResultado;
	}
	public String getFechadesde() {
		return fechadesde;
	}
	public void setFechadesde(String fechadesde) {
		this.fechadesde = fechadesde;
	}
	public String getFechahasta() {
		return fechahasta;
	}
	public void setFechahasta(String fechahasta) {
		this.fechahasta = fechahasta;
	}
	public ReporteHistoricoForm() {
		super();
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


	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "cliente", this.cliente);
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.cliente=new Cliente();
    	this.estado=null;
    	this.fecha = null;
    	this.flota=new Flota();
    	this.fechadesde ="";
    	this.fechahasta ="";
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


	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}