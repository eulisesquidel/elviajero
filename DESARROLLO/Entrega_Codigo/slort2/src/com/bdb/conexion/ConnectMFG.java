package com.bdb.conexion;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectMFG {

    private static final Logger log;
	static  {
        log = Logger.getLogger(com.bdb.conexion.AdmConexiones.class);
    }
	
	static Connection con=null;
	
    public  ConnectMFG(Conexion conexion) {
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
       

   public Connection getConnection(){
	   return con; 
   }
   
}