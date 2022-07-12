package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				employeeList.add(new Employee(name, email, salary));
				
				line = br.readLine();
			}
			
			System.out.print("Enter base salary: ");
			Double baseSalary = sc.nextDouble();
			
			Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());
			
			List<String> empEmails = employeeList.stream()
					.filter(e -> e.getSalary() > baseSalary)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + baseSalary);
			
			for (String email : empEmails) {
				System.out.println(email);
			}
			
			Double empSum = employeeList.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.printf("Sum of salary of people whose name starts with \"M\": %.2f", empSum);
	
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
