package com.javaintro;

import java.util.Scanner;

public class CaseStudy1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Library");
		System.out.println("Do you have library card(yes/no) :");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter the number of books already borrowed: ");
			int num =sc.nextInt();
			if(num>=3) {
				System.out.println("you barrowed to max limit");
			}else {
				System.out.println("Enter which category Book you want");
				System.out.println("1.fiction");
				System.out.println("2.science");
				System.out.println("3.history");
				
				System.out.println("Enter your choice :");
				int ch = sc.nextInt();
				switch(ch) {
				case 1 ->{
					System.out.println("book issued:fiction");
					System.out.println("Borrow period : 7 days!!!");
				}
				case 2 ->{
					System.out.println("book issued:Science");
					System.out.println("Borrow period : 14 days!!!");
				}
				case 3 ->{
					System.out.println("book issued:history");
					System.out.println("Borrow period : 21 days!!!");
				}
				default -> System.out.println("invalid category");
				}
			}
		}else {
			System.out.println("Library card Required to borrow books");
		}
		
		System.out.println("Thanks for visiting!!!!");
	}

}
