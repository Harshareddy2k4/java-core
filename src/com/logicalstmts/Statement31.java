package com.logicalstmts;

//Check whether a password length is at least 10 to 20.
import java.util.Scanner;

public class Statement31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password length :");
		int a = sc.nextInt();
		if (a < 10) {
			System.out.println("your password length has to be more");
		} else if (a >= 10 && a < 20) {
			System.out.println("your password is perfect");
		} else {
			System.out.println("your password has to be less");
		}
		sc.close();
	}

}
