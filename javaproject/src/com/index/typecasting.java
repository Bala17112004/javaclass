package com.index;

public class typecasting {

	public static void main(String[] args) {
		//widening /implicit type casting
		//byte-->short-->int-->long-->float-->double.
		byte b=10;
		short s=b;
		int i=s;
		long l=s;
		float f=l;
		double d=f;
		System.out.println("byte"+" "+b);
		System.out.println("short"+" "+s);
		System.out.println("int"+" "+i);
		System.out.println("long"+" "+l);
		System.out.println("double"+" "+d);
		
//		narrowing/explicit type casting
		double d1=12.456;
		float f1=(float)d1;
		long l1=(long)f1;
		int i1=(int)l1;
		short s1=(short)i1;
		byte b1=(byte) s1;
		
		System.out.println("byte"+" "+b1);
		System.out.println("short"+" "+s1);
		System.out.println("int"+" "+i1);
		System.out.println("long"+" "+l1);
		System.out.println("double"+" "+d1);

	}

}
