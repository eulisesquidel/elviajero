package com.bdb.conexion;


/**
 * Conexiones generated by MyEclipse Persistence Tools
 */


public class Conexion  implements java.io.Serializable {


    // Fields    

     private Integer idConexion;
     private String nombre;
     private String url;
     private String usuario;
     private String password;
     private String ambiente;
     private String driver;


    // Constructors

    public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	/** default constructor */
    public Conexion() {
    }

	/** minimal constructor */
    public Conexion(Integer idConexion) {
        this.idConexion = idConexion;
    }
    
    /** full constructor */
    public Conexion(Integer idConexion, String nombre, String url, String usuario, String password, String ambiente) {
        this.idConexion = idConexion;
        this.nombre = nombre;
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        this.ambiente = ambiente;
    }

   
    // Property accessors

    public Integer getIdConexion() {
        return this.idConexion;
    }
    
    public void setIdConexion(Integer idConexion) {
        this.idConexion = idConexion;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAmbiente() {
        return this.ambiente;
    }
    
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
   

}