/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MSI GAMING
 */
public class konfigurasi {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException{
        try{
            String url="jdbc:mysql://localhost/uaspraktikum";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            System.err.println("koneksi gagal "+e.getMessage());
        }
        return MySQLConfig;
    }
}

