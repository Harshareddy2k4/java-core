package com.array;

//Find the first even and odd number
public class Array22 {

	public static void main(String[] args) {
		int[] a = { 13, 37, 78, 987, 76, 1 };
		boolean even = false;
		boolean odd = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && !even) {
				System.out.println("EVEN NUMBER :" + a[i]);
				System.out.println("POSITION OF EVEN NUMBER :" + i);
				even = true;

			} else if (a[i] % 2 == 1 && !odd) {
				System.out.println("ODD NUMBER :" + a[i]);
				System.out.println("POSITION OF THIS NUMBER :" + i);
				odd = true;
			}
			if (even && odd) {
				break;
			}
		}

	}

}
