package com.langfund;
import java.util.Scanner;
//Find the smallest digit in a number.
public class PractLoop4 {
	public static void main(String[] args) {
		System.out.println("smallest number in given number");
		Scanner sc = new Scanner(System.in);
		int smallest=9;
		System.out.println("enter a number :");
		int num = sc.nextInt();
		for(; num!=0; num=num/10) {
			int digit = num%10;
			if(digit<smallest) {
				smallest = digit;
			}
		}
		System.out.println(smallest);
	}

}
