package com.whileloop;
//Print numbers between 100 and 200 divisible by 5
import java.util.Scanner;

public class While7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FROM WHERE YOU WANT TO START :");
		int a = sc.nextInt();
		System.out.println("ENTER THE END POINT :");
		int b = sc.nextInt();
		while(a<=b) {
			if(a%5==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		sc.close();
	}

}
