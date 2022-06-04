package entities002;

public class OrderItem {
	private int quantity;
	private double price;
	private Product product;

	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}
	
	public double getSubTotal() {
		return this.price * this.quantity;
	}
	
	public String toString() {
		return
			this.product.getName()
			+ ", "
			+ String.format("%.2f", this.price)
			+ ", quantity" + this.quantity
			+ ", "
			+ String.format("%.2f", this.getSubTotal());
	}
	
}
