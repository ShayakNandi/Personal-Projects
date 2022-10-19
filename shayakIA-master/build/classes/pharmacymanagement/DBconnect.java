/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aarog
 */
public class DBconnect {
    public static Connection Testdb(){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:pharmacy.db");
            System.out.println("Connected!");        
            return con;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
