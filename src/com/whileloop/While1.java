package com.whileloop;

//Find factorial of a number
import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int fact = 1;
		while (a > 0) {
			fact *= a;
			a--;
		}
		System.out.println("FACTORIAL OF GIVEN NUMBER IS :" + fact);
		sc.close();
	}

}
