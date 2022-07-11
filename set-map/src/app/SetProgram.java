package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		Set<Integer> studentList = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		Integer studentQunatity;
		
		System.out.print("How many students for course A? ");
		studentQunatity = sc.nextInt();
		
		for (int i = 0; i < studentQunatity; i += 1) {
			System.out.print("Student id? ");
			studentList.add(sc.nextInt());
		}
		System.out.println();

		
		System.out.print("How many students for course B? ");
		studentQunatity = sc.nextInt();
		
		for (int i = 0; i < studentQunatity; i += 1) {
			System.out.print("Student id? ");
			studentList.add(sc.nextInt());
		}
		System.out.println();
		
		System.out.print("How many students for course C? ");
		studentQunatity = sc.nextInt();
		
		for (int i = 0; i < studentQunatity; i += 1) {
			System.out.print("Student id? ");
			studentList.add(sc.nextInt());
		}
		System.out.println();
		
		System.out.println("Total studewnts: " + studentList.size());
	}
}
