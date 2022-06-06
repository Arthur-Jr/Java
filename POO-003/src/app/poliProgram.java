package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class poliProgram {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String name;
		double price;
		char productType;
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i += 1) {
			System.out.println("Product #" + i + " data:");
			System.out.println();
			
			System.out.print("Common, used or imported (c/u/i)? ");
			productType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Price: ");
			price = sc.nextDouble();
			
			if (productType == 'c') {
				productList.add(new Product(name, price));
			}
			
			if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				productList.add(new UsedProduct(name, price, date));
			}
			
			if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}

			System.out.println();
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : productList) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}
