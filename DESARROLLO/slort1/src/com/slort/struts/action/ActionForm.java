package com.slort.struts.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.bdb.struts.action.BDBActionForm;

/**
 * @author Diego
 */
public class ActionForm extends BDBActionForm {
    private Long selectedId;
    private String reqCode;
    
    public ActionForm() {
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.selectedId = null;
        super.reset(mapping, request);
    }

    public String getReqCode() {
        return this.reqCode;
    }

    public Long getSelectedId() {
        return this.selectedId;
    }

    public void setReqCode(String newReqCode) {
        this.reqCode = newReqCode;
    }

    public void setSelectedId(Long newSelectedId) {
        this.selectedId = newSelectedId;
    }


}