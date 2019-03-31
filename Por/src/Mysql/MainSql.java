/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Por
 */
public class MainSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection dataCon;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            dataCon=DriverManager.getConnection("jdbc:mysql://localhost/dbpor","root","123");
            Statement s=dataCon.createStatement(1004,1008);
            ResultSet r=s.executeQuery("sql cmd");
            
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
