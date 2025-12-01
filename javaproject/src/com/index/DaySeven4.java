package com.index;

import java.util.Scanner;

public class DaySeven4 {

	public static void main(String[] args) {
//		4.Write a program to Count how many times a number is divisible by 2 (example: 40 → divides 3 times)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		while(num%2==0)
		{
			num=num/2;
			count++;
		}
		System.out.println("the number is divisible by 2 is:"+count+"times");
	}

}
