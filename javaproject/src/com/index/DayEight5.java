package com.index;

import java.util.Scanner;

public class DayEight5 {

	public static void main(String[] args) {
		// 
//		4.Write a program to Count digits in a number (ex: 5678 → 4 digits).
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Number of Digits:"+count);
	}

}
