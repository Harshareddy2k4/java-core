package com.array;

//Find the average of elements
public class Array9 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 987, 76 };
		int avg = 0;
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count++;
		}
		avg = sum / count;
		System.out.println("TOTAL AVERAGE OF GIVEN NUMBERS :" + avg);
	}

}
