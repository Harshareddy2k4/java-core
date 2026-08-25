package com.Test;

import java.util.Scanner;

public class Test53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ROWS :");
		int a = sc.nextInt();
		System.out.println("ENTER NUMBER OF COLUMNS :");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("ENTER ELEMENTS :");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}

