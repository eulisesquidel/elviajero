package com.bdb.conexion;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Connect {

    public Connect() {
        con = null;
    }

    private String getConnectionUrl() {
        return "jdbc:jtds:sqlserver://RRHH/nexus_prue";
    }

    public Connection getConnection() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection(getConnectionUrl(), "sa", "euli3755");
            if(con != null)
                System.out.println("Connection Successful!");
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error Trace in getConnection() : " + e.getMessage());
        }
        return con;
    }

    public void displayDbProperties() {
        DatabaseMetaData dm = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            if(con != null) {
                dm = con.getMetaData();
                System.out.println("Driver Information");
                System.out.println("\tDriver Name: " + dm.getDriverName());
                System.out.println("\tDriver Version: " + dm.getDriverVersion());
                System.out.println("\nDatabase Information ");
                System.out.println("\tDatabase Name: " + dm.getDatabaseProductName());
                System.out.println("\tDatabase Version: " + dm.getDatabaseProductVersion());
                System.out.println("Avalilable Catalogs ");
                for(rs = dm.getCatalogs(); rs.next(); System.out.println("\tcatalog: " + rs.getString(1)));
                rs.close();
                rs = null;
                closeConnection();
            } else {
                System.out.println("Error: No active Connection");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        dm = null;
    }

    private void closeConnection() {
        try {
            if(con != null)
                con.close();
            con = null;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws Exception {
        Connect myDbTest = new Connect();
        myDbTest.displayDbProperties();
    }

    private Connection con;

//    private final String driver = "net.sourceforge.jtds.jdbc.Driver";
//    private final String url = "jdbc:jtds:sqlserver://";
//    private final String serverName = "localhost/";
//    private final String portNumber = "1433";
//    private final String databaseName = "slort";
//    private final String userName = "slort";
//    private final String password = "secret";
//    private final String selectMethod = "cursor";
}