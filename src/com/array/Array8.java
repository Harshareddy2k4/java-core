package com.array;

//Find the sum of elements
public class Array8 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 987, 76 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("TOTAL SUM OF ELEMENTS :" + sum);
	}

}
