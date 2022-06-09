package entities;

import exceptions.AccountException;

public class Account {
	private Integer number;
	private String holder;
	private double balance, withdrawLimit;

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void WithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws AccountException {
		if (amount > this.withdrawLimit) {
			throw new AccountException("The amount exceeds withdraw limit");
		}
		
		if (amount > this.balance) {
			throw new AccountException("Not enough balance");
		}
		
		this.balance -= amount;
	}
}
