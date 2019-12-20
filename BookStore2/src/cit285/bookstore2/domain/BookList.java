package cit285.bookstore2.domain;
import java.io.*;

public class BookList implements Serializable{
	private int bookID;
	private String ISBN;
	private String authorName;
	private int year;
	private String publisher;
	private String title;
	
	private double price;
	private String photo;
	
	public BookList() {
		
	}
	
	public BookList(int bookID, String title, String author, double price) {
		this.bookID = bookID;
		
	}
	
	public BookList(int bookID,String ISBN,String authorName,int year,String publisher, String title,Double price) {
		this.bookID = bookID;
		this.ISBN = ISBN;
		this.authorName = authorName;
		this.year = year;
		this.publisher = publisher;
		this.title = title;
	
		this.price = price;
		
	}
	
	public void setBookID(int id) {
		this.bookID = id;
	}
	
	public int getBookID() {
		return bookID;
	}
	
	public void setISBN(String num) {
		this.ISBN = num;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setAuthorName(String name) {
		this.authorName = name;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setPublisher(String pub) {
		this.publisher= pub;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setTitle(String ti) {
		this.title = ti;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
     public void setPhoto(String i) {
    	 this.photo = i;
     }
    

}
