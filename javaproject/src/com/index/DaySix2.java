package com.index;

import java.util.Scanner;

public class DaySix2 {

	public static void main(String[] args) {
//		2.Write a program to check if a given number is even or odd using `if-else
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
		System.out.println("this is even number");
		}
		else
		{
			System.out.println("this is odd number");
	
		}

	}

}
