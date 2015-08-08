package com.slort.struts.action.security;

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
import com.slort.struts.form.security.FlotaForm;
import com.slort.struts.form.security.ReservaForm;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.UsuarioForm;
import com.slort.util.Numbers;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class ReservaAction extends SlortDispatchAction {

	   private static final Logger log;
	   private String error;
	   
	   
	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public ReservaAction() {
	    }

	    public ActionForward googlemap_view(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        return mapping.findForward("googlemap_view");
	    }
	    
	    
	    public ActionForward googlemap_distance(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        return mapping.findForward("googlemap_distance");
	    }
	    
	    public ActionForward cancelar_reserva(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	    	log.debug("setting lookups");
	        ReservaForm currentForm = (ReservaForm)form;
	    	this.beginTransactionSpring(request);
	    	
	        Reserva object = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");   
	        object = ReservaDAO.findById(currentForm.getIdReserva());
	        object.setEstado(Reserva.ESTADO_CANCELADA);
	        ReservaDAO.save(object);
			// Finalizamos la transaccion	
			this.commitTransactionSpring(request);	
	        currentForm.reset(mapping, request);
	        return findData(mapping, form, request, response);
	    }
	    

	    public ActionForward googlemap_distance_lista(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	       
	    	log.debug("setting lookups");
	        ReservaForm currentForm = (ReservaForm)form;
	    	this.beginTransactionSpring(request);
	    	
	        // grabar los objetos calculoubicacion dejar el cod_unidad vacio o nulo
	        Calculoubicacion un_calculoubicacion = new  Calculoubicacion();
	        CalculoubicacionDAO un_calculoubicacionDAO = (CalculoubicacionDAO) this.getBean(request,"CalculoubicacionDAO");   
	        un_calculoubicacion.setCodUnidad(null);
	        un_calculoubicacionDAO.save(un_calculoubicacion); 
	        
	        currentForm.setCalculoubicacion(un_calculoubicacion);

	        // grabamos el objeto reversa con el id_calculoDeUbicacion
	        Reserva object = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");   
	        object = ReservaDAO.findById( currentForm.getIdReserva());
	        if (object==null) 
	        	object = new Reserva(); 
	           
	        Flota flota=null;
	        FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO"); 
	        
	        if (currentForm.getCodUnidad()!=0) {
	        	flota = flotaDAO.findById(currentForm.getCodUnidad());
	        	object.setFlota(flota);    	
	        }
	        
	        Hotel hotel=null;
	        
	        HotelDAO hotelDAO = (HotelDAO) this.getBean(request,"HotelDAO"); 
	        if (currentForm.getIdHotel()!=0){
		        hotel = hotelDAO.findById(currentForm.getIdHotel());
		        object.setHotel(hotel);
	        }
	        
	        Cliente cliente=null;
	        ClienteDAO clienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO"); 
	        cliente = clienteDAO.findById(currentForm.getCodCliente());
	    
	        object.setCliente(cliente);
	        
	        // grabamos los datos de la reserva por si el operador realizo cambios
	        object.setCalculoubicacion(currentForm.getCalculoubicacion());
	        object.setFecha(DateUtils.getFechaFormateada(currentForm.getFecha(),"dd-MM-yyyy"));
	        object.setHora(DateUtils.getFechaFormateada(currentForm.getHora(),"HH:mm"));
	        object.setEstado(currentForm.getEstado());
	        object.setIdUsuario(currentForm.getIdUsuario());
	        object.setObservaciones(currentForm.getObservaciones());
	        object.setDireccion(currentForm.getDireccion());
	        object.setTelefono(currentForm.getTelefono());
	        object.setEntreCalles(currentForm.getEntreCalles());
	        object.setLocalidad(currentForm.getLocalidad());
	        object.setLatitud(currentForm.getLatitud());
	        object.setLongitud(currentForm.getLongitud());
	        

	        
	        object.setCalculoubicacion(un_calculoubicacion); 	    
	    	
	        
	        
	        ReservaDAO.save(object);
	    	
			// Finalizamos la transaccion	
			this.commitTransactionSpring(request);	
	      
			
			currentForm.setIdReserva(object.getIdReserva());
	        if (object.getFlota()!=null)
	        	currentForm.setFlota(object.getFlota());
	        if (object.getHotel()!=null)	        
	        	currentForm.setHotel(object.getHotel());
	        currentForm.setCliente(object.getCliente());
	        currentForm.setCalculoubicacion(object.getCalculoubicacion());
	        currentForm.setFecha(DateUtils.getFechaFormateada(object.getFecha(),"dd-MM-yyyy"));
	        currentForm.setHora(DateUtils.getFechaFormateada(object.getHora(),"HH:mm"));
	        currentForm.setEstado(object.getEstado());
	        currentForm.setIdUsuario(object.getIdUsuario());
	        currentForm.setObservaciones(object.getObservaciones());
	        currentForm.setDireccion(object.getDireccion());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setEntreCalles(object.getEntreCalles());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setLatitud(object.getLatitud());
	        currentForm.setLongitud(object.getLongitud());
	        
			request.getSession().setAttribute("reservaForm_session", currentForm);
			
			
	        ArrayList<Historicoubicaciondetalle> lista = new ArrayList<Historicoubicaciondetalle>();
	        request.setAttribute("foundResults", lista  );
	        return mapping.findForward("googlemap_distance_lista");
	    }
	    
	    
	   
		
		
	    public ActionForward googlemap_distance_lista_grabar(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        return mapping.findForward("googlemap_distance_lista_grabar");
	        
	        //generar ID en calculo ubicacion  
	        // grabamos las siguientes tablas
	        // calculo de ubicacion con la unidad asignada 
	        // historico ubicacion detalle 
	        
	        
	    }
	    
	    public ActionForward cliente_alta(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        request.getSession().setAttribute("reservaForm_session", form);
	        return mapping.findForward("cliente_alta");
	    }	    
	    
	   
	    
	    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        
	        //request.getSession().setAttribute("reservaForm", null);
	        //request.setAttribute("reservaForm", null); 
	        
	        ReservaForm currentForm = (ReservaForm)form;
	        //form.reset(mapping, request);
	        storeLookups(request);
	        currentForm.reset(mapping, request);
	        currentForm.setReqCode("create");
	        currentForm.setEstado(Reserva.ESTADO_ENPROCESO);
	        currentForm.setIdUsuario(this.getUsuario(request).getIdUsuario());
	        currentForm.setUsuario(this.getUsuario(request));
	        currentForm.setFecha(DateUtils.getFechaActual());
	        currentForm.setHora(DateUtils.sumarRestarHoraActual(1));
	        
	        if (request.getAttribute("cliente")!=null){
	        	Cliente un_cliente = (Cliente) request.getAttribute("cliente");
	         	currentForm.setCliente((Cliente) request.getAttribute("cliente"));	
	         	currentForm.setTelefono(un_cliente.getTelefono());
	         	currentForm.setDireccionGoogle(un_cliente.getDomicilio()+","+ un_cliente.getLocalidad());
	         	
	        }
	        
	        
	        FormUtils.setFormDisplayMode(request, currentForm, FormUtils.CREATE_MODE);
	    
	        
	        return  mapping.findForward("success");
	    }

	    
	    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.edit(mapping, form, request, response);
	        log.debug("edit++");
	        ReservaForm currentForm = (ReservaForm)form;
	        
	        Long selectedId = null;
	        if (request.getAttribute("selectedId")==null)
	        	selectedId = currentForm.getSelectedId();
	        else
	        	selectedId = Long.valueOf(request.getAttribute("selectedId").toString());

	        if (selectedId==null) 
	        	return create(mapping, form, request, response);
	       
	        
	        
	        currentForm.reset(mapping, request);

	        Reserva object = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");   
        	object = ReservaDAO.findById(selectedId.intValue());
	        /* obtenemos la Reserva y la presentamos en pantalla */ 
	        currentForm.setIdReserva(object.getIdReserva());
	        if (object.getFlota()!=null)
	        	currentForm.setFlota(object.getFlota());
	        if (object.getHotel()!=null)	        
	        	currentForm.setHotel(object.getHotel());
	        currentForm.setCliente(object.getCliente());
	        currentForm.setCalculoubicacion(object.getCalculoubicacion());
	        currentForm.setFecha(DateUtils.getFechaFormateada(object.getFecha(),"dd-MM-yyyy"));
	        currentForm.setHora(DateUtils.getFechaFormateada(object.getHora(),"HH:mm"));
	        currentForm.setEstado(object.getEstado());
	        currentForm.setIdUsuario(object.getIdUsuario());
	        currentForm.setUsuario(object.getUsuario());
	        currentForm.setObservaciones(object.getObservaciones());
	        currentForm.setDireccion(object.getDireccion());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setEntreCalles(object.getEntreCalles());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setLatitud(object.getLatitud());
	        currentForm.setLongitud(object.getLongitud());
	        storeLookups(request);
	        
	        if (request.getAttribute("cliente")!=null){
	        	Cliente un_cliente = (Cliente) request.getAttribute("cliente");
	         	currentForm.setCliente((Cliente) request.getAttribute("cliente"));	
	         	currentForm.setTelefono(un_cliente.getTelefono());
	         	currentForm.setDireccionGoogle(un_cliente.getDomicilio()+","+ un_cliente.getLocalidad());
	         	
	        }
	        
	        log.debug("edit--");
	        currentForm.setReqCode("edit");
	        return mapping.findForward("success");
	    }

	    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
	        super.saveProcess(mapping, form, request, response, isNew);
	        log.debug("saveProcess++");
	        ReservaForm currentForm = (ReservaForm)form;
     
	        Long selectedId = getSelectedId(currentForm, new Long (currentForm.getIdReserva()));
	    
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
			
	        Reserva object = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO"); 
	        
	        if(!isNew) {
	        	object = ReservaDAO.findById(selectedId.intValue());
	        } else {
	            object = new Reserva();    
	        }
	
	        object.setIdReserva(currentForm.getIdReserva());

	        Flota flota=null;
	        FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO"); 
	        flota = flotaDAO.findById(currentForm.getCodUnidad());
	        object.setFlota(flota);
	        
	        
	        Hotel hotel=null;
	        HotelDAO hotelDAO = (HotelDAO) this.getBean(request,"HotelDAO"); 
	        hotel = hotelDAO.findById(currentForm.getIdHotel());
	        object.setHotel(hotel);
	        
	        Cliente cliente=null;
	        ClienteDAO clienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO"); 
	        cliente = clienteDAO.findById(currentForm.getCodCliente());
	        object.setCliente(cliente);
	        
	        object.setCalculoubicacion(currentForm.getCalculoubicacion());
	        object.setFecha(DateUtils.getFechaFormateada(currentForm.getFecha(),"dd-MM-yyyy"));
	        object.setHora(DateUtils.getFechaFormateada(currentForm.getHora(),"HH:mm"));
	        object.setEstado(currentForm.getEstado());
	        object.setIdUsuario(currentForm.getIdUsuario());
	        object.setObservaciones(currentForm.getObservaciones());
	        object.setDireccion(currentForm.getDireccion());
	        object.setTelefono(currentForm.getTelefono());
	        object.setEntreCalles(currentForm.getEntreCalles());
	        object.setLocalidad(currentForm.getLocalidad());
	        object.setLatitud(currentForm.getLatitud());
	        object.setLongitud(currentForm.getLongitud());
	        
	        currentForm.reset(mapping, request);
			ReservaDAO.save(object);
			// Finalizamos la transaccion	
			this.commitTransactionSpring(request);	
			
	        log.debug("saveProcess--");
	        return findData(mapping, form, request, response);
	    }

	    
	    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.inspect(mapping, form, request, response);
	        log.debug("Procesando inspect action");
	        ReservaForm currentForm = (ReservaForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Reserva object = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        object = ReservaDAO.findById(selectedId.intValue());
	        currentForm.setIdReserva(object.getIdReserva());
	        if (object.getFlota()!=null)
	        	currentForm.setFlota(object.getFlota());
	        if (object.getHotel()!=null)
	        currentForm.setHotel(object.getHotel());
	        currentForm.setCliente(object.getCliente());
	        currentForm.setCalculoubicacion(object.getCalculoubicacion());
	        currentForm.setFecha(DateUtils.getFechaFormateada(object.getFecha(),"dd-MM-yyyy"));
	        currentForm.setHora(DateUtils.getFechaFormateada(object.getHora(),"HH:mm"));
	        currentForm.setEstado(object.getEstado());
	        currentForm.setIdUsuario(object.getIdUsuario());
	        currentForm.setUsuario(object.getUsuario());
	        currentForm.setObservaciones(object.getObservaciones());
	        currentForm.setDireccion(object.getDireccion());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setEntreCalles(object.getEntreCalles());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setLatitud(object.getLatitud());
	        currentForm.setLongitud(object.getLongitud());
	        currentForm.setReqCode("inspect");
	        return mapping.findForward("success");
	    }

	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");

	        ReservaForm currentForm = (ReservaForm)form;
	        currentForm.reset(mapping, request);
	        log.debug("Seteando en modo EDIT");
	        currentForm.setReqCode("find");
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return mapping.findForward("findPage");
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        
	        ReservaForm currentForm = (ReservaForm)form;    
	        Reserva object = new Reserva();
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        
	        UsuarioDAO un_UsuarioDAO = (UsuarioDAO) this.getBean(request,"UsuarioDAO");
	        request.setAttribute("usuarios",  un_UsuarioDAO.findAll()); 
	        
	        int i=ReservaDAO.findByReservasVencidas( getJDBCConnection() );
	        if (i!=0) {
	        	currentForm.setIdReserva(i);
	        	currentForm.setSelectedId(new Long(i));
	        	try {
	        		ActionMessages mensajes = new ActionMessages();
	        		ActionMessage unMensaje=  new ActionMessage("ReservaForm.ReservasVencidas.msg.asignar");
	        		mensajes.add("mensaje",unMensaje);
	        		request.setAttribute(ActionMessages.GLOBAL_MESSAGE ,mensajes);
					return edit(mapping, currentForm, request, response);
				} catch (HibernateException e) {}
	        }
	        
	        i=ReservaDAO.findByReservasporVencerse( getJDBCConnection() );
	        if (i!=0) {
	        		ActionMessages mensajes = new ActionMessages();
	        		ActionMessage unMensaje=  new ActionMessage("ReservaForm.ReservasVencidas.msg.porasignar");
	        		mensajes.add("mensaje",unMensaje);
	        		request.setAttribute(ActionMessages.GLOBAL_MESSAGE ,mensajes);
	        }
	        
	        ReservaDAO.actualizarReservasRealizadas(getJDBCConnection() );
	        
	        object.setUsuario(currentForm.getUsuario()); 
	   
	        object.setCliente(currentForm.getCliente());
	        //object.setEntreCalles(currentForm.getCliente().getNumDoc());
	        object.setEstado(currentForm.getEstado());
	        object.setDireccion(currentForm.getDireccion()); 
	        object.setFlota(currentForm.getFlota()); 
	        //object.setLocalidad(currentForm.getFlota().getLicencia());
	        
	        if (object.getEstado()==null)
	        	object.setEstado("En proceso/A realizar"); 
	        	
	        request.setAttribute("foundResults", ReservaDAO.findByGUIPosibilities(object));
	        currentForm.setReqCode("findData");
	        currentForm.reset(mapping, request);
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        log.debug("findData--");
	        return mapping.findForward("findPage");
	    }

	    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("delete++");
	        ReservaForm currentForm = (ReservaForm)form;
	        Long selectedId = getSelectedId(currentForm, new Long(currentForm.getIdReserva()));
	        Reserva object = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        object = ReservaDAO.findById(selectedId.intValue());
	        ReservaDAO.delete(object);
	        log.debug("delete--");
	        currentForm.setReqCode("delete");
	        currentForm.reset(mapping, request);
	        return findData(mapping, form, request, response);
	    }


	    private void storeLookups(HttpServletRequest request) {
	    	ReservaDAO reservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO"); 
	        request.setAttribute("grupoCollection",     reservaDAO.findAll());
	        log.debug("storeLookups--");        
	
	        
	    }

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}
	    
	    
}
