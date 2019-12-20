package cit285.bookstore2.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;



import cit285.bookstore2.domain.RegisterCustomer;


public class RegisterCustomerDao {

	    public int registerCustomers(RegisterCustomer registerCustomer) throws ClassNotFoundException {
	   
	        String INSERT_REGISTER_SQL = "INSERT INTO registercustomer" +
	            "  ( firstname, lastname, email, password, confirmpassword, address1, address2, street, city, state, zipcode) VALUES " +
	            " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	      String INSERT_LOGIN_SQL = "INSERT INTO logincustomer" +
		            "  ( email, password, customerID) VALUES" +
	    		  "(?,?,?)";
	      
	        int result = 0;
	        int customerID =0;

	        Class.forName("com.mysql.jdbc.Driver");
ResultSet key = null;

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/bookstore","root","1510");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REGISTER_SQL,Statement.RETURN_GENERATED_KEYS)) {
	        	connection.setAutoCommit(false);
	        	
	        	preparedStatement.setString(1, registerCustomer.getFirstName());
	            preparedStatement.setString(2, registerCustomer.getLastName());
	            preparedStatement.setString(3, registerCustomer.getEmail());
	            preparedStatement.setString(4, registerCustomer.getPassword());
	            preparedStatement.setString(5, registerCustomer.getConfirmPass());
	            preparedStatement.setString(6, registerCustomer.getAddress1());
	            preparedStatement.setString(7, registerCustomer.getAddress2());
	            preparedStatement.setString(8, registerCustomer.getStreet());
	            preparedStatement.setString(9, registerCustomer.getCity());
	            preparedStatement.setString(10, registerCustomer.getState());
	            preparedStatement.setInt(11, registerCustomer.getZipcode());
	            result = preparedStatement.executeUpdate();
	            connection.commit();
	            key = preparedStatement.getGeneratedKeys();
	           
	            if(key.next()) {
	            	customerID = key.getInt(1);
	            }else {
	            	throw new SQLException("No generated section ID returned");
	            }
	            
	            try (
	    	            // Step 2:Create a statement using connection object
	    	            PreparedStatement statement= connection.prepareStatement(INSERT_LOGIN_SQL)) {
	            	statement.setString(1, registerCustomer.getEmail());
	            	statement.setString(2, registerCustomer.getPassword());
	            	statement.setInt(3, customerID);
	            	statement.execute();
	            	connection.commit();
	            }
	           

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return result;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}