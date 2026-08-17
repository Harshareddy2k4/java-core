package com.whileloop;

//Find factorial of a number
import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int i = 1;
		int fact = 1;
		while (i <= a) {
			fact *= i;
			i++;
		}
		System.out.println("FACTORIAL OF GIVEN NUMBER IS :" + fact);
		sc.close();
	}

}
