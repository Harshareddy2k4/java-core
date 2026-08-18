package com.array;

//Find the last element
public class Array7 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 987, 76 };
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
