package com.Test;

import java.util.Scanner;

public class Test52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ROWS :");
		int a = sc.nextInt();
		System.out.println("ENTER NUMBER OF COLUMNS :");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("ENTER ELEMENTS :");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (j==arr[i].length-1) {
					sum += arr[i][j];
				}
				if(i==j) {
					System.out.println(sum+" ");
				}
			}

		}
		sc.close();
	}

}
