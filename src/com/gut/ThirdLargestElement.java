package com.gut;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int[] a = { 10, 20, 4, 45, 99 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (first == a[i] || second == a[i] || third == a[i]) {
				continue;
			} else if (first < a[i]) {
				third = second;
				second = first;
				first = a[i];
			} else if (second < a[i]) {
				third = second;
				second = a[i];
			} else {
				third = a[i];
			}

		}
		System.out.println(third);

	}

}
