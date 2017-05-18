/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo1;

import java.sql.*;

public class JDBCDEMO1 {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:derby://localhost:1527/Person";
    //  Database credentials
   static final String USER = "APP";
   static final String PASS = " ";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
       
        try{//STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM DETAILS";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("PID");
         int age = rs.getInt("AGE");
         String name = rs.getString("PERSONNAME");
         String address = rs.getString("ADDRESS");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", NAME: " + name);
         System.out.print(", AGE: " + age);
         System.out.println(", ADDESSS: " + address);
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
      }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
    }
    
}
