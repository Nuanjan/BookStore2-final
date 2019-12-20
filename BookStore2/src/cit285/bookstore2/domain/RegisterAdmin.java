package cit285.bookstore2.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


	
	


public class RegisterAdmin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static int number;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String confirmPass;
	private String address1;
	private String address2;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	public boolean valid;
	private int adminID;
		public RegisterAdmin() {
		this.adminID=adminID;	
		}

	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setConfirmPass(String confirmPassword) {
		this.confirmPass= confirmPassword;
	}
	
	public String getConfirmPass() {
		return confirmPass;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress1() {
		return address1;
	}
	
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public String getAddress2() {
		return address2;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	public boolean isValid() {
        return valid;
	}

     public void setValid(boolean newValid) {
        valid = newValid;
	}
    
     public void setAdminID(int newAdminID) {
    	 adminID = newAdminID;
     }
     public int getAdminID() {
    	 return adminID;
     }
     
//     public static int ArrayRandom(int newAdminID){
//   	 			int random = newAdminID;
//   			Random r = new Random();
//   			int arr[] = new int[99999];
//   			for(int i = 11111; i < 99999; i++){
//   			   //random numbers from 11111 to 99999:
//    			   arr[i] = r.nextInt(99999) + 1;
// 			   random = arr[i];
//    			}
//   			
//   			return random;
//    }
//    
//    public static void main(String [] args) {
//   	 System.out.println("random ID : "+ ArrayRandom(0));
//   }
}
