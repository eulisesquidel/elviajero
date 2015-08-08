package com.slort.model.security;

import java.util.*;

import com.slort.model.Opcionmenu;
import com.slort.model.OpcionmenuPerfil;
import com.slort.model.Perfil;

public class AdmPerfiles {
	
	public static ArrayList<OpcionDisponibleAsignada> obtenerOpcionMenuesDisponibles(List<Opcionmenu> todaslasOpiones, Set<OpcionmenuPerfil> opcionesasignadas  ){
		ArrayList<OpcionDisponibleAsignada> listaOpciones=new ArrayList<OpcionDisponibleAsignada>();	
	
		if (opcionesasignadas==null) {
			for (Opcionmenu opcionmenu : todaslasOpiones) {
		    		// mostrar todas las opciones y asignarle falso porque es nuevo perfil
		    		OpcionDisponibleAsignada opcionDisponible = new OpcionDisponibleAsignada();
		    		opcionDisponible.setAsignada( false);
		    		opcionDisponible.setOpcionmenu(opcionmenu);
		    		opcionDisponible.setOrden(0);
		    		listaOpciones.add(opcionDisponible);
				}
			return listaOpciones; 
		}
		
		boolean encontrado=false;
		
		for (Opcionmenu opcionmenu : todaslasOpiones) {
			encontrado=false;
    	//opcionesasignadas.
	    	for (OpcionmenuPerfil opcionmenuasignada : opcionesasignadas) {
	    		if  (opcionmenuasignada.getOpcionmenu().equals(opcionmenu)) {
	    	 		OpcionDisponibleAsignada opcionDisponible = new OpcionDisponibleAsignada();
	    	 		if (opcionmenuasignada.getOrden()==null)
	    	 			opcionDisponible.setOrden(0);	
	    	 		else
	    	 			opcionDisponible.setOrden(opcionmenuasignada.getOrden().intValue());
	    	 		opcionDisponible.setAsignada( opcionmenuasignada.getOpcionmenu().equals(opcionmenu));
		    		opcionDisponible.setOpcionmenu(opcionmenu);
		    		listaOpciones.add(opcionDisponible);
		    		encontrado = true;	
		    		continue;
	    		}
			}
	    	if (!encontrado) {
	    		OpcionDisponibleAsignada opcionDisponible = new OpcionDisponibleAsignada();
	    		opcionDisponible.setAsignada(encontrado);
	    		opcionDisponible.setOpcionmenu(opcionmenu);
	    		listaOpciones.add(opcionDisponible);
	    	}
		
		}		
		return listaOpciones; 
	
	}
	

	
}
