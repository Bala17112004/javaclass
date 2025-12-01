package com.index;

import java.util.Scanner;

public class DayEight4 {

	public static void main(String[] args) {
		// 5.Write a program to Check if temperature is Hot, Warm, Cold.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature:");
		int temp=sc.nextInt();
		if(temp>=30)
		{
			System.out.println("Hot");
		}
		else if(temp>=15)
		{
			System.out.println("Warm");
		}
		else if(temp<15)
		{
			System.out.println("Cold");
		}
		else
		{
			System.out.println("Mismatched");
		}
		
		

	}

}
