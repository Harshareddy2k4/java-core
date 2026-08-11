package com.logicalstmts;

import java.util.Scanner;

//Check if a character is a vowel or consonents.
public class Statement6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character :");
		char a = sc.next().charAt(0);
		if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'o' || a == 'i'
				|| a == 'u') {
			System.out.println("entered character is a vowel");
		} else {
			System.out.println("its a consonent");
		}
		sc.close();
	}

}
