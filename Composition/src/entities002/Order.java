package entities002;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities002.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	public Order(Date momment, OrderStatus status, Client client) {
		this.momment = momment;
		this.status = status;
		this.client = client;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public double getTotal() {
		double total = 0.0;
		for (OrderItem item : this.items) {
			total += item.getSubTotal();
		}
		
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(dateFormat.format(momment) + "\n");
		sb.append("Order status: " + this.status + "\n");
		sb.append(this.client + "\n");
		sb.append("Order Items: \n");
		for (OrderItem item : this.items) {
			sb.append("Subtotal: " + item + "\n");
		}
		sb.append("Total price: ");
		sb.append(String.format("%.2f", this.getTotal()));
		
		return sb.toString();
	}
}
