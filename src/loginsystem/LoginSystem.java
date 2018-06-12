/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

import java.sql.Connection;
import java.sql.DriverManager;


public class LoginSystem {
    
    public static Connection conn(){
        
        Connection con = null;
        String url ="jdbc:mysql://localhost:3306/Loginsystems";
        String user ="root";
        String password = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
            
        
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        return con;
    }



    
}
