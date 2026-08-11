package com.logicalstmts;

//Assign grades (A, B, C, D, Fail).
import java.util.Scanner;

public class Statement26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks :");
		double a = sc.nextDouble();
		if (a < 35) {
			System.out.println("fail");
		} else if (a >= 90) {
			System.out.println("you got A grade");
		} else if (a >= 75) {
			System.out.println("you got B grade");
		} else if (a >= 55) {
			System.out.println("you got C grade");
		} else if (a >= 35) {
			System.out.println("you are just pass");
		} else {
			System.out.println("wrong data entered");
		}
		sc.close();
	}

}
