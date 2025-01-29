package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String ask_deposit;
		double initial_deposit;
		Account x;
		
		System.out.println("enter account number: ");
		int account_number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter account holder: ");		
		String account_holder = sc.nextLine();
		
		
		do{
			System.out.println("is there an initial deposit (y/n)? ");
			ask_deposit = sc.nextLine();
		}while(ask_deposit.charAt(0) != 'y' && ask_deposit.charAt(0) != 'n');
		

		
		if(ask_deposit.charAt(0) == 'y' ) {
			System.out.println("Enter inital deposit value: ");
			 initial_deposit = sc.nextDouble();
			  x = new Account(account_number, account_holder, initial_deposit);
		}
		else {
			 x = new Account(account_number, account_holder);
		}	
			
			
		System.out.println("account data: ");
		System.out.println("account: " + x.getAccount_number() + ", Holder: " + x.getAccount_holder() + ", Balance: $" + x.getAccount_balance());
		
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		x.deposit(deposit);
		System.out.println("updated account data: ");
		System.out.println("account: " + x.getAccount_number() + ", Holder: " + x.getAccount_holder() + ", Balance: $" + x.getAccount_balance());
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		x.withdraw(withdraw);
		System.out.println("updated account data: ");
		System.out.println("account: " + x.getAccount_number() + ", Holder: " + x.getAccount_holder() + ", Balance: $" + x.getAccount_balance());
		
		sc.close();
	}

}
