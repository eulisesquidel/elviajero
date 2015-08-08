package com.slort.model.security;

// Application imports
import com.slort.model.EntityBase;

// Java imports
import java.util.Set;

public class OpcionMenu extends EntityBase implements Comparable {

    public OpcionMenu() {
    }

    public OpcionMenu(Long id) {
    	setIdOpcionMenu(id);
    }

    public Long getIdOpcionMenu() {
        return idOpcionmenu;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setIdOpcionMenu(Long i) {
        idOpcionmenu = i;
    }

    public void setLongDesc(String string) {
        longDesc = string;
    }

    public void setShortDesc(String string) {
        shortDesc = string;
    }

    public Set getGrupos() {
        return grupos;
    }

    public void setGrupos(Set set) {
        grupos = set;
    }

    private Long idOpcionmenu;
    private String shortDesc;
    private String longDesc;
    private Set grupos;
    private String link;
    
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		OpcionMenu otraOpcion=(OpcionMenu)arg0;
		return this.longDesc.compareToIgnoreCase(otraOpcion.longDesc); 
	} 
	
	
    
}