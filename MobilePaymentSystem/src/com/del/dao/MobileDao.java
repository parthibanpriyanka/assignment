package com.del.dao;

import com.del.exception.PaymentException;

public interface MobileDao {

	boolean authenticate(String login, String password);

	double paymentAmount(double amount) throws PaymentException;

	double pendingPayment();

}
