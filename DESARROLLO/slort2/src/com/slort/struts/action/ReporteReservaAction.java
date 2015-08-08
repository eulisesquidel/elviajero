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
import com.slort.struts.form.ReporteReservaForm;
import com.slort.struts.form.security.FlotaForm;
import com.slort.struts.form.security.ReservaForm;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.UsuarioForm;
import com.slort.util.FileCopy;
import com.slort.util.JExcel;
import com.slort.util.Numbers;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class ReporteReservaAction extends SlortDispatchAction {

	   private static final Logger log;
	   private String error;
	   
	   
	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public ReporteReservaAction() {
	    }


	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");

	        ReporteReservaForm currentForm = (ReporteReservaForm)form;
	        currentForm.reset(mapping, request);
	        log.debug("Seteando en modo EDIT");
	        currentForm.setReqCode("find");
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return mapping.findForward("findPage");
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        
	        ReporteReservaForm currentForm = (ReporteReservaForm)form;    
	        
	        if (currentForm.getEstado()==null)
	        	currentForm.setEstado( Reserva.ESTADO_ENPROCESO);
	        
	        Reserva object = new Reserva();
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        object.setEstado(currentForm.getEstado());	        
	        UsuarioDAO un_UsuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
	        request.setAttribute("usuarios",  un_UsuarioDAO.findAll()); 
	        
	        Flota flota = new Flota();
	        flota.setLicencia(currentForm.getLicencia());
	        object.setFlota(flota); 
	        
	        Cliente cliente = new Cliente();
	        cliente.setNumDoc(currentForm.getNumDoc());
	        object.setCliente(cliente); 
	        object.setUsuario(currentForm.getUsuario()); 
	     
	        Date fechadesde=null;
	        Date fechahasta=null;
	        
	        if (currentForm.getFechadesde()!=null)
	        	fechadesde = DateUtils.getFechaFormateada(currentForm.getFechadesde(),"dd-MM-yyyy");
	        
	        if (currentForm.getFechahasta()!=null)
	        	fechahasta = DateUtils.getFechaFormateada(currentForm.getFechahasta(),"dd-MM-yyyy");
		         
	        currentForm.setListaResultado(ReservaDAO.findByGUIPosibilitiesReporte(object, fechadesde , fechahasta ));
	        
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
	        
	        ReporteReservaForm currentForm = (ReporteReservaForm)form; 
	        JExcel excel=new JExcel();
	        
	        
	        String nombrePantillaReserva = "Plantilla_Reporte_Reserva.xls";
	        String nombreArchivo = "Reporte_Reserva_"+ DateUtils.getFechaActual()+"_" +  DateUtils.getHoraActual()  +".xls"; 
	        
	        String filePath = getServlet().getServletContext().getRealPath("/") +"view\\templates";
			
	        filePath = filePath + "\\";
	        
	        try {
				FileCopy.copy(filePath + nombrePantillaReserva,
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
		private ArrayList toArraydeArray(List<Reserva> listaResultado)  {
	    	
	    ArrayList listaArray = new ArrayList();
        ArrayList unArrayH = new ArrayList();
         		 		
        unArrayH.add(new TwoObjects("Texto", "Id"));
        unArrayH.add(new TwoObjects("Texto", "Usuario"));
        unArrayH.add(new TwoObjects("Texto", "Cliente"));
        unArrayH.add(new TwoObjects("Texto", "Fecha"));
        unArrayH.add(new TwoObjects("Texto", "Hora"));
        unArrayH.add(new TwoObjects("Texto", "Estado"));
        unArrayH.add(new TwoObjects("Texto", "Dirección"));
        unArrayH.add(new TwoObjects("Texto", "Flota"));
        
        //listaArray.add(unArrayH);
        ArrayList unArray;
        
	    for (Reserva object : listaResultado) {
            error = "AdmCostos.Resultado.ExistenDatos";
            unArray = new ArrayList();
            

            unArray.add(new TwoObjects("Numerico", object.getIdReserva().toString()));
            unArray.add(new TwoObjects("Texto", object.getUsuario().getUsuario()));
            unArray.add(new TwoObjects("Texto", object.getCliente().getNumDoc().toString()));
            unArray.add(new TwoObjects("Fecha", object.getFecha()));
            unArray.add(new TwoObjects("Hora", object.getHora()));
            unArray.add(new TwoObjects("Texto", object.getEstado()));
            unArray.add(new TwoObjects("Texto", object.getDireccion()));
            if (object.getFlota()!=null)
            	unArray.add(new TwoObjects("Numerico", object.getFlota().getLicencia()));
            else 
            	unArray.add(new TwoObjects("Texto",null));
            
            listaArray.add(unArray); 
        }
        
        return listaArray;

    }


	    
		
		
	    
}
