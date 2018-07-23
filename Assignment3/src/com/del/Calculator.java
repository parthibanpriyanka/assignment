package com.del;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	private static int Divide(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return number1 / number2;
	}

	private static int Multiply(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}

	private static int Subtract(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return number1 - number2;
	}

	private static int Sum(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		try {
			Integer number1 = scan.nextInt();
			Integer number2 = scan.nextInt();
			System.out.println("The sum of " + number1 + " and " + number2 + " is " + Sum(number1, number2));
			System.out
					.println("The difference of " + number1 + " and " + number2 + " is " + Subtract(number1, number2));
			System.out.println("The product of " + number1 + " and " + number2 + " is " + Multiply(number1, number2));
			System.out.println("The quotient of " + number1 + " and " + number2 + " is " + Divide(number1, number2));
		} catch (ArithmeticException e) {
	System.out.println("The second number should be greater than 0");
	}
		catch (InputMismatchException e) {
		System.out.println("Enter only whole numbers");
		}

		finally {
			scan.close();
		}

	}
}
