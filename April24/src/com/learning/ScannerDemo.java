package com.learning;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your principal amount :");
		int amount = sc.nextInt();
		System.out.println("Enter your interest rate:");
		float interest = sc.nextFloat();
		System.out.println("Enter no.of EMIs:");
		int months = sc.nextInt();
		System.out.println("Are you an NRI?");
		boolean nri = sc.nextBoolean();
		System.out.println("Amount is"+amount);
		System.out.println("Interest is"+interest);
		System.out.println("Month is"+ months);
		System.out.println("NRI:"+nri);
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("Hi"+name);







		




	}

}
