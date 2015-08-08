package com.slort.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Cell;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.bdb.model.TwoObjects;

public class JExcel {

	private POIFSFileSystem fs;
	private HSSFWorkbook    wb;
	private HSSFSheet       sheet; 
	private int		        posfila=-1;
	private int		        poscolumna=-1;
	private HSSFRow			unaFila; 
	private HSSFRow 		row1;
	
	public String getValor(){
		return unaFila.getCell(poscolumna).toString();  
	}
	
	public boolean proximaFila(){
		posfila++;
		unaFila = sheet.getRow(posfila);
		poscolumna=-1;
		if (unaFila==null) 
			return false;
		else {
			return true;
		}
		
	}
	
	public boolean proximaColumna(){
		// validar si existe el valor en dicha columna
		poscolumna++;
		HSSFCell unaCelda = unaFila.getCell(poscolumna);
		if (unaCelda==null)
			return false;
		else 
			return true;
	}
	
	public boolean leerArchivo(String archivo){
		
		try {
		try {
			fs = new POIFSFileSystem(new FileInputStream(archivo));
			wb = new HSSFWorkbook(fs); 
			sheet = wb.getSheetAt(0);  
			row1 = sheet.getRow(0); 
			
			int minColIx = row1.getFirstCellNum();
			HSSFCell b2 = row1.getCell(minColIx);
			HSSFCell bprueba = row1.getCell(2);
			HSSFCell c2 = row1.getCell(1);
			System.out.println(b2.toString());
			System.out.println(c2.toString());
			System.out.println(bprueba);
			
		} catch (FileNotFoundException e) { e.printStackTrace(); return false;};
		} catch (IOException e) { e.printStackTrace();  return false; };	
		return true;
	}

	public int getPosfila() {
		return posfila;
	}

	public void setPosfila(int posfila) {
		this.posfila = posfila;
	}

	public int getPoscolumna() {
		return poscolumna;
	}

	public void setPoscolumna(int poscolumna) {
		this.poscolumna = poscolumna;
	}
	
	@SuppressWarnings("unchecked")
	public boolean exportarArray(ArrayList arraydatos, String archivo){
		
		try {
		try {
			fs = new POIFSFileSystem(new FileInputStream(archivo));
			wb = new HSSFWorkbook(fs); 
			
			sheet = wb.getSheetAt(0);  
			int i=1;
			for (Iterator iterator = arraydatos.iterator(); iterator.hasNext();) {
				ArrayList fila = (ArrayList) iterator.next();
				row1 = sheet.getRow(i);	
				int j=0;
				for (Object celda : fila) {
					row1.createCell(j).setCellFormula(celda.toString());
				}
			}
			return true;
			
		} catch (FileNotFoundException e) { e.printStackTrace(); return false;}
		} catch (IOException e) { e.printStackTrace();  return false;} 
		
	}
	
	public boolean exportarArrayList(ArrayList arraydatos, HttpServletResponse response, String nombreArchivo ){
		
			try {
			try {
			wb = new HSSFWorkbook();
			sheet= wb.createSheet();

		    // Create a row and put some cells in it. Rows are 0 based.
		    //row1 = sheet.createRow(0);
		    // Create a cell and put a value in it.
		    //HSSFCell celda = 
		    //celda.setCellValue(1245);
		    
		    int i=0;
		    for (Iterator iterator = arraydatos.iterator(); iterator.hasNext();i++) {
				ArrayList fila = (ArrayList) iterator.next();
				row1 = sheet.createRow(i);	
				int j=0;
				for (Object dato : fila) {
					TwoObjects tipovalor=(TwoObjects) dato;
					if (tipovalor.getObject1().equals("Texto")){
						row1.createCell(j).setCellValue(new HSSFRichTextString(tipovalor.getObject2().toString()));
					}
					if (tipovalor.getObject1().equals("Numerico")){
						row1.createCell(j).setCellValue( new Float(tipovalor.getObject2().toString()));
					}
					j++;
				}
			}
		    
		    // Write the output to a file
		    //FileOutputStream fileOut = new FileOutputStream(archivo);
		    //wb.write(fileOut);
		    //fileOut.close();
		    
		    OutputStream out = response.getOutputStream();
		    // SET THE MIME TYPE
            response.setContentType("application/vnd.ms-excel");
            // set content dispostion to attachment in 
            // case the open/save dialog needs to appear
            response.setHeader("Content-disposition", "inline; filename="+ nombreArchivo );
            wb.write(out);
            out.flush();
            out.close();
               
			} catch (FileNotFoundException e) {  e.printStackTrace();}
			} catch (IOException e) { e.printStackTrace();}
		    return true; 
		                    
	}
}
