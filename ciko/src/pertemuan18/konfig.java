/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan18;

import java.sql.*;
/**
 *
 * @author MSI GAMING
 */
public class konfig {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException{
        try{
            String url="jdbc:mysql://localhost/teori";
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
