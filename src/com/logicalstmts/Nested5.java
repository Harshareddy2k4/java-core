package com.logicalstmts;

// admission in hospital
import java.util.Scanner;

public class Nested5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****welcome to 69 Hospital****");
		System.out.println("Are you registered to admit (Yes/no) :");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("Is doctor available now (yes/no):");
			String b = sc.next();
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("Insurance valid(true/false)");
				boolean c = sc.nextBoolean();
				if (c == true) {
					System.out.println("Is there any rooms available(yes/no) :");
					String d = sc.next();
					if (d.equalsIgnoreCase("yes")) {
						System.out.println("Are you cmpleted payment (yes/no):");
						String e = sc.next();
						if (e.equalsIgnoreCase("yes")) {
							System.out.println("sir/madam your admission is done and your room number is 69");
						} else {
							System.out.println("Sorry sir/madam you need pay the fee first to admission");
						}
					} else {
						System.out.println(
								"sorry sir/madam rooms aren't available here so you better take to other hospital");
					}
				} else {
					System.out.println("we dont take any insurances here");
				}
			} else {
				System.out.println("sorry sir/madam the doctor is not available now ");
			}
		} else {
			System.out.println("you have to register before you admit");
		}
		System.out.println("thank you!!!!");
		sc.close();
	}

}
