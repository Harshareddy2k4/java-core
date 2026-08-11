package com.logicalstmts;

//Check if a student has passed (marks ≥ 35).
import java.util.Scanner;

public class Statement15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks :");
		int a = sc.nextInt();
		if (a >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		sc.close();

	}

}
