package cit285.bookstor2.service;

import java.util.ArrayList;

import cit285.bookstore2.domain.BookList;
import cit285.bookstore2.domain.Cart;
import cit285.bookstore2.domain.LoginCustomer;
import cit285.bookstore2.domain.RegisterCustomer;

public interface CustomerServicesAPI {

	
	public BookList getBook(int bookID);
	
	public ArrayList<BookList> getBooks();
	
	
	public Cart createCart();
}
