package tax.entities;

public class Individual extends Tax {
	private double healthCosts;

	public Individual(String nameString, double anualIncome, double healthCosts) {
		super(nameString, anualIncome);
		this.healthCosts = healthCosts;
	}

	public double getHealthCosts() {
		return healthCosts;
	}

	public void setHealthCosts(double healthCosts) {
		this.healthCosts = healthCosts;
	}
	
	@Override
	public Double getTax() {
		if (this.getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - healthCosts * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthCosts * 0.5;
		}
	}
}
