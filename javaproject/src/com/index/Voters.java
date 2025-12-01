package com.index;

public class Voters {
	 public static void voter(int age)
	 {
		 String category=(age>18)?"Eligible for vote":"Not Eligible for vote";
		 System.out.println(category);
	 }

	public static void main(String[] args) {
		voter(15);
		
		

	}

}
