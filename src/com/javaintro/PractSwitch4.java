package com.javaintro;

import java.util.Scanner;

public class PractSwitch4 {

	public static void main(String[] args) {
		System.out.println(" Welcome to DMart");
		Scanner sc = new Scanner(System.in);
		
			int groceries_prices = 0;
			int cloths_price = 0;
			String mainchoice;
			
			do {
			System.out.println("enter what do you want (Groceries/cloths) :");
			String type = sc.next();
			
			switch(type.toLowerCase()) {
			case "groceries" -> {
				
				System.out.println("1.rice");
				System.out.println("2.nuts");
				System.out.println("3.shampoo");
				System.out.println("4.choclates");
				System.out.println("5.breads");
				System.out.println("6.wheat floor");
				System.out.println("7.maidha");
				System.out.println("8.oil");
				System.out.println("enter a number :");
			
				int num = sc.nextInt();
				
				switch(num) {
				case 1 -> System.out.println(groceries_prices +=1500);
				case 2 -> System.out.println(groceries_prices +=80);
				case 3 -> System.out.println(groceries_prices +=300);
				case 4 -> System.out.println(groceries_prices +=100);
				case 5 -> System.out.println(groceries_prices +=40);
				case 6 -> System.out.println(groceries_prices +=50);
				case 7 -> System.out.println(groceries_prices +=50);
				case 8 -> System.out.println(groceries_prices +=200);
				default -> System.out.println("Wrong number entered");
				}
			}
			case "cloths" ->{
				System.out.println("1.men casuals shirts");
				System.out.println("2.men plain shirts");
				System.out.println("3.men jean pants");
				System.out.println("4.baggy jeans");
				System.out.println("5.women skirts");
				System.out.println("6.tshirts");
				System.out.println("7.shorts");
				System.out.println("8.lungies");
				System.out.println("enter a number :");
				int num = sc.nextInt();
				switch(num) {
				case 1 -> System.out.println(cloths_price +=400);
				case 2 -> System.out.println(cloths_price +=300);
				case 3 -> System.out.println(cloths_price +=700);
				case 4 -> System.out.println(cloths_price +=800);
				case 5 -> System.out.println(cloths_price +=400);
				case 6 -> System.out.println(cloths_price +=600);
				case 7 -> System.out.println(cloths_price +=100);
				case 8 -> System.out.println(cloths_price +=100);
				default -> System.out.println("enetered num is wrong");
				}
			}
			default -> System.out.println("item is not there");
			}
			System.out.println("do you want another item(yes/No):");
			mainchoice = sc.next();
			
			}while(mainchoice.equalsIgnoreCase("yes"));
			
			System.out.println("Groceries total price is :"+groceries_prices);
			System.out.println("cloths total price is :"+cloths_price);
			System.out.println("total price is :"+(groceries_prices+cloths_price));
			
			sc.close();
	}

}
