package com.evenodd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if (n%2==0) 
			System.out.println("Number is EVEN");
		
		else 
			System.out.println("number is ODD");
		
	}

}
