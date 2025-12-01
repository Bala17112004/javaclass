package com.index;

import java.util.Scanner;

public class DaySix3 {

	public static void main(String[] args) {
		//3.Write a Java program using a for loop to print the multiplication table of a number (e.g., 5) up to 10.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table number:");
		int tab=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+tab+"="+(tab*i));
		}

	}

}
