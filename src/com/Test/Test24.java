package com.Test;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pow;
		int sum =0;
		System.out.println("ENTER A NUMBER :");
		int a = sc.nextInt();
		int ori=a;
		pow = (a*a);
		for(;pow!=0;pow=pow/10) {
			sum+=pow%10;
		}
		if(sum==ori) {
			System.out.println("ITS A NEON NUMBER ");
		}else if(sum!=0){
			System.out.println("ITS NOT A NEON NUMBER");
		}
		sc.close();

	}

}
