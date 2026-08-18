package com.array;

//Find the largest element
public class Array11 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 987, 76 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		System.out.println("LARGEST NUMBER IN GIVEN ARRAY IS :" + temp);

	}

}
