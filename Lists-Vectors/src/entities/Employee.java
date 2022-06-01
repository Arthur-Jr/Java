package entities;

public class Employee {
	private final int ID;
	private String name;
	private double salary;

	public Employee(int ID, String name, double salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void incSalary(int perc) {
		this.salary += this.salary * perc / 100;
	}

	public int getID() {
		return ID;
	}
}
