package ir.resturent.cashier;

import java.util.ArrayList;

import ir.resturent.food.Food;

public class Order {

	ArrayList<Food> orders = new ArrayList<>();
	String date;
	int time;
	String customerNumber;
	double price;
	
	public Order(ArrayList<Food> orders, String date, int time, String customerNumber,double price) {
		super();
		this.orders = orders;
		this.date = date;
		this.time = time;
		this.customerNumber = customerNumber;
		this.price = price;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public ArrayList<Food> getOrders() {
		return orders;
	}


	public void setOrders(ArrayList<Food> orders) {
		this.orders = orders;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public String getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
}
