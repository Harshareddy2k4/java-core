package com.logicalstmts;

//Employee Promotion System
import java.util.Scanner;

public class Nested7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Is this employee exist (yes/no) :");
			String a = sc.next();
			if (a.equalsIgnoreCase("yes")) {
				System.out.println("Is this employee parmanant (yes/no) :");
				String b = sc.next();
				if (b.equalsIgnoreCase("yes")) {
					System.out.println("enter the employee experiance :");
					double c = sc.nextDouble();
					if (c >= 5 && c <= 50) {
						System.out.println("Enter thhe employee attandance :");
						double d = sc.nextDouble();
						if (d >= 90 && d <= 100) {
							System.out.println("Is there any Indisciplinary actions against him(yes/no) :");
							String e = sc.next();
							if (e.equalsIgnoreCase("no")) {
								System.out.println("Is this employee completed mandatory training(yes/no) :");
								String f = sc.next();
								if (f.equalsIgnoreCase("yes")) {
									System.out
											.println("Is manager Approved this employee for this promotion(yes/no) :");
									String g = sc.next();
									if (g.equalsIgnoreCase("yes")) {
										System.out.println("Is HR Approved this employee for  promotion(yes/no) :");
										String h = sc.next();
										if (h.equalsIgnoreCase("yes")) {
											System.out.println("Is budget available (yes/no) :");
											String i = sc.next();
											if (i.equalsIgnoreCase("yes")) {
												System.out.println("*** Congratulations you got the promotion ***");
											} else {
												System.out.println("Sorry there is no budget");
											}
										} else {
											System.out.println("HR needs to approve you!!");
										}
									} else {
										System.out.println("Sorry Manager diclined you!!");
									}
								} else {
									System.out.println("You need to complete the training period");
								}
							} else {
								System.out.println("Our employee's should be Discipline");
							}
						} else {
							System.out.println("Attandance should be mandatory");
						}
					} else {
						System.out.println("only experianced employee's are eligible");
					}
				} else {
					System.out.println("the promotion is only for parmanant employees");
				}
			} else {
				System.out.println("you are not eligible for promotion");
			}

			System.out.println("Do you want to check another employee(y/n) :");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("Thank you!!!");
		sc.close();
	}

}
