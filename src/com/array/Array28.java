package com.array;

//Find the largest leader element.
public class Array28 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < a.length; i += 2) {
			for (int j = 0; j < a[i].length / 2; j++) {

				int temp = a[i][j];
				a[i][j] = a[i][a[i].length - 1 - j];
				a[i][a[i].length - 1 - j] = temp;
			}
		}
		for (int i = 1; i < a.length; i += 2) {
			for (int j = 0; j < a[i].length; j++) {

				if (i == 1 && j == 1) {
					continue;
				}

				a[i][j] = a[i][j] * 2;
			}
		}

		for (int i = 0; i < a.length; i++) {
			a[i][i] = a[i][i] * a[i][i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
