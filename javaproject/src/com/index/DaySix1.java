package com.index;

import java.util.Scanner;

public class DaySix1 {

	public static void main(String[] args) {
		//1.Write a Java program to check if a given number is positive. If it is, display “The number is positive”.
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the positive number:");
		int num =sc.nextInt();
		if(num>0)
		{
			System.out.println("The number is positive");
		}
	}

}
