package com.Test;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME :");
		String a = sc.next();
		System.out.println("ENTER SECOND NAME :");
		String b = sc.next();
		char ch =0;
		char ch1 =0;
		for(int i=0;i<a.length()-1;i++) {
		ch1=b.charAt(i);
		ch=a.charAt(i);
		}
		if(ch==ch1) {
			System.out.println("BOTH ARE SAME");
		}else {
			System.out.println("BOTH ARE NOT SAME");
		}
		sc.close();
	}

}
