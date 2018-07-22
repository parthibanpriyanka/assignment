package com.del;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer number = scan.nextInt();
		System.out.println("Number is prime : "+ checkPrime(number));
	}

	private static boolean checkPrime(Integer number) {
		int i,m=0,flag=0;
		m=number/2;
		if(number==0||number==1) {
			return false;
		}
		else 
		{
			for(i=2;i<=m;i++) {
				if(number%i==0)
				{   
					flag=1;
					return false;
					
				}
			}
			if(flag==0) {
				return true;
			}
			
		}
		return false;
	}

}
