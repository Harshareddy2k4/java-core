package com.array;

public class Array31 {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0;i<a.length;i++) {
			a[i][i]=Math.powExact(a[i][i], 2);
			System.out.print(a[i][i]+" \t ");
		}

	}

}
