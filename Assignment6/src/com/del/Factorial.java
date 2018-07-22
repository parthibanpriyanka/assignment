package com.del;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int i,fact=1;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number ");
	Integer number = scan.nextInt();
	for(i=1;i<=number;i++) {
		fact=fact*i;
	}
	System.out.println("The factorial of "+number+" is "+fact);
	}
}
