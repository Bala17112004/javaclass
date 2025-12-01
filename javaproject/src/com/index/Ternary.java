package com.index;

import java.util.Scanner;

public class Ternary {
	public static void getGrade(int marks)
	{
		String get=(marks>90)?"Grade A":(marks>80)?"Grade B":(marks>70)?"Grade C":(marks>60)?"Grade D":
			(marks>50)?"Grade E":(marks>40)?"Grade F":"Fail";
		System.out.println(get);				
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int Marks=sc.nextInt();
		getGrade(Marks);
	}
}
