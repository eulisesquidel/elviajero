package com.slort.admin;


import java.util.List;


import com.slort.model.Ubicacionreal;
import com.slort.model.UbicacionrealDAO;




public class AdmFlota {
	
	private AdmSpringBD admSpringBD;
	
	public AdmSpringBD getAdmSpringBD() {
		return admSpringBD;
	}

	public void setAdmSpringBD(AdmSpringBD admSpringBD) {
		this.admSpringBD = admSpringBD;
	}

	public List<Ubicacionreal> ubicacionRealFlota(){
		
		UbicacionrealDAO una_UbicacionrealDAO = (UbicacionrealDAO) admSpringBD.getBean("UbicacionrealDAO");
		
		return una_UbicacionrealDAO.findByGoogleMapsView();


	}
	
}
