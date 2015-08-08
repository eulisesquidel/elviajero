package com.slort.struts.form.security;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import com.slort.model.Opcionmenu;
import com.slort.struts.action.ActionForm;


public class ClienteForm  extends ActionForm {

	private Integer codCliente;
	private String tipoCliente;
	private String nombre;
	private String apellido;
	private String razonsocial;
	private String domicilio;
	private String codPostal;
	private String localidad;
	private String telefono;
	private String cargo;
	private String email;
	private String fechaAlta;
	private String fechaBaja;
	private String tipoDocu;
	private String numDoc;
	private String estado;
	private String fechaModif;
	private Byte fleliminado;
	private String provienedeReserva;
	private String altaReserva;
	private String idReserva;
	
	public String getAltaReserva() {
		return altaReserva;
	}
	public void setAltaReserva(String altaReserva) {
		this.altaReserva = altaReserva;
	}
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
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
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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

	public String getTipoDocu() {
		return tipoDocu;
	}
	public void setTipoDocu(String tipoDocu) {
		this.tipoDocu = tipoDocu;
	}

	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
        validateRequired(errors, "apellido", this.apellido);
        validateRequired(errors, "numDoc", this.numDoc);
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.nombre=null;
    	this.apellido = "";		
    	this.numDoc =null;
    	super.reset(mapping, request);
        
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
	public String getProvienedeReserva() {
		return provienedeReserva;
	}
	public void setProvienedeReserva(String provienedeReserva) {
		this.provienedeReserva = provienedeReserva;
	}
	public String getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}

}