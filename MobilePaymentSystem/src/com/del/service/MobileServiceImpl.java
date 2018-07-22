package com.del.service;

import com.del.dao.MobileDao;
import com.del.dao.MobileDaoImpl;
import com.del.exception.PaymentException;

import com.del.util.Message;

public class MobileServiceImpl implements MobileService {

	private MobileDao mDao;
	
	
	
	public MobileServiceImpl() {
		mDao= new MobileDaoImpl();
	
	}
	public double paymentDue() {
		// TODO Auto-generated method stub
		return mDao.pendingPayment();
	}

	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return mDao.authenticate(login,password);
	}

	@Override
	public double paymentAmount(double amount) throws PaymentException{
		
		isAmountNegative(amount);
		return mDao.paymentAmount(amount);
		
	}
	private boolean isAmountNegative(double amount) throws PaymentException
		    {
	if(amount<0) {
	   throw new PaymentException(Message.NEGATIVE_VALUE);
	}
	return true;
	}
}
	
