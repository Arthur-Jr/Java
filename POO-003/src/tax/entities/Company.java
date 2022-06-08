package tax.entities;

public class Company extends Tax {
	private int employees;

	public Company(String nameString, double anualIncome, int employees) {
		super(nameString, anualIncome);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}
	
	public Double getTax() {
		if (this.employees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}
}
