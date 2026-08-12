package com.Loops;
//Count negative numbers.
import java.util.Scanner;

public class For19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO ENTER :");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println("ENTER A NUMBER :");
			int b = sc.nextInt();
			if (b < 0) {
				count++;
			}
		}
		System.out.println("COUNT OF NEGATIVE NUMBERS IS :" + count);
		sc.close();

	}

}
