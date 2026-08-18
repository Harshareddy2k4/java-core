package com.array;
//Print only odd elements
public class Array14 {

	public static void main(String[] args) {
		int[] a = { 12, 34, 56, 78, 987, 76, 1 };
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]+" ");
			}
		}
	}

}
