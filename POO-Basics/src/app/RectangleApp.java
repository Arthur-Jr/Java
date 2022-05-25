package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.getArea());
		System.out.printf("PERIMETER = %.2f%n", rect.getPerimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.getDiagonal());
	}

}
