package com.whileloop;

//Find first digit
import java.util.Scanner;

public class While13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int temp = 0;
		while (a != 0) {
			int rem = a % 10;
			a = a / 10;
			temp = rem;

		}
		System.out.println("FIRST DIGIT IS :" + temp);
		sc.close();
	}

}
