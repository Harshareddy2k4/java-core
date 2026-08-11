package com.Test;

import java.util.Scanner;

public class Test9 {
	String name;
	int matches;
	int runs;
	Test9 (String name,int matches,int runs){
	this.name=name;
	this.matches=matches;
	this.runs=runs;
	}
	void show() {
		System.out.println("player details :");
		System.out.println("player name :"+name);
		System.out.println("number of matches he played :"+matches);
		System.out.println("number of runs he scored :"+runs);
	}

	public static void main(String[] args) {
		System.out.println("Cricket player statistics");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a player name :");
		String name = sc.nextLine();
		System.out.println("eneter number of matches played :");
		int matches = sc.nextInt();
		System.out.println("enter his career runs :");
		int runs = sc.nextInt();
		Test9 t = new Test9(name,matches,runs);
		t.show();
	}

}
