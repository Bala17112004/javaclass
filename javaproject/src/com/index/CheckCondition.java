package com.index;

import java.util.Scanner;

public class CheckCondition {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if(a<0)
		{
			System.out.println("Negative");
			
		}
		else 
		{
			System.out.println("Equal");
		}

	}

}
