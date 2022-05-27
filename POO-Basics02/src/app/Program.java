package app;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String accNumber, holderName;
		double initialDeposit;
		BankAccount acc;
		
		System.out.print("Enter account number: ");
		accNumber = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		holderName = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();

			acc = new BankAccount(accNumber, holderName, initialDeposit);			
		} else {
			acc = new BankAccount(accNumber, holderName);
		}
		
		System.out.println("Account data:");
		System.out.println(acc.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(acc.toString());
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		
		System.out.println("Updated account data:");
		System.out.println(acc.toString());

		sc.close();
	}
}
