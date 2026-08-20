package com.array;

import java.util.Scanner;

//Count occurrences of an element
public class Array19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER WHICH NUMBER YOU WANT TO CHECK :");
		int b = sc.nextInt();
		int count = 0;
		int[] a = { 12, 34, 56, 78, 987, 76, 1, 1 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				count++;
			}
		}
		System.out.println("TOTAL NUMBER OF OCCURANCES :" + count);
		sc.close();

	}

}
