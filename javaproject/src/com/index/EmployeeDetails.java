package com.index;

import java.util.Scanner;

public class EmployeeDetails {
	int empId;
	String empName;
	double empSal;
	public void setDetails(int id,String name,double salary)
	{
		empId=id;
		empName=name;
		empSal=salary;
		
	}
	public void displayDetails()
	{
		System.out.println("Enter the employee id:"+empId);
		System.out.println("Enter the employee Name:"+empName);
		System.out.println("Enter the employee Salary:"+empSal);
	}
	public static void main(String[] args) {
	
		EmployeeDetails obj=new EmployeeDetails();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter the employee Salary:");
		double sal=sc.nextDouble();
		obj.setDetails(id, name, sal);
		System.out.println("Employee details");
		obj.displayDetails();
		
		
	}

}
