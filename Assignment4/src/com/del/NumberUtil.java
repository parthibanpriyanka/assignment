package com.del;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtil {
	
	private static int Multiply(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return number1*number2;
	}
	
	private static double SquareRoot(Integer number1) {
		// TODO Auto-generated method stub
		return Math.sqrt(number1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		try {
			Integer number1 = scan.nextInt();
			Integer number2 = scan.nextInt();
			System.out.println("The product of " + number1 + " and " + number2 + " is " + Multiply(number1, number2));
			System.out.println("The square root of " + number1 + " is " + SquareRoot(number1));
		}
		catch (InputMismatchException e) {
			System.out.println("Enter only whole numbers");
			}

			finally {
				scan.close();
			}


}

	

	
}

