package com.logicalstmts;

//Admitting fever patient
import java.util.Scanner;

public class Nested6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****Welcome to 69 Hospitals****");
		System.out.println("Do you have fever(yes/no):");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes")) {
			System.out.println("Enter patient body tempareture in farenhiet :");
			double b = sc.nextDouble();
			if (b >= 101 && b <= 110) {
				System.out.println("Enter patient oxygen inhaling percentage :");
				double c = sc.nextDouble();
				if (c >= 0 && c <= 90) {
					System.out.println("Since how many days this happen :");
					double d = sc.nextDouble();
					if (d > 3) {
						System.out.println("Are you willing to admit in ICU (yes/no):");
						String e = sc.next();
						if (e.equalsIgnoreCase("yes")) {
							System.out.println("Is doctor available right now(yes/no) :");
							String f = sc.next();
							if (f.equalsIgnoreCase("yes")) {
								System.out.println("sir/madam Doctor sir is available right now so no need to worry");
							} else {
								System.out.println("we will notify the doctor but it takes time so its better to join in other hospital");
							}
						} else {
							System.out.println("Its better to join in other hosital");
						}
					} else {
						System.out.println("no need worry that much patient is gonna be all right");
					}
				} else {
					System.out.println(
							"According to your data dont worry that much the patient is safe or you entered wrong data");
				}
			} else {
				System.out.println("its a normal fever take rest");
			}
		} else {
			System.out.println("Sir/madam go to other ward ");
		}
		System.out.println("Thank you!!!!!");
		sc.close();
	}

}
