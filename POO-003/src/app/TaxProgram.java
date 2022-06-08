package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import tax.entities.Company;
import tax.entities.Individual;
import tax.entities.Tax;

public class TaxProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Tax> payerList = new ArrayList<>();
		double sum = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i += 1) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthCosts = sc.nextDouble();
				payerList.add(new Individual(name, income, healthCosts));
			}
			
			if (type == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				payerList.add(new Company(name, income, numberOfEmployees));
			}
			
			System.out.println();
		}
		
		System.out.println("TAXES PAID:");

		for (Tax payer : payerList) {
			System.out.println(payer);
			sum += payer.getTax();
		}
		System.out.println();
		
		System.out.printf("TOTAL TAXES? $%.2f", sum);
	}
}
