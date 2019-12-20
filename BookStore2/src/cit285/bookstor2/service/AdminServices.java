package cit285.bookstor2.service;

import java.sql.SQLException;
import java.util.ArrayList;

import cit285.bookstore2.dao.*;

import cit285.bookstore2.domain.*;

public class AdminServices implements AdminServicesAPI {
	AdminDao adminDao;
	
	public AdminServices() {
		adminDao = new AdminDao();
	}

	
	
	// Get list of courses from the Dao
	public void registerBook(BookList book){
		
		try {
			adminDao.addBook(book);
			
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}
	
public void updateBook(BookList book){
		
		try {
			adminDao.updateBook(book);
			
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}


public void deleteBook(BookList book){
	
	try {
		adminDao.deleteBook(book);
		
	}catch (SQLException | ClassNotFoundException e) {
		System.out.println(e.toString());
	}
}


public ArrayList<BookList> getBookList() {
	// TODO Auto-generated method stub
	
ArrayList<BookList> books = new ArrayList<>();
	

		try {
			books = adminDao.getBookList();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	
}

}








