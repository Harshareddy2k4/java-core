package com.gut;

public class Inclusionexclusion {

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 2, 10 }, { 3, 9 }, { 5, 8 } };
		int[] inc = new int[a.length];
		int[] exc = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					continue;
				}
				if (a[i][0] >= a[j][0] && a[i][1] <= a[j][1]) {
					inc[i] = 1;
				}
				if (a[i][0] <= a[j][0] && a[i][1] >= a[j][1]) {
					exc[i] = 1;
				}
			}
		}
		for (int i = 0; i < inc.length; i++) {
			System.out.print(inc[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < exc.length; i++) {
			System.out.print(exc[i] + " ");
		}
	}

}
