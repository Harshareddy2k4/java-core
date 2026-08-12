package com.Loops;

import java.util.Scanner;

public class For38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				if(i%2==0) {
					sum+=i;
					System.out.print(i+" ");
				}
			}
		}
		System.out.println("SUM OF EVEN FACTORS :"+sum);
		sc.close();
	}

}
