package com.slort.struts.form;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import com.slort.model.Opcionmenu;
import com.slort.struts.action.ActionForm;

public class HotelForm  extends ActionForm {

	private Integer idHotel=null;
	private String nombre=null;
	
	public Integer getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        validateRequired(errors, "idHotel", this.idHotel);
        validateRequired(errors, "nombre", this.nombre);
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	this.nombre="";
        super.reset(mapping, request);
        
    }

}