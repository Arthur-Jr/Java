package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private PaymentService service;

	public ContractService(PaymentService service) {
		this.service = service;
	}

	public PaymentService getService() {
		return service;
	}

	public void setService(PaymentService service) {
		this.service = service;
	}
	
	public void processContract(Contract contract, Integer months) {
		double monthPayment = contract.getTotalValue() / months;
		
		for (int month = 1; month <= months; month += 1) {
			Date paymentDate = this.getNextMonth(contract.getDate(), month);
			double simpleValue = monthPayment + this.service.interest(monthPayment , month);
			double fullValue = simpleValue + this.service.paymentFee(simpleValue);
			
			contract.addInstallment(new Installment(paymentDate, fullValue));
		}
	}
	
	private Date getNextMonth(Date date, int num) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, num);
		return cal.getTime();
	}
}
