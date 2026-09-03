package com.Test;

public class Encap1i {

    public static void main(String[] args) {
    	Encap1 b = new Encap1(123456789, "Harsha");
        System.out.println("ACCOUNT HOLDER NAME :"+b.getAccountNumber());
        System.out.println("ACCOUNT HOLDER NAME :"+b.getHolderName());
        System.out.println("Initial Balance: ₹" + b.getBalance());
        b.deposit(2000);
        b.withdraw(1500);
        System.out.println("Final Balance: ₹" + b.getBalance());
    }
}
