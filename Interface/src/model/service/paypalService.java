package model.service;

public class paypalService implements PaymentService {
	private static final double PERCENTAGE = 0.02;
	private static final double MONTH_PERCENTAGE = 0.01;
	
	public Double paymentFee(Double amount) { 
		return amount * PERCENTAGE;
	}
	
	public Double interest(Double amount, int months) {
		return amount * (MONTH_PERCENTAGE * months);
	}
}
