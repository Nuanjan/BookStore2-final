package cit285.bookstor2.service;

import cit285.bookstore2.dao.RegisterCustomerDao;
import cit285.bookstore2.domain.RegisterCustomer;


public class RegisterCustomerServices {
	static RegisterCustomerDao registerCustomerDao;
	
	public RegisterCustomerServices () {
		RegisterCustomerDao registerCustomerDao = new RegisterCustomerDao();
	}
	public static int registerCustomerService(RegisterCustomer registerCustomer) {
		int result =0;
		try {
			
			registerCustomerDao.registerCustomers(registerCustomer);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return result;
		
	}

}
