package com.slort.struts.form.security;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import com.slort.model.Opcionmenu;
import com.slort.struts.action.ActionForm;

public class FlotaForm  extends ActionForm {

	private Integer codUnidad;
	private boolean activo;
	private String userYahoo;
	private String passwYahoo;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String codPostal;
	private String localidad;
	private String telefono;
	private String cargo;
	private String email;
	private String fechaAlta;
	private String fechaBaja;
	private String cuit;
	private String licencia;
	private String fechaModif;
	private Byte fleliminado;
	private String esEliminar="no";
	private String consumerKeyYahoo;
	private String consumerSecretYahoo;
	
	public String getEsEliminar() {
		return esEliminar;
	}
	public void setEsEliminar(String esEliminar) {
		this.esEliminar = esEliminar;
	}
	public Integer getCodUnidad() {
		return codUnidad;
	}
	public void setCodUnidad(Integer codUnidad) {
		this.codUnidad = codUnidad;
	}

	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public boolean getActivo() {
		return activo;
	}
	public String getUserYahoo() {
		return userYahoo;
	}
	public void setUserYahoo(String userYahoo) {
		this.userYahoo = userYahoo;
	}
	public String getPasswYahoo() {
		return passwYahoo;
	}
	public void setPasswYahoo(String passwYahoo) {
		this.passwYahoo = passwYahoo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getFechaModif() {
		return fechaModif;
	}
	public void setFechaModif(String fechaModif) {
		this.fechaModif = fechaModif;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Byte getFleliminado() {
		return fleliminado;
	}
	public void setFleliminado(Byte fleliminado) {
		this.fleliminado = fleliminado;
	} 
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "nombre", this.nombre);
        validateRequired(errors, "licencia", this.licencia);
        validateRequired(errors, "apellido", this.apellido);
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.nombre=null;
    	this.licencia ="";
    	this.apellido = "";		
        super.reset(mapping, request);
        
    }
	public String getConsumerKeyYahoo() {
		return consumerKeyYahoo;
	}
	public void setConsumerKeyYahoo(String consumerKeyYahoo) {
		this.consumerKeyYahoo = consumerKeyYahoo;
	}
	public String getConsumerSecretYahoo() {
		return consumerSecretYahoo;
	}
	public void setConsumerSecretYahoo(String consumerSecretYahoo) {
		this.consumerSecretYahoo = consumerSecretYahoo;
	}

}