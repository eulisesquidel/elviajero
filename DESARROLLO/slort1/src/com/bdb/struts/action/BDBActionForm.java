package com.bdb.struts.action;

import com.bdb.util.HttpUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;

public class BDBActionForm extends ActionForm {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    public BDBActionForm() {
    }

    public final void validateRequired(ActionErrors errors, String property, Object value, boolean zeroIsEmpty) {
        HttpUtils.validateRequired(errors, property, value, zeroIsEmpty);
    }

    public final void validateRequired(ActionErrors errors, String property, Object value) {
        HttpUtils.validateRequired(errors, property, value, true);
    }
	
    public final void validateRequired(ActionErrors errors, String property, Object value, String valueAgregate) {
        HttpUtils.validateRequired(errors, property, value, true,valueAgregate);
    }
	
    public final void validateFloat(ActionErrors errors, String property, Object value) {
        HttpUtils.validateFloat(errors, property, value, false);
    }

    public final void validateEntero(ActionErrors errors, String property, Object value) {
        HttpUtils.validateEntero(errors, property, value, false);
    }
    
    
}