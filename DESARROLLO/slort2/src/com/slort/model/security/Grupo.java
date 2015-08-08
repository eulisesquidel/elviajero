package com.slort.model.security;

import java.util.List;
import java.util.Set;

import com.slort.model.EntityBase;

public class Grupo extends EntityBase {

    public Grupo() {
    }

    public Grupo(Long id) {
        setIdGrupo(id);
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setIdGrupo(Long i) {
        idGrupo = i;
    }

    public void setLongDesc(String string) {
        longDesc = string;
    }

    public void setShortDesc(String string) {
        shortDesc = string;
    }
    
    public Set getOpcionesmenues() {
		return opcionesmenues;
	}

	public void setOpcionesmenues(Set opcionesmenues) {
		this.opcionesmenues = opcionesmenues;
	}

	private Set opcionesmenues;
	private Long idGrupo;
    private String shortDesc;
    private String longDesc;
}