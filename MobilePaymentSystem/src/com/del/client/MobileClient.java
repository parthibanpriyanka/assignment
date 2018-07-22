package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.PaymentException;
import com.del.service.MobileService;
import com.del.service.MobileServiceImpl;


public class MobileClient {
	private MobileService mService;
	

	
	public MobileClient() {
		mService = new MobileServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice=0;
		System.out.println("Welcome to Mobile Payment System");
		System.out.println("Enter Mobile Number to login :");
		String login=scan.nextLine(); //9812123434
		System.out.println("Enter Password"); //del123
		String password = scan.nextLine();
		boolean loginSuccess = mService.authenticate(login,password);
		//if login and password correct continue else print wrong login or password
		if (loginSuccess) {
			// display mobile number and pending payment
			System.out.println(" Mobile number : "+ login);
			System.out.println("Payment Due :" + mService.paymentDue());
			
			while(true) {
				choice = getChoice(scan);
				// choose to make payment or quit
				switch (choice) {
				case 1:
					System.out.println("MAKE PAYMENT");
					System.out.println("Enter amount to be payed :");
					double amount = 0;
					try {
						amount = scan.nextDouble();
						//mService.paymentAmount(amount);
//						System.out.println("Payment made");
						System.out.println("Pending payment :"+ mService.paymentAmount(amount));
						}
					catch(PaymentException e) {
						System.err.println(e.getMessage());
					}
					catch(InputMismatchException e) {
						System.err.println("Enter number only for the payment amount");
						scan.nextLine();
					}
					break;
				case 2:
					System.out.println("Payment Due :" + mService.paymentDue());
					break;
				case 3:
					System.out.println("Exiting...Thank you.");
					System.exit(0);
				default:
					System.out.println("Enter the correct choice");
					break;
				}
			}
			
		}
		else {
			System.out.println("Either login or password is wrong");
		
		}
	}
	
	int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("MOBILE PAYMENT");
		System.out.println("1. Make Payment");
		System.out.println("2. Check Pending Payment");
		System.out.println("3. Quit program");
		System.out.println("Enter a choice 1 or 2");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Please enter numbers only");
			scan.nextLine();
		}
		return choice;
	}
public static void main(String[] args) {
		new MobileClient();

	}


}
