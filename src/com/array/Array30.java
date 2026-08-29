package com.array;

public class Array30 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < a.length; i += 2) {
			for (int j = 0; j < a[i].length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][a[i].length - 1 - j];
				a[i][a[i].length - 1 - j] = temp;
			}
		}

		for (int j = 0; j < a[1].length; j++) {
			if (j != 1) {
				a[1][j] = a[1][j] * 2;
			}
		}
		for (int i = 0; i < a.length; i++) {
			a[i][i] = a[i][i] * a[i][i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
