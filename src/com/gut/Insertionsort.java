package com.gut;

public class Insertionsort {

	public static void main(String[] args) {
		int[] a = { 12, 11, 13, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int j = i - 1;
			for (; j >= 0 && a[j] > min; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = min;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "\t");
		}
	}

}
