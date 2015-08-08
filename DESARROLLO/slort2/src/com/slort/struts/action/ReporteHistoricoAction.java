package com.slort.struts.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.hibernate.HibernateException;

import org.apache.log4j.Logger;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.bdb.model.TwoObjects;
import com.bdb.util.DateUtils;
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
import com.slort.model.OpcionmenuPerfil;
import com.slort.model.Reserva;
import com.slort.model.ReservaDAO;
import com.slort.model.OpcionmenuDAO;
import com.slort.model.Perfil;
import com.slort.model.PerfilDAO;
import com.slort.model.Usuario;
import com.slort.model.UsuarioDAO;
import com.slort.struts.action.SlortDispatchAction;
import com.slort.struts.form.ReporteHistoricoForm;
import com.slort.struts.form.ReporteReservaForm;
import com.slort.struts.form.security.FlotaForm;
import com.slort.struts.form.security.ReservaForm;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.UsuarioForm;
import com.slort.util.FileCopy;
import com.slort.util.JExcel;
import com.slort.util.Numbers;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class ReporteHistoricoAction extends SlortDispatchAction {

	   private static final Logger log;
	   private String error;
	   
	   
	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public ReporteHistoricoAction() {
	    }

	   


	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");

	        ReporteHistoricoForm currentForm = (ReporteHistoricoForm)form;
	        currentForm.reset(mapping, request);
	        log.debug("Seteando en modo EDIT");
	        currentForm.setReqCode("find");
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return mapping.findForward("findPage");
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        
	        ReporteHistoricoForm currentForm = (ReporteHistoricoForm)form;    
	        
	        Historicoubicaciondetalle object = new Historicoubicaciondetalle();
	        HistoricoubicaciondetalleDAO HistoricoubicaciondetalleDAO = (HistoricoubicaciondetalleDAO) this.getBean(request,"HistoricoubicaciondetalleDAO");

	        UsuarioDAO un_UsuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
	        request.setAttribute("usuarios",  un_UsuarioDAO.findAll()); 
	        
	        
	        Calculoubicacion calculoubicacion = new Calculoubicacion();
	        Reserva reserva = new Reserva();
	        reserva.setUsuario(currentForm.getUsuario());
	        calculoubicacion.setReserva(reserva); 
	        object.setCalculoubicacion(calculoubicacion); 
	        
	        Flota flota = new Flota();
	        flota.setLicencia(currentForm.getLicencia());
	        object.setFlota(flota); 
	        
	        
	        Date fechadesde=null;
	        Date fechahasta=null;
	        
	        if (currentForm.getFechadesde()!=null)
	        	fechadesde = DateUtils.getFechaFormateada(currentForm.getFechadesde(),"dd-MM-yyyy");
	        
	        if (currentForm.getFechahasta()!=null)
	        	fechahasta = DateUtils.getFechaFormateada(currentForm.getFechahasta(),"dd-MM-yyyy");
		         
	        currentForm.setListaResultado(HistoricoubicaciondetalleDAO.findByGUIPosibilitiesReporte(object, fechadesde , fechahasta ));
	        
	        
	        request.setAttribute("foundResults", currentForm.getListaResultado());

	        
	        currentForm.setReqCode("findData");
	        //currentForm.reset(mapping, request);
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        log.debug("findData--");
	        return mapping.findForward("success");
	    }

	

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}
		
		
		
		
	    @SuppressWarnings("unchecked")
		public ActionForward reporte_excel(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("reporte_excel++");  
	        
	        ReporteHistoricoForm currentForm = (ReporteHistoricoForm)form; 
	        JExcel excel=new JExcel();
	        
	        String nombrePantillaHistoricoUbicacionDetalle = "Plantilla_Reporte_Historico_Ubicacion_Detalle.xls";
	        String nombreArchivo = "Reporte_Historico_"+ DateUtils.getFechaActual()+"_" +  DateUtils.getHoraActual()  +".xls"; 
	        
	        String filePath = getServlet().getServletContext().getRealPath("/") +"view\\templates";
			
	        filePath = filePath + "\\";
	        
	        try {
				FileCopy.copy(filePath + nombrePantillaHistoricoUbicacionDetalle,
							  filePath + nombreArchivo);
			} catch (IOException e) {e.printStackTrace();}
	        

	        excel.exportarArrayList(toArraydeArray(currentForm.getListaResultado()) ,
	        						response,
	        						nombreArchivo,
	        						filePath + nombreArchivo,
	        						1,
	        						6);
	        
	        log.debug("reporte_excel--");       
	        return null;
	        
	        
	        
	    }

	    
	    @SuppressWarnings("unchecked")
		private ArrayList toArraydeArray(List<Historicoubicaciondetalle> listaResultado)  {
	    	
	    ArrayList listaArray = new ArrayList();
        ArrayList unArrayH = new ArrayList();
         		 		
        unArrayH.add(new TwoObjects("Texto", "ID"));
        unArrayH.add(new TwoObjects("Texto", "Flota"));
        unArrayH.add(new TwoObjects("Texto", "Fecha"));
        unArrayH.add(new TwoObjects("Texto", "Hora"));
        unArrayH.add(new TwoObjects("Texto", "Ranking"));
        unArrayH.add(new TwoObjects("Texto", "Distancia"));
        unArrayH.add(new TwoObjects("Texto", "Tiempo"));
        unArrayH.add(new TwoObjects("Texto", "Motivo"));
       
        //listaArray.add(unArrayH);
        
        ArrayList unArray;
        
	    for (Historicoubicaciondetalle object : listaResultado) {
            error = "AdmCostos.Resultado.ExistenDatos";
            unArray = new ArrayList();
            unArray.add(new TwoObjects("Numerico", object.getId().toString() ));
            unArray.add(new TwoObjects("Numerico", object.getFlota().getCodUnidad().toString() ));
            unArray.add(new TwoObjects("Fecha", object.getFecha()));
            unArray.add(new TwoObjects("Hora", object.getHora()));
            unArray.add(new TwoObjects("Numerico", object.getRanking()));
            unArray.add(new TwoObjects("Texto", object.getDistanciaObjetivo().toString()));
            unArray.add(new TwoObjects("Texto", object.getTiempoObjetivo().toString() ));
            unArray.add(new TwoObjects("Texto", object.getMotivoNoAsignado()));
            listaArray.add(unArray); 
        }
        
        return listaArray;

    }


	    
		
		
	    
}
