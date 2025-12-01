package com.index;

import java.util.Scanner;

public class DaySeven3 {

	public static void main(String[] args) {
//		3.Write a program for ATM withdrawal:

//			3.1.Check balance

//			3.2.Then check if amount ≤ limit
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Withdrawal Amount:");
		int cash=sc.nextInt();
		int balance=50000;
		int limit=10000;
		if(cash>balance)
		{
			System.out.println("Insufficient balance");
			
		}
		else if(cash>limit)
		{
			System.out.println("Daily Withdrawal Exceeded ");
		}
		else
		{
			int remainbalance=balance-cash;
			System.out.println("Withdrawal succesful");
			System.out.println("Display the Balance:"+remainbalance);
		}

	}

}
