package com.index;

public class MethodParameter {
	

	public static void sayHello() //method with no parameter
	{
		System.out.println("Hi");
	}
	public static void greet(String name) //method with single parameter
	{
		System.out.println("hello"+" "+name);
	}
	public static void main(String[] args) {
		sayHello();//method calling
		greet("Bala");

	}

}
