package com.whileloop;

//Check palindrome number
import java.util.Scanner;

public class While16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int palin = 0;
		int temp = a;
		while (a > 0) {
			int rem = a % 10;
			a = a / 10;
			palin = palin * 10 + rem;
		}
		if (palin == temp) {
			System.out.println("ITS A PALINDROME ");
		} else {
			System.out.println("ITS NOT A PALINDROME ");
		}
		sc.close();
	}

}
