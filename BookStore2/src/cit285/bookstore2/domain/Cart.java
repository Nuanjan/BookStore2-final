package cit285.bookstore2.domain;

import java.util.HashSet;
import java.util.Set;

public class Cart {
	private RegisterCustomer customer;
	private Set<BookList> books; // No duplicate courses in the set.
	
	public Cart() {
		customer = new RegisterCustomer();
		books = new HashSet<>();
	}
	
	public void setCustomer(RegisterCustomer customer) {
		this.customer = customer;
	}
	
	public RegisterCustomer getCustomer() {
		return customer;
	}
	
	public void addBook(BookList book) {
		
		books.add(book);
	}
	
	
	
	public void removeBook(BookList book) {
		
		books.remove(book);
	
	}

	
	public Set<BookList> getBooks(){
		return books;
	}
	
	public BookList findBook(String title) {
		BookList b = null;
		
		for(BookList book: books) {
			if(book.getTitle().equals(title))
				b = book;
		}
		return b;
	}
	
	public void clear() {
		books.clear();
	}
	
	public BookList getBookID(int bookID) {
		BookList b = null;
		for(BookList book: books) {
			if(book.getBookID()==bookID) {
			b= book;
			break;
		}
		}
	
	return b;
	}
		
	
	
	}
