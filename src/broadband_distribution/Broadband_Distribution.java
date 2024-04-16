/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package broadband_distribution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Broadband_Distribution {
    public Connection connection;
    
     // public Connection connection;
            
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Broadband;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT name FROM Admin_of_ISP");
            
            
            while (resultSet.next()) {
                
                System.out.println("Admin_of_ISP :" + 
                        resultSet.getString("name"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

public static void main(String[] args) {
        // TODO code application logic here
         
      Broadband_Distribution cnObj = new Broadband_Distribution();
        cnObj.connectDB();
}
    
}
