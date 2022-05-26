package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();
		
		System.out.print("Name: ");
		std.name = sc.nextLine();
		
		System.out.println("Grade: 1 2 3:");
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		System.out.println();

		System.out.printf("FINAL GRADE: %.2f%n", std.getFinalGrade());
		
		if(std.getFinalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", std.getMissingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
