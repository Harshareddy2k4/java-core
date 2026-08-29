package com.Test;

import java.util.Scanner;

public class Test54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ROWS :");
		int c = sc.nextInt();
		System.out.println("ENTER NUMBER OF COLUMNS :");
		int b = sc.nextInt();
		int a[][] = new int[c][b];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("ENTER ELEMENTS :");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] % 2 == 0) {
					a[i][j] = 0;
				} else {
					a[i][j] = -1;
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
