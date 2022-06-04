package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities002.Client;
import entities002.Order;
import entities002.OrderItem;
import entities002.Product;
import entities002.enums.OrderStatus;

public class Program002 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String name, email;
		Date birthDate;
		int quantity, loopQuantity;
		double productPrice;
		Client client;
		OrderStatus status;
		Order order;
		
		System.out.println("Enter client data:");
		System.out.println();
		
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Birth date (DD/MM/YYY): ");
		birthDate = dateFormat.parse(sc.next());

		client = new Client(name, email, birthDate);
		System.out.println();
		
		System.out.println("Enter order data:");
		System.out.println();
		
		System.out.print("Status: ");
		status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		loopQuantity = sc.nextInt();
		
		order = new Order(new Date(), status, client);
		System.out.println();
		
		for (int i = 1; i <= loopQuantity; i += 1) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			name = sc.next();
			System.out.print("Product price: ");
			productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			quantity = sc.nextInt();
			
			Product product = new Product(name, productPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			order.addItem(orderItem);
			System.out.println();
		}
		
		System.out.println(order);
		
		sc.close();
	}

}
