package com.index;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employeename:");
		String name= sc.nextLine();
		System.out.println("Enter the EmployeeSalary:");
		float sal=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the Employee Designation:");
		String desgin=sc.nextLine();
		System.out.println("Enter the Employee City:");
		String city =sc.nextLine();	
		
		System.out.println("Enter the Employee id:"+id);
		System.out.println("Enter the Employee name:"+name);
		System.out.println("Enter the Employee Salary:"+sal);
		System.out.println("Enter the Employee designation:"+desgin);
		System.out.println("Enter the Employee city:"+city);
		
		

	}

}
