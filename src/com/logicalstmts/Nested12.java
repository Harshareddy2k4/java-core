package com.logicalstmts;

import java.util.Scanner;

//Bank Loan Approval System
public class Nested12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Harsha's bank ");
		System.out.println("Is customer exist(yes/no) :");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("Is KYC completed (yes/no) :");
			String b = sc.next();
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("Aadhar card verified (true/false) :");
				boolean c = sc.nextBoolean();
				if (c == true) {
					System.out.println("PAN card verified (true/false) :");
					boolean d = sc.nextBoolean();
					if (d == true) {
						System.out.println("Mobile number verified (true/false) :");
						boolean e = sc.nextBoolean();
						if (e == true) {
							System.out.println("Email verified (true/false) :");
							boolean f = sc.nextBoolean();
							if (f == true) {
								System.out.println("Enter your age :");
								int g = sc.nextInt();
								if (g >= 23 && g <= 60) {
									System.out.println("Enter you monthly salary :");
									double h = sc.nextDouble();
									if (h >= 50000) {
										System.out.println("From how long you have been working :");
										double i = sc.nextDouble();
										if (i >= 3 && i <= 60) {
											System.out.println("Enter your credit score :");
											double j = sc.nextDouble();
											if (j >= 750 && j <= 1000) {
												System.out.println("Is there any existing loan (yes/no) :");
												String k = sc.next();
												if (k.equalsIgnoreCase("no")) {
													System.out.println("Is EMI ratio Acceptable (yes/no) :");
													String l = sc.next();
													if (l.equalsIgnoreCase("yes")) {
														System.out.println("Is Documents verified (yes/no) :");
														String m = sc.next();
														if (m.equalsIgnoreCase("yes")) {
															System.out.println("Is manager Aapproved (yes/no) :");
															String n = sc.next();
															if (n.equalsIgnoreCase("yes")) {
																System.out.println(
																		"Is Branch manager Approved (yes/no) :");
																String o = sc.next();
																if (o.equalsIgnoreCase("yes")) {
																	System.out.println(
																			"Congratulations your loan has approved and dont forget to pay EMIs properly");
																} else {
																	System.out.println(
																			"Branch manager Declined your loan ");
																}
															} else {
																System.out.println("Manager declined your loan");
															}
														} else {
															System.out.println("Documents needs to be verified ");
														}
													} else {
														System.out.println("Ok thank you and you can leave");
													}
												} else {
													System.out.println("YOu cant pay multiple loans soo sorry ");
												}
											} else {
												System.out.println("your credit score is less to loan approval");
											}
										} else {
											System.out.println("You have to be minimum settled");
										}
									} else {
										System.out.println("Without income you cant pay the EMI's so you can leave ");
									}
								} else {
									System.out.println("We cannot give loan to the kids and old people");
								}
							} else {
								System.out.println("Go and verify your Email");
							}
						} else {
							System.out.println("Firstly verify your mobile number");
						}
					} else {
						System.out.println("PAN card needs to be verified");
					}
				} else {
					System.out.println("Aadhar card has to verified");
				}
			} else {
				System.out.println("Needs to complete KYC");
			}
		} else {
			System.out.println("there is no loan for not existed people");
		}
		System.out.println("Thank you !!!!!!");
		sc.close();
	}

}
