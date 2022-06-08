package tax.entities;

public abstract class Tax {
	private String name;
	private double anualIncome;

	public Tax(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setNameString(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double getTax();

	@Override
	public String toString() {
		return name + ": $" + String.format("%.2f", this.getTax());
	}
	
	
}
