package com.whileloop;

//Count occurrences of a particular digit
import java.util.Scanner;

public class While18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		System.out.println("ENTER WHICH DIGIT YOU WANT :");
		int b = sc.nextInt();
		int count = 0;
		while (a != 0) {
			int rem = a % 10;
			if (b == rem) {
				count++;
			}
			a = a / 10;
		}
		System.out.println("TOTAL DIGITS IN A GIVEN NUMBER IS :" + count);
		sc.close();
	}

}
