package com.bdb.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

// Referenced classes of package com.bdb.util:
//            BDBUtils

public class HttpUtils {
    private static final Logger log;
    public static final String STRUTS_ACTION_DELETE = "delete";
    public static final String STRUTS_ACTION_FIND = "find";
    public static final String STRUTS_ACTION_FIND_DATA = "findData";
    public static final String STRUTS_ACTION_SAVE = "save";
    public static final String STRUTS_ACTION_SAVE_NEW = "saveNew";
    public static final String STRUTS_ACTION_EDIT = "edit";
    public static final String STRUTS_ACTION_CREATE = "create";
    public static final String STRUTS_ACTION_INSPECT = "inspect";
    public static final String STRUTS_ACTION_LIST = "list";
    public static final String STRUTS_ACTION_GENERATE = "generate";
	public static final String STRUTS_ACTION_IMPRESION = "reimprimir";
	public static final String STRUTS_ACTION_GOOGLEMAP_VIEW = "googlemap_view";
	public static final String STRUTS_ACTION_GOOGLEMAP_DISTANCE = "googlemap_distance";
	public static final String STRUTS_ACTION_GOOGLEMAP_DISTANCE_LISTA = "googlemap_distance_lista";
	public static final String STRUTS_ACTION_CANCELAR_RESERVA = "cancelar_reserva";
	public static final String STRUTS_ACTION_REPORTE_EXCEL = "reporte_excel";
	
    static  {
        log = Logger.getLogger(com.bdb.util.HttpUtils.class);
    }

    public HttpUtils() {
    }

    public static final Object getNestedAttribute(HttpServletRequest request, ActionMapping mapping, String attributeName) {
        if(mapping.getScope().equals("request"))
            if(request.getParameter(attributeName) != null)
                return request.getParameter(attributeName);
            else
                return request.getAttribute(attributeName);
        if(mapping.getScope().equals("session"))
            return request.getSession().getAttribute(attributeName);
        else
            return null;
    }

    public static final Object getNestedAttribute(HttpServletRequest request, String attributeName, boolean findSession) {
        if(request.getParameter(attributeName) != null)
            return request.getParameter(attributeName);
        if(request.getAttribute(attributeName) != null)
            return request.getAttribute(attributeName);
        if(findSession && request.getSession().getAttribute(attributeName) != null)
            return request.getSession().getAttribute(attributeName);
        else
            return null;
    }

    public static final Object getNestedAttribute(HttpServletRequest request, String attributeName) {
        return getNestedAttribute(request, attributeName, false);
    }

    public static final void validateRequired(ActionErrors errors, String property, Object value, boolean zeroIsEmpty) {
        boolean hasError = false;
        if(errors == null) {
            log.error("El ActionErrors es nulo.");
            return;
        }
        if(value instanceof String)
            hasError = BDBUtils.isEmpty((String)value);
        else
        if(value instanceof Long)
            hasError = BDBUtils.isEmpty((Long)value, zeroIsEmpty);
        else
        if(value instanceof Integer) {
            hasError = BDBUtils.isEmpty((Integer)value, zeroIsEmpty);
        } else {
            log.error("Error en la Validacion");
            errors.add(property, new ActionError("Error en la Validacion"));
        }
        if(hasError)
            errors.add(property, new ActionError("app.form.required"));
    }
	
    public static final void validateRequired(ActionErrors errors, String property, Object value, boolean zeroIsEmpty, String valorAgregado) {
        boolean hasError = false;
        if(errors == null) {
            log.error("El ActionErrors es nulo.");
            return;
        }
        if(value instanceof String)
            hasError = BDBUtils.isEmpty((String)value);
        else
        if(value instanceof Long)
            hasError = BDBUtils.isEmpty((Long)value, zeroIsEmpty);
        else
        if(value instanceof Integer) {
            hasError = BDBUtils.isEmpty((Integer)value, zeroIsEmpty);
        } else {
            log.error("Error en la Validacion");
            errors.add(property, new ActionError("Error en la Validacion"));
        }
        if(hasError)
            errors.add(property, new ActionError("app.form.required",valorAgregado));
    }

    public static final void validateFloat(ActionErrors errors, String property, Object value, boolean zeroIsEmpty) {
        boolean hasError = false;
        if(errors == null) {
            log.error("El ActionErrors es nulo.");
            return;
        }
        if (BDBUtils.isEmpty((String)value)) return;
        if(value instanceof String) {
            // hasError = BDBUtils.isEmpty((String)value);
            if (!hasError) {
                try {
                    hasError = false;
                } catch (ClassCastException e) {hasError = true;}
                catch (NumberFormatException e2) {hasError = true;}
            }
        } else
        if(value instanceof Long)
            hasError = BDBUtils.isEmpty((Long)value, zeroIsEmpty);
        else
        if(value instanceof Integer) {
            hasError = BDBUtils.isEmpty((Integer)value, zeroIsEmpty);
        } else {
            log.error("Error en la Validacion");
            errors.add(property, new ActionError("Error en la Validacion"));
        }
        if(hasError) {
            errors.add(property, new ActionError("app.form.notValid"));
        }
    }
    
    public static final void validateEntero(ActionErrors errors, String property, Object value, boolean zeroIsEmpty) {
        boolean hasError = false;
        if(errors == null) {
            log.error("El ActionErrors es nulo.");
            return;
        }
        if (BDBUtils.isEmpty((Long)value)) return;
        if(value instanceof String) {
            // hasError = BDBUtils.isEmpty((String)value);
            if (!hasError) {
                try {
                    String test = (String)value;
                    Long test2 = new Long(test);
                    hasError = false;
                } catch (ClassCastException e) {hasError = true;}
                catch (NumberFormatException e2) {hasError = true;}
            }
        } else
        if(value instanceof Long) {
            hasError = BDBUtils.isEmpty((Long)value, zeroIsEmpty);
        } else {
            log.error("Error en la Validacion");
            errors.add(property, new ActionError("Error en la Validacion"));
        }
        if(hasError) {
            errors.add(property, new ActionError("app.form.notValid"));
        }
    }
}