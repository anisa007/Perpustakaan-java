/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_proyek_pbo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author sony
 */
public class Koneksi_Database {
    
    private static String Username = "root" , password = "" , servername = "localhost";
    private static String dbname = "perpus";
    private Integer port = 3306;
 
 //{}
    public static Connection getConnection(){
        Connection nyambung = null;
        
        MysqlDataSource data1 = new  MysqlDataSource();
        
        data1.setServerName(servername);
        data1.setUser(Username);
        data1.setPassword(password);
        data1.setDatabaseName(dbname);
        data1.setPortNumber(3306);
        
        try{
            nyambung = (Connection)data1.getConnection();
        } catch (SQLException ex){
            Logger.getLogger("get Connection -->" + Koneksi_Database.class.getName()).log(Level.SEVERE ,null, ex );
        }
        return nyambung;
        
}
    
}
