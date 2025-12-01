package com.index;

import java.util.Scanner;

public class DaySix5 {

	public static void main(String[] args) {
//		5.Write a Java program to find the largest of two numbers using if-else.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2:");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+"is the Largest number");
		}
		else
		{
			System.out.println(num2+"is the Largest number");
		}

	}

}
