package com.index;

import java.util.Scanner;

public class DaySeven2 {

	public static void main(String[] args) {
//		2.Write a program to Check age category (Child, Teenager, Adult, Senior).
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		if(age<=12)
		{
			System.out.println("this age is Child");
		}
		else if(age<=19)
		{
			System.out.println("This age is Teenager ");
		}
		else if(age<=40)
		{
			System.out.println("This age is Adult");
		}
		else if(age>40)
		{
			System.out.println("This age is Senior ");
		}
		else
		{
			System.out.println("Mismatched");
		}
		
		
	}

}
