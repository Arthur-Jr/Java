package entities;

public class BankAccount {
	private String accountNumber, holderName;
	private double accountBalance;

	public BankAccount(String accountNumber, String holderName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.deposit(initialDeposit);
	}

	public BankAccount(String accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	public String getaccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(double valueToDeposit) {
		this.accountBalance += valueToDeposit;
	}
	
	public void withdraw(double valueTowithdraw) {
		this.accountBalance -= valueTowithdraw;
		this.accountBalance -= 5.0;
	}

	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holderName
				+ ", Balance: $"
				+ String.format("%.2f", accountBalance);
	}
}
