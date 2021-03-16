/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neagu
 */


import java.sql.Connection;
import java.sql.DriverManager;




public class javaconnect {
    //metoda care creeaza conexiunea
    public static Connection ConnecrDb(){
        
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //se initializeaza conectorul JAR
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appjava","root","");//se conecteaza la baza de date
            
        } catch(Exception ex){
            System.out.println(ex.getMessage());//se trateaza eventualele exceptii
        }
        
        return con; //se returneaza conexiunea
    }
    
}

