package com.index;

public class MultipleParameter {
	public int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		MultipleParameter obj =new MultipleParameter();
		int result =obj.add(150,200);
		System.out.println("sum"+result);
		
		

	}

}
