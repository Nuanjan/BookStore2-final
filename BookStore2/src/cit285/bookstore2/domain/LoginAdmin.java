package cit285.bookstore2.domain;
public class LoginAdmin {
	
      private String email;
      private String password;
      private int adminID;
      private boolean valid;
	
	
      public String getPassword() {
         return password;
	}
      public int getAdminID() {
    	  return adminID;
      }
      public void setLoginID(int adminID) {
    	  this.adminID = adminID;
      }

      public void setPassword(String newPassword) {
         this.password = newPassword;
	}
	
			
      public String getEmail() {
         return email;
			}

      public void setEmail(String newEmail) {
         this.email = newEmail;
			}

      public boolean isValid() {
          return valid;
  	}

       public void setValid(boolean newValid) {
          valid = newValid;
  	}
     
}