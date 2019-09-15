package com.Prime;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter number");
	
		int n,flag=0;
		n=sc.nextInt();
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