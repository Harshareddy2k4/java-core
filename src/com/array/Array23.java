package com.array;

//Find the first positive and negative number
public class Array23 {

	public static void main(String[] args) {
		int[] a = { 13, 37, 78, -987, 76, 1 };
		boolean pos = false;
		boolean neg = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 && !pos) {
				System.out.println("POSITIVE NUMBER :" + a[i]);
				System.out.println("POSITION OF POSITIVE  NUMBER :" + i);
				pos = true;

			} else if (a[i] <0 && !neg) {
				System.out.println("NEGATIVE NUMBER :" + a[i]);
				System.out.println("POSITION OF NEGATIVE NUMBER :" + i);
				neg = true;
			}
			if (pos && neg) {
				break;
			}
		}

	}

}