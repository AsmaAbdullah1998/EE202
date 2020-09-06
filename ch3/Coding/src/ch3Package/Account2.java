package ch3Package;

public class Account2 {

	//instance variables
	private String name;
	private double balance;
	private double depoiteAmount;
	private String accountObject;
	
	//constructor can not return type or even void
	public Account2(String name, double balance) {
		this.name = name;
		
		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposite(double depositeAmount) {
		if (depositeAmount > 0) {
			balance = depositeAmount + balance;
		}
	}
	
	
	public void displayAccount() {
		System.out.printf("%s balance: $%.2f%n",name, balance);
	}
	
	
	
	
	
	
	
}
