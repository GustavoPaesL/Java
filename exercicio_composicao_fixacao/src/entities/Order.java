package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");
	
	private Client client;
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orders = new ArrayList<>();
	
	
	//////////constructors
	
	public Order() {

	}


	public Order(Client client, Date moment, OrderStatus status) {
		super();
		this.client = client;
		this.moment = moment;
		this.status = status;
	}
	
	
	////////////getters and setters
	
	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	
	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	
	//////////methods
	
	
	public void addItem(OrderItem item) {
		orders.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orders.remove(item);
	}
	
	public double total() {
		int sum = 0;
		for(OrderItem order : orders) {
			sum += order.subTotal();
		}
		return sum;	
	}


	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item: orders) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
