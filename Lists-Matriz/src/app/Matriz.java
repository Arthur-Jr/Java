package app;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer m, n, x;

		System.out.println("Enter the two int values(lines, colunm): ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println();
		System.out.println("Enter the matriz values: ");
		System.out.println();
		
		for (int i = 0; i < mat.length; i += 1) {
			for (int j = 0; j < mat[i].length; j += 1) {
				System.out.println(i + "x" + j + " value?");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter a number: ");
		x = sc.nextInt();

		
		for (int i = 0; i < mat.length; i += 1) {
			for (int j = 0; j < mat[i].length; j += 1) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + "x" + j);

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					
					if (j < n - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					
					if (i < m - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					
					System.out.println();
				}
			}
		}
		
		sc.close();
	}

}
