package com.slort.struts.form;

import org.apache.struts.action.*;
import org.apache.struts.upload.FormFile;



/**
 * @author Slort
 * @Web http://www.slort.com.ar
 */

/**
 * Form bean for Struts File Upload.
 *
 */
public class StrutsUploadAndSaveForm extends ActionForm
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5528624583568003861L;
	private FormFile theFile;

	/**
	 * @return Returns the theFile.
	 */
	public FormFile getTheFile() {
		return theFile;
	}
	/**
	 * @param theFile The FormFile to set.
	 */
	public void setTheFile(FormFile theFile) {
		this.theFile = theFile;
	}
}