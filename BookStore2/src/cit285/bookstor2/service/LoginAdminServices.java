package cit285.bookstor2.service;

import cit285.bookstore2.dao.LoginAdminDao;
import cit285.bookstore2.domain.LoginAdmin;



public class LoginAdminServices {
	
	public LoginAdminServices() {
		LoginAdminDao loginAdminDao = new LoginAdminDao();
	}
	public static LoginAdmin getLoginAdmin(LoginAdmin loginAdmin) {
		
		
		LoginAdminDao.login(loginAdmin);
		
		return loginAdmin;
		
	}

}
