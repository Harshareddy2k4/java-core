package com.logicalstmts;

import java.util.Scanner;

//Classify IQ score ranges.
public class Statement39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you IQ :");
		double a = sc.nextDouble();
		if (a <= 60 && a >= 0) {
			System.out.println("you have no brain");
		} else if (a > 200) {
			System.out.println("alrbet epstien mama nuvvu");
		} else if (a > 150) {
			System.out.println("you are not a human");
		} else if (a > 100) {
			System.out.println("my brain");
		} else if (a > 60 && a <= 99) {
			System.out.println("my sister brain");
		} else {
			System.out.println("neeku brain ledhu raa");
		}
		sc.close();
	}

}
