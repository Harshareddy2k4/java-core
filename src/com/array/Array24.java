package com.array;

//Find duplicate elements
public class Array24 {

	public static void main(String[] args) {
		int[] a = { 13, 1, 78, -987, 76, 1 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (temp < a[i]) {
				temp = a[i];
			}
		}
		System.out.println("LARGEST NUMBER :" + temp);
	}

}
