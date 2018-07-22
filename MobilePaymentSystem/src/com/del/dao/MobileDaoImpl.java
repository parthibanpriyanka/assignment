package com.del.dao;

import com.del.exception.PaymentException;
import com.del.util.Message;

public class MobileDaoImpl implements MobileDao {
	private double pendingPayment=1000;
	private String login= "9812123434";
	private String password="del123";
	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return this.login.equals(login) && 
				this.password.equals(password);
	}
	@Override
	public double paymentAmount(double amount) throws PaymentException {
		if (amount<pendingPayment)
		{
			pendingPayment = pendingPayment - amount;
			System.out.println("Payment made");
		}
		else
		{
			isMoreThanPendingAmount();
		}
		return pendingPayment;
	}
	private boolean isMoreThanPendingAmount() throws PaymentException
    {
       System.out.println("Payment Due : "+ pendingPayment);
		throw new PaymentException(Message.MORE_THAN_PENDING_AMOUNT);
       
}

	@Override
	public double pendingPayment() {
		// TODO Auto-generated method stub
		return pendingPayment;
	}
	
	

}
