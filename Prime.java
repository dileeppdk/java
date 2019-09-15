package com.Prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		 int n=sc.nextInt();
		 int flag=0;
		
		if(n==1 || n==0)
		{
		System.out.println("Prime starts from 2");
		}
		else
		{	
		for(int i=2;i<n ;i++)
		{
		if(n%i==0)
		{
		System.out.println("not a prime");
		flag=1;
		break;
		}
		}
	   if(flag==0)
	{
		
		  System.out.println("prime");
		
	}
	}
	}
	
}