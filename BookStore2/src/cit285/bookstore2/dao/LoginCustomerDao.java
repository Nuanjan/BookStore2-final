package cit285.bookstore2.dao;
import java.text.*;
import java.util.*;

import cit285.bookstore2.config.*;
import cit285.bookstore2.domain.*;

import java.sql.*;

public class LoginCustomerDao 	
{
   static Connection currentCon = null;
   static ResultSet rs = null;  
	

   public static LoginCustomer login(LoginCustomer loginCustomer) {
	
      //preparing some objects for connection 
      Statement stmt = null;    
	
      String email = loginCustomer.getEmail();    
      String password = loginCustomer.getPassword();   
	    
      String searchQuery =
            "select email, password from logincustomer where email ='"
                     + email
                     + "' AND password = '"
                     + password
                     + "'";
	    
   // "System.out.println" prints in the console; Normally used to trace the process
   System.out.println("Your user email is " + email);          
   System.out.println("Your password is " + password);
   System.out.println("Query: "+searchQuery);
	    
   try 
   {
      //connect to DB 
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      rs = stmt.executeQuery(searchQuery);	        
      boolean more = rs.next();
	       
      // if user does not exist set the isValid variable to false
      if (!more) 
      {
         System.out.println("Sorry, you are not a registered user! Please sign up first");
         loginCustomer.setValid(false);
      } 
	        
      //if user exists set the isValid variable to true
      else if (more) 
      {
        
         System.out.println("Welcome " + email);
         loginCustomer.setEmail(email);
         loginCustomer.setValid(true);
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
   finally 
   {
      if (rs != null)	{
         try {
            rs.close();
         } catch (Exception e) {}
            rs = null;
         }
	
      if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
            stmt = null;
         }
	
      if (currentCon != null) {
         try {
            currentCon.close();
         } catch (Exception e) {
         }

         currentCon = null;
      }
   }

return loginCustomer;
	
   }	
}