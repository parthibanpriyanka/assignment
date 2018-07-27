package com.del;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("enter choice ");
		System.out.println("1.addition 2.subtraction 3.multiplication 4.division");
		choice = scan.nextInt();
		Arthimetic[] arthimetic = { new Addition(0, 0, 0), new Subtraction(0, 0, 0), new Multiply(0, 0, 0),
				new Divison(0, 0, 0) };
		arthimetic[choice - 1].input();
		try {
			arthimetic[choice - 1].calculate();
			arthimetic[choice - 1].display();
		}
		catch(ArithmeticException e){
			System.out.println("second number cannot be zero");	
		}
		finally {
			scan.close();
		}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
