package com.index;

import java.util.Scanner;

public class ParameterVoid {
	public void PrintMessage(String message)
	{
		System.out.println("Your message is "+" "+message);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the message ");
		String msg=sc.nextLine();
		
		ParameterVoid obj=new ParameterVoid();
		obj.PrintMessage(msg);
		
		

	}

}
