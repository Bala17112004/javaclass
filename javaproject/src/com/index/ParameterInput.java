package com.index;

import java.util.Scanner;

public class ParameterInput {
	public int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1= sc.nextInt();
		System.out.println("Enter the number2:");
		int num2= sc.nextInt();
		ParameterInput obj=new ParameterInput();
		int result=obj.add(num1,num2);
		System.out.println("result:"+result);
		

	}

}
