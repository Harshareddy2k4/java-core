package com.logicalstmts;

//Check if a student passed, then determine the grade (A, B, C).
import java.util.Scanner;

public class Nested1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks :");
		double a = sc.nextDouble();
		if (a >= 40 && a <= 100) {
			System.out.println("you are passed");
			System.out.println("enter your percentage in semister :");
			double d = sc.nextDouble();
			if (d >= 90 && d <= 100) {
				System.out.println("you got A grade");
			} else if (d >= 75 && d < 90) {
				System.out.println("you got B grade ");
			} else if (d >= 55 && d < 75) {
				System.out.println("you got C grade ");
			} else if (d >= 35 && d < 55) {
				System.out.println("just passed ");
			} else {
				System.out.println("nuvvu sadhuvukora poyyi");
			}
		} else {
			System.out.println("chadhuvuko betee");
		}
		sc.close();
	}

}
