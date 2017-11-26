package ir.resturent.cashier;

import java.util.ArrayList;
import java.util.HashMap;

import ir.resturent.food.Food;

public class Order {

	HashMap<String, Integer> orders = new HashMap<>();
	String date;
	int time;
	int customerNumber;
	double price;
	
	public Order(HashMap<String, Integer> orders, String date, int time, int customerNumber,double price) {
		super();
		this.orders = orders;
		this.date = date;
		this.time = time;
		this.customerNumber = customerNumber;
		this.price = price;
	}

	public Order() {
		
	}

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public HashMap<String, Integer> getOrders() {
		return orders;
	}


	public void setOrders(HashMap<String, Integer> orders) {
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


	public int getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
}
