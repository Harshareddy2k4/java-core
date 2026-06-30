package com.javaintro;

import java.util.Scanner;

public class PractCond3 {
//static String name="";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name? :");
		String name = sc.nextLine();
		if(name.equalsIgnoreCase(name)) {
			System.out.println("OK NICE");
			
			System.out.println("Whats your age :");
			int age = sc.nextInt();
			if(age>=23 && age <=60) {
				System.out.println("OK!!!");
				sc.nextLine();
				System.out.println("What are your hobbies :");
				String hobbies = sc.nextLine();
				if(hobbies.equalsIgnoreCase("singing") || hobbies.equalsIgnoreCase("reading books") || hobbies.equalsIgnoreCase("Drawing")) {
					System.out.println("that's good");
				
				
				System.out.println("What's your percentage in btech :");
				double percent = sc.nextDouble();
				if(percent>=65 && percent<=100) {
					System.out.println("That's Great!!!");
					
					System.out.println("Do you Have Any Experiance(How Many years) :");
					int exp = sc.nextInt();
					if(exp>=2) {
						System.out.println("that's Great");
						
						System.out.println("How Much Salary You Are Expecting :");
						long salary = sc.nextLong();
						if(salary>=600000 && salary<=1500000) {
							System.out.println("ok");
							sc.nextLine();
							
							System.out.println("why do you want this job :");
							String reason = sc.nextLine();
							if(reason.equalsIgnoreCase("to get experiance") || reason.equalsIgnoreCase("to improve Skills") || reason.equalsIgnoreCase("to get Real Time project Exriance")) {
								System.out.println("Ok!! You can join from next monday");
								}else {
									System.out.println("It Was nice metting you !!!!");
							}

							}else {
								System.out.println("ok we will get back to you");
						}
						}else {
							System.out.println("you can leave for the day");
					}
					}else {
						System.out.println("You can leave for the day");
				}
				}else {
					System.out.println("You Can Leave For The Day");
				}
			}else {
				System.out.println("Sorry We Wont Hire Teenagers & oldage ppl");
			}
		}
	}

}
