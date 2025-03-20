package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		///////// client data
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		//////// order
		
		System.out.println("Enter Order Data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(client, new Date(), OrderStatus.valueOf(status));
		
		System.out.print("How many itens to this order?: ");
		int itensQuantity = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= itensQuantity; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String pname = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(pname, price);
			OrderItem newItem = new OrderItem(quantity, product);
			order.addItem(newItem);
			
		}
		
		
		
		System.out.println(order.toString());
		
		
		
		sc.close();
	}

}
