package com.whileloop;

//Count digits of a number
import java.util.Scanner;

public class While10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}
		System.out.println("TOTAL DIGITS IN THE GIVEN NUMBER :" + count);
		sc.close();
	}

}
