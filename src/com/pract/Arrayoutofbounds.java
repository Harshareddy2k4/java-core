package com.pract;

public class Arrayoutofbounds {

	public static void main(String[] args) {
		System.out.println("MAIN MERHOD STARTDED");
		int a[] = {1,2,3,4,5};
		try {
			for(int i =0;i<=a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("MAIN METHOD ENDED");
	}

}
