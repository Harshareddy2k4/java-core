package com.logicalstmts;

//Check if a character is a digit or alphabet.
import java.util.Scanner;

public class Statement5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character :");
		char a = sc.next().charAt(0);
		if (a >= '0' && a <= '9') {
			System.out.println("its a digit");
		} else {
			System.out.println("its a character ");
		}
		sc.close();
	}

}
