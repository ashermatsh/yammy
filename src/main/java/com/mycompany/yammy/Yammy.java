/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yammy;
import java.sql.*;
/**
 *
 * @author Asher
 */
public class Yammy {
    public static  Connection conn = null;

    public static void main(String[] args) {
        System.out.println("Application Starting.........");
       
        try {
            // Step 2: Establish the connection to the database.
            String url = "jdbc:mysql://localhost:3306/yammy?autoReconnect=true&useSSL=false";
            conn = DriverManager.getConnection(url, "root", "ashermysql");
            
        } catch (Exception e) {
          e.printStackTrace();
        }
        main_frame.display();
    }
}
