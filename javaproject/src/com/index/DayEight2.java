package com.index;

import java.util.Scanner;

public class DayEight2 {

	public static void main(String[] args) {
//		Write a program to Check if a number is divisible by 7.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%7==0)
		{
			System.out.println("The number is Divsible by 7");
		}
		else
		{
			System.out.println("The number is not  Divsible by 7");
		}
	}

}
