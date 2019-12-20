package cit285.bookstor2.service;

import cit285.bookstore2.dao.RegisterAdminDao;
import cit285.bookstore2.domain.RegisterAdmin;

public class RegisterAdminServices {
	RegisterAdminDao registerAdminDao;
	
	public RegisterAdminServices () {
		RegisterAdminDao registerAdminDao = new RegisterAdminDao();
		
	}
	public void registerAdminService(RegisterAdmin registerAdmin) {
		
		
			try {
				
				registerAdminDao.registerAdmins(registerAdmin);
				System.out.println("registerAdmin........"+registerAdmin);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
