package com.whileloop;
//Find last digit
import java.util.Scanner;

public class While14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int temp = 0;
		while (a != 0) {
			int rem = a % 10;
			a = a / 10;
			temp = rem;
			break;

		}
		System.out.println("FIRST DIGIT IS :" + temp);
		sc.close();
		

	}

}
