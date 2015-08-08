package com.bdb.conexion;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassicDriver {

    public ClassicDriver() {
    }

    public static void main(String argv[]) {
        String url = "jdbc:jtds:sqlserver://localhost/Slort";
        String login = "Slort";
        String password = "secret";
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            DriverManager.setLoginTimeout(10);
            Connection connection = DriverManager.getConnection(url, login, password);
            DatabaseMetaData conMD = connection.getMetaData();
            System.out.println("Driver Name:\t" + conMD.getDriverName());
            System.out.println("Driver Version:\t" + conMD.getDriverVersion());
            connection.setCatalog("Slort");
            Statement st = connection.createStatement();
            for(ResultSet rs = st.executeQuery("SELECT * FROM carreras"); rs.next(); System.out.println()) {
                for(int j = 1; j <= rs.getMetaData().getColumnCount(); j++)
                    System.out.print(rs.getObject(j) + "\t");

            }

            st.close();
            connection.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}