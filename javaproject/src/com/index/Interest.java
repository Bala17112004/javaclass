package com.index;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Balance:");
		long amount=sc.nextLong();
		float rate= 5.5f;
		System.out.println("Final Balance:"+(amount+(amount*rate/100)));

	}

}


  

