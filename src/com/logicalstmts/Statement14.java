package com.logicalstmts;
//Check if a person is eligible to vote (18+).
import java.util.Scanner;

public class Statement14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("person is eligible to vote");
		} else {
			System.out.println("person is not eligible to vote");
		}
		sc.close();

	}

}
