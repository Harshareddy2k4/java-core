package com.logicalstmts;

//Product Return
import java.util.Scanner;
public class Nested11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Harsha's fashion sense");
		System.out.println("Do you recieved the product (yes/no) :");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("Do you send the return request (yes/No) :");
			String b = sc.next();
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("Do you send the return request within the request period(yes/no) :");
				String c = sc.next();
				if (c.equalsIgnoreCase("yes")) {
					System.out.println("Is there any invoice available (yes/no) :");
					String d = sc.next();
					if (d.equalsIgnoreCase("yes")) {
						System.out.println("Is that product undamaged (true/false) :");
						boolean e = sc.nextBoolean();
						if (e == true) {
							System.out.println("Is there any accessories available to that product (yes/no) :");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("Return pickup sheduled (true/false) :");
								boolean g = sc.nextBoolean();
								if (g == true) {
									System.out.println("Inspection passed (true/false) :");
									boolean h = sc.nextBoolean();
									if (h == true) {
										System.out.println("Refund approved(true/false) :");
										boolean i = sc.nextBoolean();
										if (i == true) {
											System.out.println(
													"Soo the product will be returned within 3 days and money will be refunded after returning the product");
										} else {
											System.out.println("Refund declined soo try again after some time");
										}
									} else {
										System.out.println("needs to inspect that product first");
									}
								} else {
									System.out.println("return pickup does not sheduled soo need be sheduled first");
								}
							} else {
								System.out.println("you have to return the every accessory to that product");
							}
						} else {
							System.out.println("Damaged products can't take return");
						}
					} else {
						System.out.println("without invoice we can't take that product return");
					}
				} else {
					System.out.println("sorry sir/madam ypur request time period is over ");
				}
			} else {
				System.out.println("First you need to send the return request");
			}
		} else {
			System.out.println("without product recieving how can you send it return");
		}
		System.out.println("Thank you !!!!");
		sc.close();

	}

}
