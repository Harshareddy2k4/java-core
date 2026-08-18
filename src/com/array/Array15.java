package com.array;

import java.util.Scanner;

//Search for a given element
public class Array15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 12, 34, 56, 78, 987, 76, 1 };
		System.out.println("WHICH NUMBER YOU WANT TO FIND IN ARRAY :");
		int b = sc.nextInt();
		boolean se = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				se = true;
				break;
			}
		}
		if (se) {
			System.out.println("THE GIVEN ELEMENT IS THERE IN ARRAY");
		} else {
			System.out.println("THE GIVEN ELEMENT IS NOT THERE IN ARRAY");
			sc.close();
		}
	}

}
