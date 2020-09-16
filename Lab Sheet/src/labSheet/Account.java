package labSheet;

import java.util.Scanner;

public class Account {
	//instance var
	private String name; 
	private double balance;
	
	//constructor
	public Account(String name,double balance) {
		if (balance > 0) {
			this.balance =balance;
			
		}
		
		this.name = name;
	}
	
	//setMethod
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setName(String name ) {
		this.name = name;
		
	}
	
	
	
	//getMethod
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name; 
	}
	
	public void debit() {
		System.out.printf("Enter withdraw amount for %s: ", name);
		Scanner input = new Scanner(System.in);
		double withdrawAmount = input.nextDouble();
		System.out.printf("subtacting %.2f from %s balance%n", withdrawAmount, name);
		
		if (withdrawAmount > balance) {
			System.out.println("Debit amount exceeded account balance");
		}
		else {
			
			balance -=withdrawAmount;
		}
	}
	
		

	
	public void displayInf() {
		System.out.printf("%s balance: $ %.2f%n", name, balance);
	}
	
	
	
	

}















