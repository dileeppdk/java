package com.palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0,rem;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int temp=n;
		while(n>0)		{
			rem=n % 10;
			sum=(sum*10)+rem;
			n=n / 10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Plaindrome");
		}

}
}