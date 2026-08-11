package com.langfund;

import java.util.Scanner;

public class PractArray5 {
	static void findprime(int[] n){
		for (int i = 0; i < n.length; i++) {
		    int num = n[i];
		    boolean isPrime = true;
		    for (int j = 2; j <= num / 2; j++) {
		    	 if (num % j == 0) {
		                isPrime = false;
		                break;
		    }
		    }
		      if (num > 1 && isPrime) {
		            System.out.print(num +" ");
		        }
		    }
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Array World");
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the size :");
		int a = sc.nextInt();
		int arr[] = new int [a];
		System.out.println("Enter "+arr.length + " numbers:");

		for (int i = 0; i < arr.length; i++) {
		    arr[i] = sc.nextInt();
		}
		findprime(arr);
	}

}
