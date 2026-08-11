package com.logicalstmts;

//Check whether ATM balance is sufficient for withdrawal.
import java.util.Scanner;

public class Statement33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount :");
		double a = sc.nextDouble();
		if (a > 500) {
			System.out.println("Atm balance is sufficient :");
		} else if (a > 0 && a <= 500) {
			System.out.println("no sufficient balance");
		} else {
			System.out.println("inko atm ki po betee");
		}
		sc.close();
	}

}
