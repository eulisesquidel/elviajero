package com.bdb.model.security;


public interface User {

    public abstract Long getIdUser();

    public abstract String getNombre();

    public abstract void setIdUser(Long long1);

    public abstract void setNombre(String s);

    public abstract String getApellido();

    public abstract String getEmail();

    public abstract String getPwd();

    public abstract String getTelefono();

    public abstract String getUsuario();

    public abstract void setApellido(String s);

    public abstract void setEmail(String s);

    public abstract void setPwd(String s);

    public abstract void setTelefono(String s);

    public abstract void setUsuario(String s);

    /* public abstract Set getMenues();

    public abstract void setMenues(Set set);*/

    /* public abstract Hashtable getGrupos();
    public abstract void setGrupos(Hashtable hashtable);
    public abstract boolean hasGrupo(String s);
    
    */
}