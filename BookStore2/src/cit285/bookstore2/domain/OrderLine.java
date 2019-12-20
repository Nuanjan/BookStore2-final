package cit285.bookstore2.domain;
import java.io.Serializable;

public class OrderLine implements Serializable{
	private int orderID;
	private double totalPrice;
	private int quantities;

	public OrderLine() {
		super();
	}
	
	public OrderLine(int id, double tPrice,int amount) {
		this.orderID = id;
		this.totalPrice = tPrice;
		this.quantities = amount;
	}
	
	public void setOrderID(int newid) {
		this.orderID = newid;
	}
	public int getID() {
		return orderID;
	}
	
	public void setTotalPrice(double d) {
		this.totalPrice = d;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setQuantities(int newQuan) {
		this.quantities = newQuan;
	}

	
	
}
