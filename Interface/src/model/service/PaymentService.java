package model.service;

public interface PaymentService {
	public Double paymentFee(Double amount);
	
	public Double interest(Double amount, int months);
}
