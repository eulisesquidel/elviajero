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
import com.slort.struts.form.security.FlotaForm;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.UsuarioForm;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class FlotaAction extends SlortDispatchAction {

	   private static final Logger log;

	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public FlotaAction() {
	    }

	    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        FlotaForm currentForm = (FlotaForm)form;
	        storeLookups(request);
	        currentForm.setReqCode("create");
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        return super.create(mapping, form, request, response);
	    }

	    
	    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.edit(mapping, form, request, response);
	        log.debug("edit++");
	        FlotaForm currentForm = (FlotaForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Flota object = null;
	        FlotaDAO FlotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO");   ;
	        object = FlotaDAO.findById(selectedId.intValue());
	        /* obtenemos la flota y la presentamos en pantalla */ 
	        currentForm.setCodUnidad(object.getCodUnidad());
	        currentForm.setActivo(object.getActivo().equals(new Byte("1")));
	        currentForm.setUserYahoo(object.getUserYahoo());
	        currentForm.setPasswYahoo(object.getPasswYahoo());
	        currentForm.setNombre(object.getNombre());
	        currentForm.setApellido(object.getApellido());
	        currentForm.setDomicilio(object.getDomicilio());
	        currentForm.setCodPostal(object.getCodPostal());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setCargo(object.getCargo());
	        currentForm.setEmail(object.getEmail());
	        currentForm.setFechaAlta( DateUtils.getFechaFormateada(object.getFechaAlta(),"dd-MM-yyyy"));
	        currentForm.setFechaBaja(DateUtils.getFechaFormateada(object.getFechaBaja(),"dd-MM-yyyy"));
	        currentForm.setCuit(object.getCuit());
	        currentForm.setLicencia(object.getLicencia());
	        currentForm.setFechaModif(DateUtils.getFechaFormateada(object.getFechaModif(),"dd-MM-yyyy"));
	        currentForm.setFleliminado(object.getFleliminado());
	        
	        currentForm.setConsumerKeyYahoo(object.getConsumerKeyYahoo());
	        currentForm.setConsumerSecretYahoo(object.getConsumerSecretYahoo());
	        
	        
	        log.debug("edit--");
	        currentForm.setReqCode("edit");
	        return mapping.findForward("success");
	    }

	    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
	        super.saveProcess(mapping, form, request, response, isNew);
	        log.debug("saveProcess++");
	        FlotaForm currentForm = (FlotaForm)form;
	 
	        ActionErrors errors = getActionErrors(request);
	        if(!errors.isEmpty()) {
	            saveErrors(request, errors);
	            log.debug("storing lookups");
	            return mapping.findForward("failure");
	        }
     
	        Long selectedId = getSelectedId(currentForm, new Long (currentForm.getCodUnidad()));
	    
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
			
	        Flota object = null;
	        FlotaDAO FlotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO"); 
	        
	        if(!isNew) {
	        	object = FlotaDAO.findById(selectedId.intValue());
	        } else {
	            object = new Flota();   
	            object.setFechaAlta(DateUtils.getFechaActualasDate());
	        }
	        if (currentForm.isActivo())
	        	object.setActivo(new Byte("1"));
	        else 
	        	object.setActivo(new Byte("0"));
	        
	        object.setUserYahoo(currentForm.getUserYahoo());
	        object.setPasswYahoo(currentForm.getPasswYahoo());
	        object.setNombre(currentForm.getNombre());
	        object.setApellido(currentForm.getApellido());
	        object.setDomicilio(currentForm.getDomicilio());
	        object.setCodPostal(currentForm.getCodPostal());
	        object.setLocalidad(currentForm.getLocalidad());
	        object.setTelefono(currentForm.getTelefono());
	        object.setCargo(currentForm.getCargo());
	        object.setEmail(currentForm.getEmail());
	  
	        object.setFechaBaja(null);
	        object.setCuit(currentForm.getCuit());
	        object.setLicencia(currentForm.getLicencia());
	        object.setFechaModif(DateUtils.getFechaActualasDate());
	        object.setFleliminado(currentForm.getFleliminado());
	        object.setConsumerKeyYahoo( currentForm.getConsumerKeyYahoo());
	        object.setConsumerSecretYahoo( currentForm.getConsumerSecretYahoo());
	        
	        currentForm.reset(mapping, request);
			FlotaDAO.save(object);
			// Finalizamos la transaccion	
			this.commitTransactionSpring(request);	
			
	        log.debug("saveProcess--");
	        return findData(mapping, form, request, response);
	    }

	    
	    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.inspect(mapping, form, request, response);
	        log.debug("Procesando inspect action");
	        FlotaForm currentForm = (FlotaForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Flota object = null;
	        FlotaDAO FlotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO");
	        object = FlotaDAO.findById(selectedId.intValue());
	        currentForm.setCodUnidad(object.getCodUnidad());
	        currentForm.setActivo(object.getActivo().equals(new Byte("1")));
	        currentForm.setUserYahoo(object.getUserYahoo());
	        currentForm.setPasswYahoo(object.getPasswYahoo());
	        currentForm.setNombre(object.getNombre());
	        currentForm.setApellido(object.getApellido());
	        currentForm.setDomicilio(object.getDomicilio());
	        currentForm.setCodPostal(object.getCodPostal());
	        currentForm.setLocalidad(object.getLocalidad());
	        currentForm.setTelefono(object.getTelefono());
	        currentForm.setCargo(object.getCargo());
	        currentForm.setEmail(object.getEmail());
	        currentForm.setFechaAlta(DateUtils.getFechaFormateada(object.getFechaAlta(),"dd-MM-yyyy"));
	        currentForm.setFechaBaja(DateUtils.getFechaFormateada(object.getFechaBaja(),"dd-MM-yyyy"));
	        currentForm.setCuit(object.getCuit());
	        currentForm.setLicencia(object.getLicencia());
	        currentForm.setFechaModif(DateUtils.getFechaFormateada(object.getFechaModif(),"dd-MM-yyyy"));
	        currentForm.setFleliminado(object.getFleliminado());
	        currentForm.setConsumerKeyYahoo(object.getConsumerKeyYahoo());
	        currentForm.setConsumerSecretYahoo(object.getConsumerSecretYahoo());
	        
	        if(currentForm.getActivo()) {
	        	currentForm.setEsEliminar("Si");
	        } else {
	        	currentForm.setEsEliminar("No");   
	        }
	        currentForm.setReqCode("inspect");
	        return mapping.findForward("success");
	    }

	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");
	        FlotaForm currentForm = (FlotaForm)form;
	        currentForm.reset(mapping, request);
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return findData(mapping, form,request, response) ;
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        FlotaForm currentForm = (FlotaForm)form;    
	        Flota object = new Flota();
	        FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO");      
	        object.setNombre(currentForm.getNombre());
	        object.setApellido(currentForm.getApellido());
	        object.setLicencia(currentForm.getLicencia());        
	        request.setAttribute("foundResults", flotaDAO.findByGUIPosibilities(object));
	        currentForm.setReqCode("findData");
	        currentForm.reset(mapping, request);
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        log.debug("findData--");
	        return mapping.findForward("findPage");
	    }

	    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("delete++");
	        FlotaForm currentForm = (FlotaForm)form;
	        Long selectedId = getSelectedId(currentForm, new Long(currentForm.getCodUnidad()));
	        Flota object = null;
	        FlotaDAO FlotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO");
	        object = FlotaDAO.findById(selectedId.intValue());
	        List<Reserva> object2 = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        object2 = ReservaDAO.findByIdFlota(object);
	        if (object2.isEmpty()){
	        	FlotaDAO.delete(object);
	        	log.debug("delete--");
	        	currentForm.setReqCode("delete");
	        }
	        else
	        	{
	        	return mapping.findForward("failreserva");
	        	}
	        currentForm.reset(mapping, request);
	        return findData(mapping, form, request, response);
	    }

	    private void storeLookups(HttpServletRequest request) {
	    	FlotaDAO flotaDAO = (FlotaDAO) this.getBean(request,"FlotaDAO"); 
	        request.setAttribute("grupoCollection",     flotaDAO.findAll());
	        log.debug("storeLookups--");
	    }
	    
	    
}
