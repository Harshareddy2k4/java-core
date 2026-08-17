package com.whileloop;

//Find largest digit
import java.util.Scanner;

public class While12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int temp = 0;
		while (a != 0) {
			int rem = a % 10;
			a = a / 10;
			if (rem > temp) {
				temp = rem;
			}
		}
		System.out.println("LARGEST DIGIT :" + temp);
		sc.close();

	}

}
