package com.logicalstmts;

import java.util.Scanner;

//Check if a character is upper case or lower case.
public class Statement4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :");
		char s = sc.next().charAt(0);
		if (s >= 'A' && s <= 'Z') {
			System.out.println("entered character is uppercase character");
		} else {
			System.out.println("its a lower case character");
		}
		sc.close();
	}

}
