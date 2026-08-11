package com.logicalstmts;

import java.util.Scanner;

//New Employee Joining
public class Nested8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Harsha Consultancy");
		System.out.println("Do you want to Accept this offer (yes/no):");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("Are you submitted the documents(yes/no) :");
			String b = sc.next();
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("Documents verified (true/false) :");
				boolean c = sc.nextBoolean();
				if (c == true) {
					System.out.println("Background verification passed (true/false) :");
					boolean d = sc.nextBoolean();
					if (d == true) {
						System.out.println("Do you passed the medical test(yes/no) :");
						String e = sc.next();
						if (e.equalsIgnoreCase("yes")) {
							System.out.println("Do you created the email(yes/no):");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("Do you take the welcome kit(yes/no) :");
								String g = sc.next();
								if (g.equalsIgnoreCase("yes")) {
									System.out.println("Do you have any laptop(yes/no) :");
									String h = sc.next();
									if (h.equalsIgnoreCase("yes")) {
										System.out.println("thats great lets start the journey in this company");
									} else if (h.equalsIgnoreCase("no")) {
										System.out.println(
												"Go and take the company laptop and start the journey in Harsha consultancy");
									} else {
										System.out.println("you can leave for the day");
									}
								} else {
									System.out.println("Poyyi Welcome kit thechuko betee");
								}
							} else {
								System.out.println("Mundhu email okati create chesko broo first");
							}
						} else {
							System.out.println("inni diseases pettukoni avasarama bete neeku job");
						}
					} else {
						System.out.println("Background verification debba vesindhi bhaai needhi");
					}
				} else {
					System.out.println("Mundhu document verification complete chey betee");
				}
			} else {
				System.out.println("Documents submit chey baabu first");
			}
		} else {
			System.out.println("endhuku reject chesinav betee");
		}
		System.out.println("Thank you !!!!!");
		sc.close();
	}

}
