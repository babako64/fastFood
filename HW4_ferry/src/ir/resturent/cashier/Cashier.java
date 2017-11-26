package ir.resturent.cashier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import ir.resturent.food.Food;
import ir.resturent.manager.Menu;

public class Cashier {

	static ArrayList<Order> orders = new ArrayList<>();
public static void main(String[] args) {
	

	Menu m = new Menu();
	while(true) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("");
		showMenu();
		int i = scan.nextInt();
		switch(i) {
		case 1:
			addMenu();
			break;
		case 2:
			System.out.println("Old name:");
			String oname= scan2.nextLine();
			System.out.println("New name:");
			String nname= scan2.nextLine();
			m.changeName(oname,nname);
			break;
		case 3:
			System.out.println("Old name:");
			oname= scan2.nextLine();
			System.out.println("Materials:");
			String mat = scan.nextLine();
			String materials[] = mat.split(" ");
			ArrayList<String> materilaList = new ArrayList<>(Arrays.asList(materials));
			m.changeMaterials(oname,materilaList);
			break;
		case 4:
			System.out.println("Food name:");
			oname = scan2.nextLine();
			System.out.println("price:");
			double price = scan2.nextDouble();
			m.changePrice(oname, price);
			break;
		case 5:
			inputFood();
			break;
		}
	}
}
	static public void inputFood() {
		
		System.out.println("**order your food**");
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("food:");
		String food = scan.nextLine();
		System.out.println("Number of food:");
		int number = scan.nextInt();
		
		System.out.println("diliver or eat in place:");
		String state = scan2.nextLine();
		System.out.println("customer Id:");
		int customerNumber = scan.nextInt();
		double price=0;
		if(state.equals("in place")) {
		 double pr = calculatePrice(food, number);
		 price = pr+((pr*20)/100);
		}else {
		price = calculatePrice(food, number);
		}
		HashMap<String, Integer> foods = new HashMap<>();
		foods.put(food, number);
		Order order = new Order(foods, "0", 0, customerNumber, price);
		orders.add(order);
		print(food, number, customerNumber, price);
		
	}
	
	static public void addMenu() {
		
		Menu menu = new Menu();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("food name:");
		String name = scan.nextLine();
		System.out.println("price:");
		double price = scan.nextDouble();
		System.out.println("materials:");
		String material = scan2.nextLine();
		System.out.println("size");
		String size = scan2.nextLine();
		String materials[] = material.split(" ");
		ArrayList<String> materilaList = new ArrayList<>(Arrays.asList(materials));
		
		menu.input(name, price, materilaList, size);
	}
	
	static public double calculatePrice(String food, int number) {
		
		double price=0;
		System.out.println("It's your order:");
		for(Food f : Menu.menu) {
			if(f.getName().equals(food)) {
				price=f.getPrice() * number;
				return price;
			}
		}
		return 0;
		
	}
	
	static public void print(String food, int number, int custNumber, double price) {
		
		System.out.println("Food:"+food);
		System.out.println("Food Number:"+number);
		System.out.println("Customer Number:"+custNumber);
		System.out.println("Price:"+price);
	}
	
	static public void showMenu() {
		
		System.out.println("Add food 1");
		System.out.println("Change food name 2");
		System.out.println("Change food materials 3");
		System.out.println("Change food price 4");
		System.out.println("Order food 5");
	}
}
