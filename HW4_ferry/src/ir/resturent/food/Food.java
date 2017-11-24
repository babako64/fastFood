package ir.resturent.food;

import java.util.ArrayList;

public class Food {

	protected String name;
	protected double price;
	protected ArrayList<String> materials;
	protected String size;
	
	public Food(String name, double price, ArrayList<String> materials, String size) {
		super();
		this.name = name;
		this.price = price;
		this.materials = materials;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<String> getMaterials() {
		return materials;
	}

	public void setMaterials(ArrayList<String> materials) {
		this.materials = materials;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
