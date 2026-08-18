package com.array;

import java.util.Arrays;

//Print array in reverse
public class Array5 {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 50, 60 };
		int rev[] = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			rev[j] = arr[i];
		}
		System.out.println("ARRAY IN REVERSE :" + Arrays.toString(rev));

	}

}
