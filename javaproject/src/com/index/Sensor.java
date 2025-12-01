package com.index;

import java.util.Scanner;

public class Sensor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Orginial Temperature:");
		float temp=sc.nextFloat();
		int tempi=(int)temp;
		System.out.println("Converted Temperature:"+tempi);

	}

}
