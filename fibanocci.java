package com.fabinoccii;

import java.util.Scanner;

public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER NUMBER");
    int n=sc.nextInt();
    int a=0;
    int b=1;
    int c=0;
    System.out.print(a);
    System.out.print(b);
    for (int i = 2; i <=n; i++)
    {
    c=a + b;
    if(c<=n)
    {
    //c=a + b;
    System.out.print(c);
    a=b;
    b=c;
    }
    }
	
}
}
