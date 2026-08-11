package com.logicalstmts;

import java.util.Scanner;

//Student Promotion
public class Nested9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome to Harsha Schools of cbse ***");
		System.out.println("Is student paid the fee(yes/no) :");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("enter your attandance percentage ;");
			double b = sc.nextDouble();
			if (b >= 75 && b <= 100) {
				System.out.println("Internal marks completed (true/false) :");
				boolean c = sc.nextBoolean();
				if (c == true) {
					System.out.println("Do you passed the practicals(yes/no) :");
					String d = sc.next();
					if (d.equalsIgnoreCase("yes")) {
						System.out.println("Do you passed the theory exam(yes/no) :");
						String e = sc.next();
						if (e.equalsIgnoreCase("yes")) {
							System.out.println("do you have the no due certificate (yes/no) :");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("Do you submitted the projects (yes/no) :");
								String g = sc.next();
								if (g.equalsIgnoreCase("yes")) {
									System.out.println("Sports requirements completed (true/false) :");
									boolean h = sc.nextBoolean();
									if (h == true) {
										System.out.println("Is principal Approved this student(yes/no) :");
										String i = sc.next();
										if (i.equalsIgnoreCase("yes")) {
											System.out.println("Congratulations you are promoted to next grade");
										} else {
											System.out.println("Principal has to Approve you");
										}
									} else {
										System.out.println("You have to complete the sports requirements");
									}

								} else {
									System.out.println("Poyyi projects complete chey betee");
								}
							} else {
								System.out.println("poyyi no due certificate pattukoni raa first");
							}
						} else {
							System.out.println("Theory exam pass avvali baabu");
						}
					} else {
						System.out.println("You have to complete the practicals to promote to next class");
					}
				} else {
					System.out.println("Go and complete the internal marks ");
				}
			} else {
				System.out.println("Attandance should be mandatory");
			}
		} else {
			System.out.println("you have to pay the fee ");
		}
		System.out.println("Thank you!!!!");
		sc.close();
	}

}
