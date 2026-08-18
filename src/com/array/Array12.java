package com.array;

//Find the smallest element
public class Array12 {

	public static void main(String[] args) {
		int[] a = { 12, 34, 56, 78, 987, 76, 1 };
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (temp > a[i]) {
				temp = a[i];
			}
		}
		System.out.println("SMALLEST NUMBER IS :" + temp);

	}

}
