package cit285.bookstore2.config;
 import java.sql.*;
   import java.util.*;


   public class ConnectionManager {

      static Connection con;
      static String url;
            
      public static Connection getConnection()
      {
        
         try
         {
          String url = "jdbc:odbc:" + "bookstore"; 
            // assuming "DataSource" is your DataSource name

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try
            {            	
               con = DriverManager
       				.getConnection("jdbc:mysql://localhost:3306/bookstore","root","1510");
                								
            // assuming your SQL Server's	username is "username"               
            // and password is "password"
                 
            }
            
            catch (SQLException ex)
            {
               ex.printStackTrace();
            }
         }

         catch(ClassNotFoundException e)
         {
            System.out.println(e);
         }

      return con;
}
   }
