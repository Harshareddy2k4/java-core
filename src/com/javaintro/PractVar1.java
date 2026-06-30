package com.javaintro;
//static and instance variables
public class PractVar1 {
 static int VcubeId;
 static String VcubeCourse;
 String FrndName;
 String FriendCapability;
 long FriendNum;
	public static void main(String[] args) {
		System.out.println("HELLO VCUBE WORLD!!!!!");
		System.out.println("FRIEND 1 INFO :");
		PractVar1 var = new PractVar1();
	 VcubeId = 33;
	 VcubeCourse = "JAVA";
	 var.FrndName = "Abhinav";
	 var.FriendCapability = "Doubts";
	 var.FriendNum = 9346507451L;
		System.out.println("Vcube Id :"+VcubeId);
		System.out.println("Vcube Course :"+VcubeCourse);
		System.out.println("Friend Name :"+var.FrndName);
		System.out.println("Friend Capability :"+var.FriendCapability);
		System.out.println("Friend Number :"+var.FriendNum);
		System.out.println("FRIEND 2 INFO :");
		PractVar1 var1 = new PractVar1();
	 var1.FrndName = "Vishu";
	 var1.FriendCapability = "Confusing";
	 var1.FriendNum = 9618495778L;
		System.out.println("Vcube Id :"+VcubeId);
		System.out.println("Vcube Course :"+VcubeCourse);
		System.out.println("Friend Name :"+var1.FrndName);
		System.out.println("Friend Capability :"+var1.FriendCapability);
		System.out.println("Friend Number :"+var1.FriendNum);
		System.out.println("MY INFO :");
		PractVar1 var2 = new PractVar1();
		 var2.FrndName = "Harsha Reddy";
		 var2.FriendCapability = "Memory loss";
		 var2.FriendNum = 9392667871L;
			System.out.println("Vcube Id :"+VcubeId);
			System.out.println("Vcube Course :"+VcubeCourse);
			System.out.println("Friend Name :"+var2.FrndName);
			System.out.println("Friend Capability :"+var2.FriendCapability);
			System.out.println("Friend Number :"+var2.FriendNum);
			System.out.println("FRIEND 3 INFO :");
			PractVar1 var3 = new PractVar1();
		 var3.FrndName = "Ranganath";
		 var3.FriendCapability = "Alagatam";
		 var3.FriendNum = 6309862349L;
			System.out.println("Vcube Id :"+VcubeId);
			System.out.println("Vcube Course :"+VcubeCourse);
			System.out.println("Friend Name :"+var3.FrndName);
			System.out.println("Friend Capability :"+var3.FriendCapability);
			System.out.println("Friend Number :"+var3.FriendNum);
			System.out.println("FRIEND 4 INFO :");
			PractVar1 var4 = new PractVar1();
			VcubeId = 44;
			 VcubeCourse = "Nothing";
		 var4.FrndName = "Lakshman";
		 var4.FriendCapability = "Kotlaata";
		 var4.FriendNum = 9398368830L;
			System.out.println("Vcube Id :"+VcubeId);
			System.out.println("Vcube Course :"+VcubeCourse);
			System.out.println("Friend Name :"+var4.FrndName);
			System.out.println("Friend Capability :"+var4.FriendCapability);
			System.out.println("Friend Number :"+var4.FriendNum);
			
		
	}

}
