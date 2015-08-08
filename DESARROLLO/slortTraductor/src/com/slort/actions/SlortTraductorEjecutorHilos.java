package com.slort.actions;

import java.util.Iterator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slort.model.FlotaDAO;
import com.slort.model.Flota;
import com.slort.model.Ubicacionreal;
import com.slort.model.UbicacionrealDAO;
import com.slort.model.bdconector.AdmSpringBD;
import com.slort.traductores.FireEagleTraductor;
import com.slort.traductores.IpokiTraductor;

public class SlortTraductorEjecutorHilos {
	
    private ClassPathXmlApplicationContext applicationContext=null;

	public SlortTraductorEjecutorHilos(
			ClassPathXmlApplicationContext applicationContext) {
		super();
		this.applicationContext = applicationContext;
	}
    
	
	public boolean hacerTraducciones(){
		AdmSpringBD un_AdmSpringBD = new AdmSpringBD();
		un_AdmSpringBD.setApplicationContext(this.applicationContext);
		FlotaDAO miFlotaDAO = (FlotaDAO) un_AdmSpringBD.getBean("FlotaDAO");
		UbicacionrealDAO una_UbicacionrealDAO = (UbicacionrealDAO) un_AdmSpringBD.getBean("UbicacionrealDAO");
		for (Flota una_flota : 	miFlotaDAO.findByTraductor()) {
			FireEagleTraductor fireeagletraductor = new FireEagleTraductor();
			IpokiTraductor ipokiTraductor = new IpokiTraductor();
			
			try {
				un_AdmSpringBD.beginTransactionSpring();
				Ubicacionreal una_ubicacionReal =  una_UbicacionrealDAO.findByFlota(una_flota.getCodUnidad());
				if (una_ubicacionReal==null){
					una_ubicacionReal = new Ubicacionreal();
					una_ubicacionReal.setFlota(una_flota);
				}
				//Ubicacionreal una_nuevaubicacionReal= fireeagletraductor.traducir(una_flota, una_ubicacionReal);
				
				Ubicacionreal una_nuevaubicacionReal= ipokiTraductor.traducir(una_flota, una_ubicacionReal);
				
				if (una_nuevaubicacionReal!=null){
					una_ubicacionReal.setGpsactivo(una_nuevaubicacionReal.getGpsactivo());
					una_ubicacionReal.setSimulada(una_nuevaubicacionReal.getSimulada());
					una_ubicacionReal.setLatitud(una_nuevaubicacionReal.getLatitud());
					una_ubicacionReal.setLongitud(una_nuevaubicacionReal.getLongitud());
					una_ubicacionReal.setFecha(una_nuevaubicacionReal.getFecha());
					una_UbicacionrealDAO.save(una_ubicacionReal);
				}
					
		
				un_AdmSpringBD.commitTransactionSpring();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		return true;
	}
    
}
