package com.array;
//Find the length of an array

public class Array2 {

	public static void main(String[] args) {
		int[] arr = { 23, 23, 4, 5, 6, 7 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println("TOTAL LENGTH OF AN ARRAY :" + count);
		System.out.println(arr.length);
	}

}
