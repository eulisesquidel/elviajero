package com.slort.struts.action.ajax;

import java.util.ArrayList;
import java.util.Enumeration;
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
import com.bdb.util.DateUtils;
import com.slort.admin.AdmAdapterXML_PIPE;
import com.slort.admin.AdmFlota;
import com.slort.admin.AdmSpringBD;
import com.slort.model.Calculoubicacion;
import com.slort.model.CalculoubicacionDAO;
import com.slort.model.Cliente;
import com.slort.model.ClienteDAO;
import com.slort.model.Flota;
import com.slort.model.FlotaDAO;
import com.slort.model.Historicoubicaciondetalle;
import com.slort.model.HistoricoubicaciondetalleDAO;
import com.slort.model.Hotel;
import com.slort.model.HotelDAO;
import com.slort.model.Reserva;
import com.slort.model.ReservaDAO;

import com.slort.struts.action.SlortDispatchAction;
import com.slort.struts.action.security.ReservaAction;
import com.slort.struts.form.security.ReservaForm;
import com.slort.util.Numbers;

public class GuardarAjaxAction  extends SlortDispatchAction {	
	
	private static final Logger log  = Logger.getLogger(GuardarAjaxAction.class);

	
	public ActionForward getGuardarRankingyUnidad(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		AjaxPopulate ajax = new AjaxPopulate();
	
		ReservaForm currentForm = (ReservaForm) request.getSession().getAttribute("reservaForm_session");
		
		String paquetededatos_http[]=request.getParameterValues("paquetededatos");
		
		String[] registros=null;
		String[] unidad=null;
		String[] unidadAsignada=null;
		String[] motivo=null;
		String[] ranking=null;
		String[] tiempo=null;
		String[] distancia=null;
		
		for (String string : paquetededatos_http) {
			log.info(string);
			registros = string.split(";");
			unidad = string.split(";");
			unidadAsignada = string.split(";");
			motivo = string.split(";");
			ranking = string.split(";");
			tiempo = string.split(";");
			distancia = string.split(";");
			for (int i=0;i<registros.length;i++) {
				String[] registros2 = registros[i].split("-");
				ranking[i]=registros2[0];
				unidad[i]=registros2[1];
				unidadAsignada[i]=registros2[2];
				if (registros2.length==6) motivo[i]=registros2[3]; else motivo[i]="";
				tiempo[i]=registros2[4];
				distancia[i]=registros2[5];
			}
		}
		
		currentForm.setUnidad(unidad);
		currentForm.setUnidadAsignada(unidadAsignada);
		currentForm.setRanking(ranking);
		currentForm.setMotivo(motivo);
		currentForm.setTiempo(tiempo);
		currentForm.setDistancia(distancia);
		

    	this.beginTransactionSpring(request);
    	
        Reserva una_Reserva = null;
        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");   
        una_Reserva = ReservaDAO.findById( currentForm.getIdReserva());	   
    	//un_calculoubicacion
    	 Calculoubicacion un_calculoubicacion  =  currentForm.getCalculoubicacion();
    	 un_calculoubicacion.setCodUnidad( obtenerCodUnidadAsignada(currentForm));
    	 un_calculoubicacion.setReserva(una_Reserva);
         CalculoubicacionDAO un_calculoubicacionDAO = (CalculoubicacionDAO) this.getBean(request,"CalculoubicacionDAO");   
	     un_calculoubicacionDAO.save(un_calculoubicacion);
	     
	     Flota flota=null;
	     FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO"); 
	     flota = flotaDAO.findById(un_calculoubicacion.getCodUnidad());
	     
	     // grabamos el objeto reversa con la unidad ganadora

         una_Reserva.setFlota(flota);
         una_Reserva.setCalculoubicacion(un_calculoubicacion);
         una_Reserva.setEstado("A realizar");
         ReservaDAO.save(una_Reserva);
         
        // grabar el historico historicoubicaciondetalle
         HistoricoubicaciondetalleDAO un_HistoricoubicaciondetalleDAO = (HistoricoubicaciondetalleDAO) this.getBean(request,"HistoricoubicaciondetalleDAO");   
         
		for (int i = 0; i < currentForm.getUnidad().length; i++) {			
			
			Historicoubicaciondetalle un_Historicoubicaciondetalle= new Historicoubicaciondetalle();
			flota=null; 
		    flota = flotaDAO.findById( new Integer(currentForm.getUnidad()[i]));
		    un_Historicoubicaciondetalle.setFlota(flota);
		    un_Historicoubicaciondetalle.setCalculoubicacion(un_calculoubicacion);
		    un_Historicoubicaciondetalle.setMotivoNoAsignado(currentForm.getMotivo()[i]);	
		    un_Historicoubicaciondetalle.setHora(DateUtils.getFechaFormateada(DateUtils.getFechaActual("H:mm"),"H:mm"));
		    un_Historicoubicaciondetalle.setFecha(DateUtils.getFechaActualasDate());
		    un_Historicoubicaciondetalle.setGpsactivo("1");
		    un_Historicoubicaciondetalle.setRanking(i);
		    un_Historicoubicaciondetalle.setTiempoObjetivo(currentForm.getTiempo()[i]);
		    un_Historicoubicaciondetalle.setDistanciaObjetivo(new Float(currentForm.getDistancia()[i].replace(",", ".")));
		    un_HistoricoubicaciondetalleDAO.save(un_Historicoubicaciondetalle);
		}
		
		// Finalizamos la transaccion	
		this.commitTransactionSpring(request);	
		
		
		ajax.escribirAjax(response,"OK");
		return null;
	}
	
	
    
