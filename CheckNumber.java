package com.numbercheck;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[]args) {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		CheckNumber(-999);
	}
	public static void CheckNumber(int n) {
	//Scanner sc = new Scanner(System.in);
	//n = sc.nextInt();
	if(n>0) {
		System.out.println("Positive");
	}else if(n<0) {
		System.out.println("Negative");
	}else if(n==0) {
		System.out.println("zero");
	}
	}
}
