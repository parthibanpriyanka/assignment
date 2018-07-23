package com.del;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number :"); //50
			try{
				Integer number = scan.nextInt();
			System.out.println("the divisors of" + number + " are : ");
			for (int i=1;i<=number;i++)
				{
				if (number%i==0)
					System.out.print(i + " ");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				scan.close();
			}
		
       
	}

}
