package com.javaintro;
import java.util.Scanner;
public class PractSwitch5 {
	public static void main(String[] args) {
		System.out.println("welcome to worst mobile shp");
		Scanner sc = new Scanner(System.in);
		int android_total =0;
		int iphone_total =0;
		String mainChoice;
		do {
			System.out.println("Enter mobile (android/iphone) :");
			String mobile = sc.next();
		switch(mobile.toLowerCase()) {
		case "android" ->{
			System.out.println(" 1.vivo");
			System.out.println(" 2.oppo");
			System.out.println(" 3.poco");
			System.out.println(" 4.google");
			System.out.println(" 5.xiomi");
			System.out.println(" 6.iqoo");
			System.out.println("enter item num:");
			int num = sc.nextInt();
			switch(num) {
			case 1 -> System.out.println(android_total +=35000);
			case 2 -> System.out.println(android_total +=15000);
			case 3 -> System.out.println(android_total +=25000);
			case 4 -> System.out.println(android_total +=50000);
			case 5 -> System.out.println(android_total +=70000);
			case 6 -> System.out.println(android_total +=45000);
			default -> System.out.println("Your mobile not available");
			}
		}
		case "iphone" -> {
			System.out.println(" 1.iphone 13");
			System.out.println(" 2.iphone 14");
			System.out.println(" 3.iphone 15");
			System.out.println(" 4.iphone 16");
			System.out.println(" 5.iphone 17");
			System.out.println("enter item num:");
			int num = sc.nextInt();
			switch(num) {
			case 1 -> System.out.println(iphone_total +=135000);
			case 2 -> System.out.println(iphone_total +=115000);
			case 3 -> System.out.println(iphone_total +=215000);
			case 4 -> System.out.println(iphone_total +=150000);
			case 5 -> System.out.println(iphone_total +=170000);
			default -> System.out.println("Your mobile not available");
			}
		}
		default ->System.out.println("Sorry Bhaai");
		}
		System.out.println("do you want another phone(yes/No):");
		mainChoice = sc.next();
		}while(mainChoice.equalsIgnoreCase("yes"));
		System.out.println("android total:"+android_total);
		System.out.println("android total:"+iphone_total);
		System.out.println("total amount:"+(android_total+iphone_total));
		
	}
}
