package com.del;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements : ");
			Integer indices = scan.nextInt();
			int array[] = new int[indices];
			System.out.println("enter elements : ");
			for (int i = 0; i < indices; i++) {// for reading array
				array[i] = scan.nextInt();
			}
				boolean result=UseMainCode.checkTripplets(array,indices);
				System.out.println("check for tripplets: "+result);
		}
			catch(InputMismatchException e)
			{
				System.out.println("Enter only numbers");
			}
		finally {
			scan.close();
		}
	}

}
