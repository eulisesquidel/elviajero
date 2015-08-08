package com.slort.struts.action.security;

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
import com.slort.model.Cliente;
import com.slort.model.ClienteDAO;
import com.slort.model.Flota;
import com.slort.model.FlotaDAO;
import com.slort.model.OpcionmenuDAO;
import com.slort.model.Perfil;
import com.slort.model.PerfilDAO;
import com.slort.model.Reserva;
import com.slort.model.ReservaDAO;
import com.slort.model.Usuario;
import com.slort.model.UsuarioDAO;
import com.slort.struts.action.SlortDispatchAction;
import com.slort.struts.form.security.ClienteForm;
import com.slort.struts.form.security.FlotaForm;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.ReservaForm;
import com.slort.struts.form.security.UsuarioForm;
import com.slort.util.Numbers;
import javax.swing.JOptionPane;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class ClienteAction extends SlortDispatchAction {

	   private static final Logger log;

	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public ClienteAction() {
	    }

	    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        ClienteForm currentForm = (ClienteForm)form;
	        storeLookups(request);
	        currentForm.setReqCode("create");
	        currentForm.setProvienedeReserva(request.getParameter("provienedeReserva"));
	        currentForm.setAltaReserva(request.getParameter("altaReserva"));
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        return super.create(mapping, form, request, response);
	    }

	    
	    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.edit(mapping, form, request, response);
	        log.debug("edit++");
	        ClienteForm currentForm = (ClienteForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Cliente object = null;
	        ClienteDAO ClienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO");   ;
	        object = ClienteDAO.findById(selectedId.intValue());
	        /* obtenemos el Cliente y la presentamos en pantalla */ 
	        currentForm.setCodCliente(object.getCodCliente());
	        currentForm.setTipoCliente(object.getTipoCliente());
	        currentForm.setNombre(object.getNombre());
	        currentForm.setApellido(object.getApellido());
	        currentForm.setRazonsocial(object.getRazonsocial());
	        currentForm.setDomicilio(object.getDomicilio());
	        currentForm.setCodPostal(object.getCodPostal());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setCargo(object.getCargo());
	        currentForm.setEmail(object.getEmail());
	        currentForm.setFechaAlta(DateUtils.getFechaFormateada(object.getFechaAlta(),"dd-MM-yyyy"));
            currentForm.setFechaBaja(DateUtils.getFechaFormateada(object.getFechaBaja(),"dd-MM-yyyy"));
	        currentForm.setTipoDocu(object.getTipoDocu());
	        currentForm.setNumDoc(object.getNumDoc().toString());
	        currentForm.setEstado(object.getEstado());
	        currentForm.setFechaModif(DateUtils.getFechaFormateada(object.getFechaModif(),"dd-MM-yyyy"));
	        currentForm.setFleliminado(object.getFleliminado());
	        
	        log.debug("edit--");
	        currentForm.setReqCode("edit");
	        return mapping.findForward("success");
	    }

	    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
	        super.saveProcess(mapping, form, request, response, isNew);
	        log.debug("saveProcess++");
	        ClienteForm currentForm = (ClienteForm)form;
	 
	        ActionErrors errors = getActionErrors(request);
	        if(!errors.isEmpty()) {
	            saveErrors(request, errors);
	            log.debug("storing lookups");
	            return mapping.findForward("failure");
	        }
     
	        Long selectedId = getSelectedId(currentForm, new Long (currentForm.getCodCliente()));
	    
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
			
	        Cliente object = null;
	        ClienteDAO ClienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO"); 
	        
	        if(!isNew) {
	        	object = ClienteDAO.findById(selectedId.intValue());
	        } else {
	            object = new Cliente();
	            object.setFechaAlta(DateUtils.getFechaActualasDate());
	        }
	
	        object.setTipoCliente(currentForm.getTipoCliente());
	        object.setNombre(currentForm.getNombre());
	        object.setApellido(currentForm.getApellido());
	        object.setRazonsocial(currentForm.getRazonsocial());
	        object.setDomicilio(currentForm.getDomicilio());
	        object.setCodPostal(currentForm.getCodPostal());
	        object.setLocalidad(currentForm.getLocalidad());
	        object.setTelefono(currentForm.getTelefono());
	        object.setCargo(currentForm.getCargo());
	        object.setEmail(currentForm.getEmail());
	        object.setFechaBaja(null);
	        object.setTipoDocu(currentForm.getTipoDocu());
	        object.setNumDoc(currentForm.getNumDoc());
	        object.setEstado(currentForm.getEstado());
	        object.setFechaModif(DateUtils.getFechaActualasDate());
	        object.setFleliminado(new Byte("0"));
	        currentForm.reset(mapping, request);

			ClienteDAO.save(object);
			// Finalizamos la transaccion	
			
			Reserva una_Reserva = null;
			  
			if ((currentForm.getProvienedeReserva().compareTo("SI")==0) &&
				(currentForm.getAltaReserva().compareTo("NO")==0))  
				{
					Integer idReserva = new Integer (currentForm.getIdReserva());
			        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");   
			        una_Reserva = ReservaDAO.findById( idReserva);	   
			        una_Reserva.setCliente(object);
			        ReservaDAO.save(una_Reserva);
			}
			
			this.commitTransactionSpring(request);	
			
			 log.debug("saveProcess--");
			if  (currentForm.getProvienedeReserva().compareTo("SI")==0) {
				
				if   (una_Reserva!=null){
					
					request.setAttribute("selectedId", una_Reserva.getIdReserva().toString());
					request.setAttribute("cliente",object);
					return mapping.findForward("returnReservaEdit");
				}else{
					request.setAttribute("selectedId", null);
					request.setAttribute("cliente",object);
					return mapping.findForward("returnReservaNew");
				}	
			} else
				return findData(mapping, form, request, response);
	        
	        
	    }

	    
	    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.inspect(mapping, form, request, response);
	        log.debug("Procesando inspect action");
	        ClienteForm currentForm = (ClienteForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Cliente object = null;
	        ClienteDAO ClienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO");
	        object = ClienteDAO.findById(selectedId.intValue());
	        currentForm.setCodCliente(object.getCodCliente());
	        currentForm.setTipoCliente(object.getTipoCliente());
	        currentForm.setNombre(object.getNombre());
	        currentForm.setApellido(object.getApellido());
	        currentForm.setRazonsocial(object.getRazonsocial());
	        currentForm.setDomicilio(object.getDomicilio());
	        currentForm.setCodPostal(object.getCodPostal());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setCargo(object.getCargo());
	        currentForm.setEmail(object.getEmail());
	        currentForm.setFechaAlta(DateUtils.getFechaFormateada(object.getFechaAlta(),"dd-MM-yyyy"));
	        currentForm.setFechaBaja(DateUtils.getFechaFormateada(object.getFechaBaja(),"dd-MM-yyyy"));
	        currentForm.setTipoDocu(object.getTipoDocu());
	        currentForm.setNumDoc(object.getNumDoc().toString());
	        currentForm.setEstado(object.getEstado());
	        currentForm.setFechaModif(DateUtils.getFechaFormateada(object.getFechaModif(),"dd-MM-yyyy"));
	        currentForm.setFleliminado(object.getFleliminado());
	        currentForm.setReqCode("inspect");
	        return mapping.findForward("success");
	    }

	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");

	        ClienteForm currentForm = (ClienteForm)form;
	        currentForm.reset(mapping, request);
	        log.debug("Seteando en modo EDIT");
	        currentForm.setReqCode("find");
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return mapping.findForward("findPage");
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        ClienteForm currentForm = (ClienteForm)form; 
	        Cliente object = new Cliente();
	        ClienteDAO clienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO");      
	        object.setNombre(currentForm.getNombre());
	        object.setApellido(currentForm.getApellido());
	        if (Numbers.isNumber(currentForm.getNumDoc(), Integer.class))
	        	object.setNumDoc(currentForm.getNumDoc());
	        else 
	        	object.setNumDoc(null);      
	        request.setAttribute("foundResults", clienteDAO.findByGUIPosibilities(object));
	        currentForm.setReqCode("findData");
	        currentForm.reset(mapping, request);
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        log.debug("findData--");
	        return mapping.findForward("findPage");
	    }

	    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("delete++");
	        ClienteForm currentForm = (ClienteForm)form;
	        Long selectedId = getSelectedId(currentForm, new Long(currentForm.getCodCliente()));
	        Cliente object = null;
	        
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
			
	        ClienteDAO ClienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO");
	        object = ClienteDAO.findById(selectedId.intValue());
	        List<Reserva> object2 = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        // buscar por reservas pendientes
	        object2 = ReservaDAO.findByIdCliente(object);
	        if (object2.isEmpty()){
	           	object.setFleliminado(new Byte("1"));
	        	// determinar logica segun caso de uso
	        	ClienteDAO.save(object);
	        	// Finalizamos la transaccion	
				this.commitTransactionSpring(request);
	        	log.debug("delete--");
	        	currentForm.setReqCode("delete");
	        }
	        else
	        	{
	        	this.rollbackTransactionSpring(request);
	        	return mapping.findForward("failreserva");
	        	}
	        currentForm.reset(mapping, request);
	        return findData(mapping, form, request, response);
	    }


	    private void storeLookups(HttpServletRequest request) {
	    	ClienteDAO ClienteDAO = (ClienteDAO) this.getBean(request,"ClienteDAO"); 
	        request.setAttribute("grupoCollection",     ClienteDAO.findAll());
	        log.debug("storeLookups--");
	    }
	    
	    
}
