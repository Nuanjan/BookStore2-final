package cit285.bookstor2.service;


import cit285.bookstore2.dao.LoginCustomerDao;

import cit285.bookstore2.domain.LoginCustomer;

public class LoginCustomerServices {
	
	public LoginCustomerServices() {
		LoginCustomerDao loginCustomerDao = new LoginCustomerDao();
	}
	public static LoginCustomer getLoginCustomer(LoginCustomer loginCustomer) {
		
		
	LoginCustomerDao.login(loginCustomer);
		
		return loginCustomer;
		
	}
}