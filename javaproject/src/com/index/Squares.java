package com.index;

import java.util.Scanner;

public class Squares {
	public int power(int a)
	{
		return a*a;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the A value:");
		int power=sc.nextInt();
		Squares obj =new Squares();
		int result=obj.power(power);
		System.out.println("Squares of A Value is:"+result);
		
		
		

	}

}
