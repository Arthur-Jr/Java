package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int employeeQuantity;
		List<Employee> employeeList = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		employeeQuantity = sc.nextInt();
		sc.nextLine();
		System.out.println();

		for (int i = 1; i <= employeeQuantity; i += 1) {
			System.out.print("employee name? ");
			String employeeName = sc.nextLine();

			System.out.print("employee salary? ");
			double employeeSalary = sc.nextDouble();
			sc.nextLine();

			Employee newEmployee = new Employee(i, employeeName, employeeSalary);
			employeeList.add(newEmployee);

			System.out.println("Registered");
			System.out.println("-------------");
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		sc.nextLine();

		Employee emp = employeeList.stream().filter(x -> x.getID() == employeeId).findFirst().orElse(null);

		if (emp == null) {
			System.out.print("This id does not exists");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			int percentage = sc.nextInt();

			emp.incSalary(percentage);
		}

		for (Employee employee : employeeList) {
			System.out.println();
			System.out.println("Employee #" + employee.getID());
			System.out.println("Name: " + employee.getName());
			System.out.printf("Salary: %.2f%n ", employee.getSalary());
		}

		sc.close();
	}

}
