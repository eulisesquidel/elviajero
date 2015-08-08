package com.slort.struts.action.ajax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;
import net.sf.hibernate.expression.Expression;
import net.sf.hibernate.expression.MatchMode;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bdb.conexion.Conexion;
import com.slort.admin.AdmAdapterXML_PIPE;
import com.slort.admin.AdmFlota;
import com.slort.admin.AdmSpringBD;
import com.slort.model.Cliente;
import com.slort.model.ClienteDAO;
import com.slort.model.Flota;
import com.slort.model.FlotaDAO;
import com.slort.model.Hotel;
import com.slort.model.HotelDAO;

import com.slort.struts.action.SlortDispatchAction;
import com.slort.util.Numbers;

public class SuggestAjaxAction  extends SlortDispatchAction {	
	
	private static final Logger log  = Logger.getLogger(com.slort.struts.action.ajax.SuggestAjaxAction.class);

	
	
	
	
	public ActionForward getClientesReservaporLetras(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
			String texto = null;
			AjaxPopulate ajax = new AjaxPopulate();
			String criterio = request.getParameter("letters").toUpperCase();
	        ClienteDAO clienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO");      
			StringBuffer text = new StringBuffer();
			for (Cliente uncliente : clienteDAO.findByGUIPosibilitiesReserva(criterio)) {
					text.append( uncliente.getCodCliente().toString() + "###" + uncliente.getNumDoc().toString() + " * "  + 
								 uncliente.getNombre() + " * " +  uncliente.getApellido() + " * " + uncliente.getDomicilio()+", " + uncliente.getLocalidad()  +
								 " * " +  uncliente.getTelefono() + " |");			
			}
			
			texto = "No se encontro ningun cliente";
			if (text.length()>0) 
				texto = text.substring(0, text.length()-2);
			ajax.escribirAjax(response,texto);
			return null;
		
	} 
	
	public ActionForward getFlotaReservaporLetras(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String texto = null;
		AjaxPopulate ajax = new AjaxPopulate();
		String criterio = request.getParameter("letters").toUpperCase();
        FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO");      
		StringBuffer text = new StringBuffer();
		for (Flota unaflota: flotaDAO.findByGUIPosibilitiesReserva(criterio)) {
				text.append( unaflota.getCodUnidad().toString() + "###" + unaflota.getLicencia().toString() + " - "  +  unaflota.getNombre() + " - " +  unaflota.getApellido() + " |");			
		}
		texto = "No se encontro ningun cliente";
		if (text.length()>0) 
			texto =text.toString();	
		ajax.escribirAjax(response,texto);
		return null;
	
} 
	
	public ActionForward getHotelReservaporLetras(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String texto = null;
		AjaxPopulate ajax = new AjaxPopulate();
		String criterio = request.getParameter("letters").toUpperCase();
		HotelDAO hotelDAO = (HotelDAO) this.getBean(request,"HotelDAO");      
		StringBuffer text = new StringBuffer();
		for (Hotel unhotel: hotelDAO.findByGUIPosibilitiesReserva(criterio)) {
				text.append(unhotel.getIdHotel().toString() + "###" +  unhotel.getNombre() + " |");			
		}
		texto = "No se encontro ningun cliente";
		if (text.length()>0) 
			texto =text.toString();	
		ajax.escribirAjax(response,texto);
		return null;
	
} 
	
	public ActionForward getUbicacionrealGoogleMapsView(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		AjaxPopulate ajax = new AjaxPopulate();
		AdmSpringBD un_AdmSpringBD = new AdmSpringBD();
		un_AdmSpringBD.setApplicationContext(this.getSpringApplicationContext(request));
		AdmFlota un_AdmFlota = new AdmFlota();
		un_AdmFlota.setAdmSpringBD(un_AdmSpringBD);
		ajax.escribirAjax(response,AdmAdapterXML_PIPE.ubicacionesrealestoPipe(un_AdmFlota.ubicacionRealFlota()));
		return null;
	}

	
}
