package com.index;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
//	a+b a & b are operand ,+operator
		Scanner sc=new Scanner(System.in);
		System.out.println("A=");
		int a=sc.nextInt();
		System.out.println("B=");
		int b=sc.nextInt();
		
		//Arithmetic operator
		
//		System.out.println("A+B="+" "+(a+b));
//		System.out.println("A+B="+" "+(a-b));
//		System.out.println("A+B="+" "+(a*b));
//		System.out.println("A+B="+" "+(a/b));
//		System.out.println("A+B="+" "+(a%b));
		
//		relational operator
//		
//		System.out.println("A+B="+" "+(a<b));
//		System.out.println("A+B="+" "+(a>b));
//		System.out.println("A+B="+" "+(a>=b));
//		System.out.println("A+B="+" "+(a<=b));
//		System.out.println("A+B="+" "+(a==b));
		
////		LOGICAL OPERATORS
//		
//		boolean x=true;
//		boolean y=false;
//		System.out.println("x&&y="+(x&&y));
//		System.out.println("x||y="+(x||y));
//		System.out.println("!x="+(!x));
		
//		increment operators or decrement operators
		
//		System.out.println("a ="+a);
//		System.out.println("a++ ="+(a++)); //post increment
//		System.out.println("after a++"+a);
//		
//		System.out.println("a ="+a);
//		System.out.println("++a ="+(++a)); //pre increment
//		System.out.println("after ++a"+a);
//		
//		System.out.println("a ="+a);
//		System.out.println("a-- ="+(a--)); //post decrement
//		System.out.println("after a--"+a);
//		
//		System.out.println("a ="+a);
//		System.out.println("--a ="+(--a)); //pre decrement
//		System.out.println("after --a"+a);
		//ASSIGNMENT OPERATOR 
		
//		System.out.println("A+=9"+(a+=9));//(a=a+9)
//		System.out.println("A-=9"+(a-=9));
//		System.out.println("A*=9"+(a*=9));
//		System.out.println("A/=9"+(a/=9));
		
		int age=15;
		String result=(age>=18)?"Elgible":"Not Elgible";
		System.out.println("the result is :"+result);
		
	}

}
