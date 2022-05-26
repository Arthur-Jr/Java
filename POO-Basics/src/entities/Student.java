package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public double getFinalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double getMissingPoints() {
		if (getFinalGrade() < 60) {
			return 60.0 - getFinalGrade();
		}
		
		return 0.0;
	}
}
