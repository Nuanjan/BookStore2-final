package cit285.bookstore2.domain;
public class LoginCustomer {
	
      private String email;
      private String password;
      private int loginID;
      public boolean valid;
	
	
      public String getPassword() {
         return password;
	}
      public int getLoginID() {
    	  return loginID;
      }
      public void setLoginID(int loginID) {
    	  this.loginID = loginID;
      }

      public void setPassword(String newPassword) {
         password = newPassword;
	}
	
			
      public String getEmail() {
         return email;
			}

      public void setEmail(String newEmail) {
         email = newEmail;
			}

				
      public boolean isValid() {
         return valid;
	}

      public void setValid(boolean newValid) {
         valid = newValid;
	}	
}