package com.del.service;

import com.del.exception.PaymentException;

public interface MobileService {

	boolean authenticate(String login, String password);

	double paymentAmount(double amount) throws PaymentException;

	double paymentDue();

	

}
