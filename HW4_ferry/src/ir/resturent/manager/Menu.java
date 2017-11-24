package ir.resturent.manager;

import java.util.ArrayList;
import ir.resturent.food.Food;

public class Menu {

	
	public static ArrayList<Food> menu = new ArrayList<>();
	
	
	public void add(Food food) {
		
			menu.add(food);
		
	}
	
	public void update(Food newFood) {
		
		for(int i=0; i<menu.size();i++) {
			
			if(menu.get(i).equals(newFood)) {
				
				menu.remove(i);
				menu.add(newFood);
				
			}
			
		}
		
	}
	
}
