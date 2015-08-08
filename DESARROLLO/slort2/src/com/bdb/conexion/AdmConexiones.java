package com.bdb.conexion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.bdb.model.hibernate.helper.FindDataObjectSet;
import com.bdb.util.SQLUtils;
import net.sf.hibernate.Session;


public class AdmConexiones {

    private static final Logger log;
    static  {
        log = Logger.getLogger(com.bdb.conexion.AdmConexiones.class);
    }
    
	private Session hibSession;
	private String  ambiente;
	private List<Conexion>  conexiones;

	// constructor 
	public AdmConexiones(Session phsession, String pambiente) {
		this.hibSession = phsession;
		this.ambiente = pambiente;
		// obtener las conexiones del ambiente que se esta ejecutando 
		getConexiones();
		
	}
	
	private void getConexiones(){
        Vector arguments = new Vector();
        arguments.add((new Object[] {"ambiente", "=", ambiente , SQLUtils.QUERY_DATATYPE_STRING}));
        FindDataObjectSet findDataSet = new FindDataObjectSet();
        conexiones = findDataSet.getDataObjectSet(hibSession, "Conexion", arguments);        
        return; 
	}
	
	public Conexion getConexion(String nombreConexion){
		for (Conexion conexion : conexiones) {
			if (conexion.getNombre().trim().compareToIgnoreCase(nombreConexion.trim())==0){
				return conexion; 
			}
		}
		log.error("METHOD: getConexion / MESSAGE: the connection name is unknown: "+ nombreConexion);
		return null; 
	}
	
	
}
