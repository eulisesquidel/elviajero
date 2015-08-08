
package com.slort.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import java.io.*;

import com.slort.struts.form.StrutsUploadAndSaveForm;
import com.slort.util.JExcel;
/**
 * @author Eulises Quidel
 * @Web http://www.slort.com.ar
 * @Email quidele@slort.com.ar
 */

/**
 * Struts File Upload Action Form.
 *
 */
public class StrutsUploadAndSaveAction extends Action
{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		StrutsUploadAndSaveForm myForm = (StrutsUploadAndSaveForm)form;

		// Process the FormFile
		FormFile myFile = myForm.getTheFile();
		String contentType = myFile.getContentType();
		String fileName    = myFile.getFileName();
		int fileSize       = myFile.getFileSize();
		/* byte[] fileData    = myFile.getFileData();*/

		//Get the servers upload directory real path name
		String filePath = getServlet().getServletContext().getRealPath("/") +"upload";
		/* Save file on the server */
		if(!fileName.equals("")){  
			System.out.println("Server path:" +filePath);
			//Create file
			File fileToCreate = new File(filePath, fileName);
			//If file does not exists create file                      
			//if(!fileToCreate.exists()){
				FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
				fileOutStream.write(myFile.getFileData());
				fileOutStream.flush();
				fileOutStream.close();
			//}
		}

		
		JExcel myXLS= new JExcel();
		myXLS.leerArchivo(filePath +"\\"+fileName );
		while (myXLS.proximaFila()){
			if (myXLS.proximaColumna()){ // leyendo el legajo
				System.out.print(" LEGAJO: " + myXLS.getValor());
			}
			if (myXLS.proximaColumna()){ // leyendo el importe
				System.out.println(" IMPORTE: " + myXLS.getValor());
			}
		}
		//Set file name to the request object
		request.setAttribute("fileName",fileName);

		System.out.println("contentType: " + contentType);
		System.out.println("File Name: " + fileName);
		System.out.println("File Size: " + fileSize);

		return mapping.findForward("success");
	}
}
