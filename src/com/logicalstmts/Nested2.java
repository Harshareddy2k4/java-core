package com.logicalstmts;

import java.util.Scanner;

//selection for job
public class Nested2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("tell me about yourself :");
		String a = sc.nextLine();
		if (a.equalsIgnoreCase(a)) {
			System.out.println("thats a lovely introduction");
			System.out.println("do have any degree (yes/no):");
			String b = sc.next();
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("ok thats great");
				System.out.println("enter number of years experienced :");
				double c = sc.nextDouble();
				if (c >= 3) {
					System.out.println("thats great your experience will going to be useful for us");
					System.out.println("how much java knowledge you have out of 10 :");
					double d = sc.nextDouble();
					if (d > 7) {
						System.out.println("so you have great knowledge of java ");
						System.out.println("Are you good at communication (yes/no)");
						String e = sc.next();
						if (e.equalsIgnoreCase("yes")) {
							System.out.println("thats great");
							System.out.println("do you like to change your location to work(yes/no)");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("thats great");
								System.out.println("how much salary you are expecting :");
								double g = sc.nextDouble();
								if (g < 0 && g > 10000000) {
									System.out.println("we will get back to you thank you");
								} else {
									System.out.println("you are selected we will send you the offer leter");
								}
							} else {
								System.out.println("sorry to say but you can leave");
							}
						} else {
							System.out.println("if you are not good at communication then its difficult to hire you");
						}
					} else {
						System.out.println("we need more java knowledge people");
					}
				} else {
					System.out.println("we cant hire you because we need more experienced candidates");
				}
			} else {
				System.out.println("if you dont have degree then we cant hire you");
			}
		} else {
			System.out.println("you can leave for the day");
		}
		sc.close();

	}

}
