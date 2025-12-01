package com.index;

import java.util.Scanner;

public class Student {
	public void grades(String name,int id,long grade)
	
	
	{
		System.out.println("The Student name is "+" "+name);
		System.out.println("The Student id is "+" "+id);
		System.out.println("The Student Grade is"+" "+grade);
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Student name is");
		String names=sc.nextLine();
		System.out.println("Enter the Student id is");
		int reg=sc.nextInt();
		System.out.println("Enter the Student Grade is");
		long mark=sc.nextLong();
		Student obj= new Student();
		obj.grades(names, reg, mark);
		
		
		

	}

}
