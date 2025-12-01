package com.index;

import java.util.Scanner;

public class Offer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Original price:");
		double amount=sc.nextDouble();
		System.out.println("Discount:");
		int discounts =sc.nextInt();
		System.out.println("Final Price:"+(amount-(amount*discounts/100)));

	}

}
