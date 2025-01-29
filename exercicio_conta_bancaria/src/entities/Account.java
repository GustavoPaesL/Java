package entities;

public class Account {

	private final int account_number;
	private String account_holder;
	private double account_balance = 0;
	
	//constructors
	
	public Account(int account_number, String account_holder) {
		super();
		this.account_number = account_number;
		this.account_holder = account_holder;		
	}
	
	public Account(int account_number, String account_holder, double initial_deposit) {
		super();
		this.account_number = account_number;
		this.account_holder = account_holder;
		this.account_balance = initial_deposit;
	}	
	
	// setters and getters
	
	public int getAccount_number() {
		return account_number;
	}
	
	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public double getAccount_balance() {
		return account_balance;
	}
	
	//methods
	
	public void deposit(double deposit) {
		this.account_balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.account_balance = (account_balance - withdraw) - 5;
	}

}




