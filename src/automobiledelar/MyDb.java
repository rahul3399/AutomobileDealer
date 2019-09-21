/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledelar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class MyDb {
    public static String utype="";
     public static Connection con;
    static String Sel;
    public static Connection getCon()
    {   
        try 
        {
             
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/auto","root","root");
        
        return con;
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
    

