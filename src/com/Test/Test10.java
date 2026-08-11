package com.Test;

public class Test10 {
	static String bankname;
	static String ifsccode;
	double balance;
	String acchname;
	long accnumber;
	 static long accnum=100100011;
	Test10(double balance,String acchname){
		this.balance = balance;
		this.acchname = acchname;
		this.accnumber =accnum++;
	}
	void account() {
		System.out.println("bank name is :"+bankname);
		System.out.println("bank ifsc code :"+ifsccode);
		System.out.println("acc holder name :"+acchname);
		System.out.println("balance is :"+balance);
		System.out.println("account number is :"+accnum);
	}
	public static void main(String[] args) {
		ifsccode = "sbi10021";
		bankname= "sbi";
		System.out.println("welcome to bank");
		Test10 t = new Test10(0.0,"abhi");
		t.account();
		Test10 t1 = new Test10(20.0,"harsha");
		t1.account();
		Test10 t2 = new Test10(30.0,"karthik");
		t2.account();
	
	}

}
