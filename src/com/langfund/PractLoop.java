package com.langfund;
import java.util.Scanner;
//Check whether a number is a palindrome.
public class PractLoop {
	public static void main(String[] args) {
		System.out.println("palindrome");
		Scanner sc = new Scanner(System.in);
		int reverse =0;
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int original = num;
		for(;num!=0;num=num/10) {
			int digit=num%10;
			reverse = reverse * 10 + digit;
		}
		if(original==reverse) {
			System.out.println("its a palindrome");
		}else {
			System.out.println("its not a palindrome");
		}
	}

}
