package com.array;

import java.util.Scanner;

//Find the index of an element
public class Array16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 12, 34, 56, 78, 987, 76, 1 };
		System.out.println("WHICH NUMBER INDEX YOU WANT TO FING IN ARRAY :");
		int b = sc.nextInt();
		int temp = 0;
		boolean match = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				temp = i;
				match = true;
				break;
			}
		}
		if (match) {
			System.out.println("INDEX OF YOUR ARRAY :" + temp);
		} else {
			System.out.println("ELEMENT IS NOT THERE ");
		}
		sc.close();
	}

}
