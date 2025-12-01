package com.index;

import java.util.Scanner;

public class DaySix4 {

	public static void main(String[] args) {
//		4. Write a program to calculate the sum of digits of a number using a while loop.
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int sum = 0;

		        while(num > 0) {
		            sum=sum+(num%10);
		            num=num/10;
		        }

		        System.out.println("Sum of digits = " + sum);
		    }
		}


