package com.array;

import java.util.Scanner;
import java.util.Arrays;

//ARRAYS READING FROM SCANNER
public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("ENTER " + a + " ELEMENTS :");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i <= arr.length - 1; i++) {

		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
