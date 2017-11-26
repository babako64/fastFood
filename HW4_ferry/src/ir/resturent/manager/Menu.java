package ir.resturent.manager;

import java.util.ArrayList;
import ir.resturent.food.Food;

public class Menu {

	
	public static ArrayList<Food> menu = new ArrayList<>();
	
	
	public void input(String name, double price, ArrayList<String> materials, String size) {
		
		Food food = new Food(name,price,materials,size);
		add(food);
	}
	
	public void add(Food food) {
		
			menu.add(food);
		
	}
	
	
	public void changeName(String oldName,String newName) {
			
		for(int i=0; i<menu.size();i++) {
				if(menu.get(i).getName().equals(oldName)) {
					menu.get(i).setName(newName);
				}
				
			}
	}
	
	public void changePrice(String name, double price) {
		
		for(int i=0; i<menu.size();i++) {
			if(menu.get(i).getName().equals(name)) {
				menu.get(i).setPrice(price);
			}
			
		}
	}
	
	public void changeMaterials(String name, ArrayList<String> material) {
		
		for(int i=0; i<menu.size();i++) {
			if(menu.get(i).getName().equals(name)) {
				menu.get(i).setMaterials(material);
			}
			
		}
		
	}
	
	public void changeSize(String name, String size) {
		
		for(int i=0; i<menu.size();i++) {
			if(menu.get(i).getName().equals(name)) {
				menu.get(i).setSize(size);
			}
			
		}
	}
}
