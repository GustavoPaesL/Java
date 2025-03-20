package entities;

public class OrderItem {

	private int quantity;
	private Product product;
	
	public OrderItem() {

	}

	public OrderItem(int quantity, Product product) {

		this.quantity = quantity;
		this.product = product;
	}
	
	
	public double subTotal() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		return product.getName() + ", " + product.getPrice() + ", Quantity: " + quantity + ", Subtotal: $" + quantity * product.getPrice();
	}
	
	
	
}
