package com.slort.struts.action;

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

import com.slort.model.Hotel;
import com.slort.model.HotelDAO;
import com.slort.model.OpcionmenuDAO;
import com.slort.model.Perfil;
import com.slort.model.PerfilDAO;
import com.slort.model.Reserva;
import com.slort.model.ReservaDAO;
import com.slort.model.Usuario;
import com.slort.model.UsuarioDAO;
import com.slort.struts.action.SlortDispatchAction;
import com.slort.struts.form.HotelForm;
import com.slort.struts.form.security.PerfilForm;
import com.slort.struts.form.security.UsuarioForm;

import fr.improve.struts.taglib.layout.util.FormUtils;

public class HotelAction extends SlortDispatchAction {

	   private static final Logger log;

	    static  {
	        log = Logger.getLogger(com.slort.struts.action.security.UsuarioAction.class);
	    }
		
	    public HotelAction() {
	    }

	    public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("setting lookups");
	        HotelForm currentForm = (HotelForm)form;
	        storeLookups(request);
	        currentForm.setReqCode("create");
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        return super.create(mapping, form, request, response);
	    }

	    
	    public ActionForward edit(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.edit(mapping, form, request, response);
	        log.debug("edit++");
	        HotelForm currentForm = (HotelForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Hotel object = null;
	        HotelDAO HotelDAO = (HotelDAO) this.getBean(request,"HotelDAO");   ;
	        object = HotelDAO.findById(selectedId.intValue());
	        /* obtenemos la Hotel y la presentamos en pantalla */ 
	        currentForm.setIdHotel(object.getIdHotel());
	        currentForm.setNombre(object.getNombre());	        
	        log.debug("edit--");
	        currentForm.setReqCode("edit");
	        return mapping.findForward("success");
	    }

	    public ActionForward saveProcess(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, boolean isNew) throws HibernateException {
	        super.saveProcess(mapping, form, request, response, isNew);
	        log.debug("saveProcess++");
	        HotelForm currentForm = (HotelForm)form;
	        Long selectedId = getSelectedId(currentForm, new Long (currentForm.getIdHotel()));
	    
	    	// iniciamos la transaccion
			this.beginTransactionSpring(request);
			
	        Hotel object = null;
	        HotelDAO HotelDAO = (HotelDAO) this.getBean(request,"HotelDAO"); 
	        
	        if(!isNew) {
	        	object = HotelDAO.findById(selectedId.intValue());
	        } else {
	            object = new Hotel();    
	        }
	
	        object.setNombre(currentForm.getNombre());
	        currentForm.reset(mapping, request);
			HotelDAO.save(object);
			// Finalizamos la transaccion	
			this.commitTransactionSpring(request);	
			
	        log.debug("saveProcess--");
	        return findData(mapping, form, request, response);
	    }

	    
	    public ActionForward inspect(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws HibernateException {
	        super.inspect(mapping, form, request, response);
	        log.debug("Procesando inspect action");
	        HotelForm currentForm = (HotelForm)form;
	        Long selectedId = currentForm.getSelectedId();
	        currentForm.reset(mapping, request);
	        storeLookups(request);
	        Hotel object = null;
	        HotelDAO HotelDAO = (HotelDAO) this.getBean(request,"HotelDAO");
	        object = HotelDAO.findById(selectedId.intValue());
	        currentForm.setIdHotel(object.getIdHotel());
	        currentForm.setNombre(object.getNombre());	 
	        currentForm.setReqCode("inspect");
	        return mapping.findForward("success");
	    }

	    public ActionForward find(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
			if (response.equals(new String("A"))) {}
	        log.debug("Procesando find action");

	        HotelForm currentForm = (HotelForm)form;
	        currentForm.reset(mapping, request);
	        log.debug("Seteando en modo EDIT");
	        currentForm.setReqCode("find");
	        FormUtils.setFormDisplayMode(request, form,   FormUtils.EDIT_MODE);
	        return mapping.findForward("findPage");
	    }

	    public ActionForward findData(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("findData++");
	        HotelForm currentForm = (HotelForm)form; 
	        Hotel object = new Hotel();
	        HotelDAO HotelDAO = (HotelDAO) this.getBean(request,"HotelDAO");      
	        object.setNombre(currentForm.getNombre()); 
	        request.setAttribute("foundResults", HotelDAO.findByGUIPosibilities(object));
	        currentForm.setReqCode("findData");
	        currentForm.reset(mapping, request);
	        FormUtils.setFormDisplayMode(request, form, FormUtils.EDIT_MODE);
	        log.debug("findData--");
	        return mapping.findForward("findPage");
	    }

	    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
	        log.debug("delete++");
	        HotelForm currentForm = (HotelForm)form;
	        Long selectedId = getSelectedId(currentForm, new Long(currentForm.getIdHotel()));
	        Hotel object = null;
	        HotelDAO HotelDAO = (HotelDAO) this.getBean(request,"HotelDAO");
	        object = HotelDAO.findById(selectedId.intValue());
	        List<Reserva> object2 = null;
	        ReservaDAO ReservaDAO = (ReservaDAO) this.getBean(request,"ReservaDAO");
	        object2 = ReservaDAO.findByIdHotel(object);
	        if (object2.isEmpty()){
	        	HotelDAO.delete(object);
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
	    	HotelDAO HotelDAO = (HotelDAO) this.getBean(request,"HotelDAO"); 
	        request.setAttribute("grupoCollection",     HotelDAO.findAll());
	        log.debug("storeLookups--");
	    }
	    
	    
}