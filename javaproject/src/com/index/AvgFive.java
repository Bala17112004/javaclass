package com.index;

import java.util.Scanner;

public class AvgFive {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mark1:");
		int sub1=sc.nextInt();
		System.out.println("Enter the mark2:");
		int sub2=sc.nextInt();
		System.out.println("Enter the mark3:");
		int sub3=sc.nextInt();
		System.out.println("Enter the mark4:");
		int sub4=sc.nextInt();
		System.out.println("Enter the mark5:");
		int sub5=sc.nextInt();
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total:"+total);
		
		double avg=total/5;
		System.out.println("average:"+avg);
		





	}

}
