package com.bdb.conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectRRHH {

    private static final Logger log;
	static  {
        log = Logger.getLogger(com.bdb.conexion.AdmConexiones.class);
    }
	
	static Connection con=null;
	
    public  ConnectRRHH(Conexion conexion) {
    	// creamos la conexión
        try {
            Class.forName(conexion.getDriver());
            con = DriverManager.getConnection(conexion.getUrl() ,conexion.getUsuario() , conexion.getPassword());
            if(con != null)
                System.out.println("Connection Successful!");
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error Trace in getConnection() : " + e.getMessage());
        }        
    }

    public static void closeConnection()  {
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
       
   public boolean executeDotacion(int p_mes,int p_anio){
	   try {
		    CallableStatement call= con.prepareCall("{call spu_procesarDotacion(?,?)}");
		    call.setInt(1, p_mes);
		    call.setInt(2, p_anio);
		    call.execute(); 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return true; 
   }
   
   public Connection getConnection(){
	   return con; 
   }
   
}