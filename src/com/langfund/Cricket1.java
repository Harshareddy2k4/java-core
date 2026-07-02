package com.langfund;

public class Cricket1 {
	static String teamName;
	String playerName;
	int runs;
	public static void main(String[] args) {
		System.out.println("Cricketer 1 details!!!");
		Cricket1 cp = new Cricket1();
		Cricket1 cp1 = new Cricket1();
		teamName ="India";
		cp.playerName = "Virat";
		cp.runs =28000;
		System.out.println("team name :"+teamName);
		System.out.println("team name :"+cp.playerName);
		System.out.println("team name :"+cp.runs);
		
		System.out.println("player 2 info!!");
		cp1.playerName = "abd";
		cp1.runs =17000;
		System.out.println("team name :"+teamName);
		System.out.println("team name :"+cp1.playerName);
		System.out.println("team name :"+cp1.runs);
		

	}

}