	public Integer obtenerCodUnidadAsignada(ReservaForm currentForm){
		for (int i = 0; i < currentForm.getUnidad().length; i++) {			
			if (currentForm.getUnidadAsignada()[i].toString().compareTo( "true")==0){
				return new Integer(currentForm.getUnidad()[i]);
			}
		}
		return null;
	}

	
	public ActionForward getGuardarSinAsignar(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		AjaxPopulate ajax = new AjaxPopulate();
	
		ReservaForm currentForm = (ReservaForm) request.getSession().getAttribute("reservaForm_session");
		
		String paquetededatos_http[]=request.getParameterValues("paquetededatos");
		
		String[] registros=null;
		String[] unidad=null;
		String[] unidadAsignada=null;
		String[] motivo=null;
		String[] ranking=null;
		String[] tiempo=null;
		String[] distancia=null;
		
		for (String string : paquetededatos_http) {
			log.info(string);
			registros = string.split(";");
			unidad = string.split(";");
			unidadAsignada = string.split(";");
			motivo = string.split(";");
			ranking = string.split(";");
			tiempo = string.split(";");
			distancia = string.split(";");
			for (int i=0;i<registros.length;i++) {
				String[] registros2 = registros[i].split("-");
				ranking[i]=registros2[0];
				unidad[i]=registros2[1];
				unidadAsignada[i]=registros2[2];
				if (registros2.length==6) motivo[i]=registros2[3]; else motivo[i]="";
				tiempo[i]=registros2[4];
				distancia[i]=registros2[5];
			}
		}
		
		currentForm.setUnidad(unidad);
		currentForm.setUnidadAsignada(unidadAsignada);
		currentForm.setRanking(ranking);
		currentForm.setMotivo(motivo);
		currentForm.setTiempo(tiempo);
		currentForm.setDistancia(distancia);
		

    	this.beginTransactionSpring(request);
    	
        Reserva una_Reserva = null;
        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");   
        una_Reserva = ReservaDAO.findById( currentForm.getIdReserva());	   
    	//un_calculoubicacion
    	 Calculoubicacion un_calculoubicacion  =  currentForm.getCalculoubicacion();
    	 un_calculoubicacion.setCodUnidad( obtenerCodUnidadAsignada(currentForm));
    	 un_calculoubicacion.setReserva(una_Reserva);
         CalculoubicacionDAO un_calculoubicacionDAO = (CalculoubicacionDAO) this.getBean(request,"CalculoubicacionDAO");   
	     un_calculoubicacionDAO.save(un_calculoubicacion);
	     
	     Flota flota=null;
	     FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO"); 
         
        // grabar el historico historicoubicaciondetalle
         HistoricoubicaciondetalleDAO un_HistoricoubicaciondetalleDAO = (HistoricoubicaciondetalleDAO) this.getBean(request,"HistoricoubicaciondetalleDAO");   
         
		for (int i = 0; i < currentForm.getUnidad().length; i++) {			
			
			Historicoubicaciondetalle un_Historicoubicaciondetalle= new Historicoubicaciondetalle();
			flota=null; 
		    flota = flotaDAO.findById( new Integer(currentForm.getUnidad()[i]));
		    un_Historicoubicaciondetalle.setFlota(flota);
		    un_Historicoubicaciondetalle.setCalculoubicacion(un_calculoubicacion);
		    un_Historicoubicaciondetalle.setMotivoNoAsignado(currentForm.getMotivo()[i]);	
		    un_Historicoubicaciondetalle.setHora(DateUtils.getFechaFormateada(DateUtils.getFechaActual("H:mm"),"H:mm"));
		    un_Historicoubicaciondetalle.setFecha(DateUtils.getFechaActualasDate());
		    un_Historicoubicaciondetalle.setGpsactivo("1");
		    un_Historicoubicaciondetalle.setRanking(i);
		    un_Historicoubicaciondetalle.setTiempoObjetivo(currentForm.getTiempo()[i]);
		    un_Historicoubicaciondetalle.setDistanciaObjetivo(new Float(currentForm.getDistancia()[i].replace(",", ".")));
		    un_HistoricoubicaciondetalleDAO.save(un_Historicoubicaciondetalle);
		}
		
		// Finalizamos la transaccion	
		this.commitTransactionSpring(request);	
		
		
		ajax.escribirAjax(response,"OK");
		return null;
	}
	
	
	
	

	
}
