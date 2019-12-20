package cit285.bookstore2.domain;

public class Item {

	private BookList book;
	private int quantity;

	public Item() {
	}

	public Item(BookList book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}

	public BookList getProduct() {
		return book;
	}

	public void setProduct(BookList book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}