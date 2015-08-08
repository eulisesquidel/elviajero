package com.slort.struts.form.security;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import com.slort.model.Opcionmenu;
import com.slort.struts.action.ActionForm;

public class PerfilForm  extends ActionForm {

	private Integer    idPerfil;
	private String     descripcionCorta;
	private String     descripcionLarga;
	private Integer    opcionDefecto;
	private Opcionmenu opcionmenuDefecto;  
	private String[] opcionAsignada;
    private String[] idsOpcionmenu;
    private String[] orden;
    
	public PerfilForm() {
			super();
			this.opcionAsignada = new String[1000];
			this.idsOpcionmenu = new String[1000];
			this.orden = new String[1000];
	}
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	
	
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "descripcionCorta", this.descripcionCorta);
        validateRequired(errors, "descripcionLarga", this.descripcionLarga);
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.idPerfil=null;
    	this.descripcionCorta ="";
    	this.descripcionLarga = "";		
        super.reset(mapping, request);
        
    }
	
    
    
    public Integer getOpcionDefecto() {
    	if (this.opcionmenuDefecto==null)
    		return null;
    	return opcionmenuDefecto.getIdOpcionmenu();
	}
	public void setOpcionDefecto(Integer opcionDefecto) {
		if (this.opcionmenuDefecto==null)
			this.opcionmenuDefecto =  new Opcionmenu();
		this.opcionmenuDefecto.setIdOpcionmenu(this.opcionDefecto);
		this.opcionmenuDefecto.setDescripcionLargo(this.getDescripcionLargaOpcionDefecto());

		this.opcionDefecto = opcionDefecto;
		opcionmenuDefecto.setIdOpcionmenu(opcionDefecto);
	}
	
	
	public Opcionmenu getOpcionmenuDefecto() {
		return opcionmenuDefecto;
	}
	public void setOpcionmenuDefecto(Opcionmenu opcionmenuDefecto) {
		this.opcionmenuDefecto = opcionmenuDefecto;
	}
	
	public String getDescripcionLargaOpcionDefecto(){
		if (this.opcionmenuDefecto==null)
			return null;
		return this.opcionmenuDefecto.getDescripcionLargo();
	}
	
	public String getDescripcionLarga() {
		return descripcionLarga;
	}
	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}
	public void  setDescripcionLargaOpcionDefecto(String pvalor){
		if (this.opcionmenuDefecto==null)
			this.opcionmenuDefecto =  new Opcionmenu();
		this.opcionmenuDefecto.setIdOpcionmenu(this.opcionDefecto);
		this.opcionmenuDefecto.setDescripcionLargo(pvalor);
	}
	

	public String[] getOpcionAsignada() {
		return opcionAsignada;
	}
	public void setOpcionAsignada(String[] opcionAsignada) {
		this.opcionAsignada = opcionAsignada;
	}
	public String[] getIdsOpcionmenu() {
		return idsOpcionmenu;
	}
	public void setIdsOpcionmenu(String[] idsOpcionmenu) {
		this.idsOpcionmenu = idsOpcionmenu;
	}
	public String[] getOrden() {
		return orden;
	}
	public void setOrden(String[] orden) {
		this.orden = orden;
	}
	
}
