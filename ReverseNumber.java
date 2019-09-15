package com.Reverse;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Please enter number to be reversed: ");
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
     
        int sum = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));  
	}
	public static int reverse(int number){
        int sum = 0;
        int remainder;
        do{
            remainder = number%10;
            sum = sum*10 + remainder;
            number = number/10;
         
        }while(number > 0);
     
        return sum;
    }

}



