package com.index;

import java.util.Scanner;

public class Total {
	public int calculateTotal(int m1,int m2,int m3)
	{
		return m1+m2+m3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark1:");
		int mark1=sc.nextInt();
		System.out.println("Enter the Mark2:");
		int mark2=sc.nextInt();
		System.out.println("Enter the Mark3:");
		int mark3=sc.nextInt();
		Total obj=new Total();
		int total=obj.calculateTotal(mark1, mark2, mark3);
		System.out.println("Total marks is"+" "+total);
		

	}

}
