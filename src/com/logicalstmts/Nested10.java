package com.logicalstmts;

//Scholarship
import java.util.Scanner;

public class Nested10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to telangana govt");
		System.out.println("Is this student exist (yes/no) :");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("Enter the student attandance percentage :");
			double b = sc.nextDouble();
			if (b >= 75 && b <= 100) {
				System.out.println("enter the student marks percentage :");
				double c = sc.nextDouble();
				if (c >= 80 && c <= 100) {
					System.out.println("enter the student family income :");
					double d = sc.nextDouble();
					if (d >= 0 && d <= 200000) {
						System.out.println("Do you submitted the documents (yes/no) :");
						String e = sc.next();
						if (e.equalsIgnoreCase("yes")) {
							System.out.println("Do you submitted the income Certificate (yes/no) :");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("Is your conduct certificate verified (true/false) :");
								boolean g = sc.nextBoolean();
								if (g == true) {
									System.out.println("Is principal recomended(true/false) :");
									boolean h = sc.nextBoolean();
									if (h == true) {
										System.out.println("Is scholorship comitteee approved(yes/no) :");
										String i = sc.next();
										if (i.equalsIgnoreCase("yes")) {
											System.out.println("Congratulations you will get the scholorship soon ");
										} else {
											System.out.println("Then you dont get the scholorship money");
										}
									} else {
										System.out.println("The principal has to give the approval first");
									}
								} else {
									System.out.println("your conduct certificate needs to be verified");
								}
							} else {
								System.out.println("you need to submit the income certificate first");
							}
						} else {
							System.out.println("You have submit the documents first for scholorship");
						}
					} else {
						System.out.println("your family income is more so you no need this scholorship money");
					}
				} else {
					System.out.println("marks should be greater than 80%");
				}
			} else {
				System.out.println("Attandance is mandatory for scholorship");
			}
		} else {
			System.out.println("Student is not eligible because he is not in active");
		}
		System.out.println("Thank you !!!!");
		sc.close();
	}

}
