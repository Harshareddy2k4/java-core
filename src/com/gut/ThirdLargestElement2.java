package com.gut;

public class ThirdLargestElement2 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 4, 45, 99 };
		int temp = 0;
		int first = 0;
		int second = 0;
		int third = 0;
		for (int i = 0; i < a.length; i++) {
			if (temp < a[i]) {
				temp = a[i];
				first = i;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (first == j) {
				continue;
			}
			if (a[j] > second) {
				temp = a[j];
				second = j;
			}
		}
		for (int k = 0; k < a.length; k++) {
			if (first == k || k == second) {
				continue;
			}
			if (a[k] > third) {
				third = a[k];
			}
		}
		System.out.println(third);

	}

}
