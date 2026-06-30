package com.javaintro;
//nested if condition
import java.util.Scanner;

public class PractCond {

	public static void main(String[] args) {
		System.out.println("Welcome To VCube Matrimony");		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Assets Worth:");
		int assets = sc.nextInt();
		
		System.out.println("Enter salary:");
		int salary = sc.nextInt();
		
		if(assets>10000000 || salary>=2000000) {
			System.out.println("OK Nice");
			
			System.out.println("Enter The Age:");
			int age = sc.nextInt();
			
			if(age<28 && age>25) {
				System.out.println("Again Good");
				sc.nextLine();
				
				System.out.println("Enter Religion:");
				String rel = sc.nextLine();

				if(rel.equalsIgnoreCase("hindu")) {
					System.out.println("Hmm good");
					
					System.out.println("What is your Color:");
					String color = sc.nextLine();
					if(color.equalsIgnoreCase("white")) {
						System.out.println("Awwwwwwwwww");
						
						System.out.println("Enter Your Height :");
						float height = sc.nextFloat();
						if(height>=5.5 && height <=6.2) {
							System.out.println("Maybe I Am Luckyyyyyy");
							
							System.out.println("Enter Your Weight :");
							double weight = sc.nextDouble();
							if(weight<=75 && weight>=65) {
								System.out.println("Almost My Type");
								
								System.out.println("You Have Bad Habits?? (True or False):");
								boolean habits = sc.nextBoolean();
								if( !habits) {
									System.out.println("One Last Question Remaining To Be Mine");
									sc.nextLine();
									System.out.println("Past Relations??:");
									String relation = sc.nextLine();
									if(relation.equalsIgnoreCase("no")) {
										System.out.println("Eppudu Pelli cheskundham");
									}else {
										System.out.println("Neeku Naakanna Manchi Pilla Dhorukuthadhi");
									}
								}else {
									System.out.println("Good To Meet You");
								}
							}else {
								System.out.println("Malla Kaluddham");
							}
						}else {
							System.out.println("Try To Take Complan");
						}
					}else {
						System.out.println("Sorry Yaar");
					}
				}else {
					System.out.println("Thanks Namasthe");
				}
				
			}else {
				System.out.println("Yeah Good Bye!!!");
			}
			
		}else {
			System.out.println("Good Bye!!!");
		}
	}

}
