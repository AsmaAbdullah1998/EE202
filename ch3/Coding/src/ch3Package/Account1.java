package ch3Package;

public class Account1 {

	private String name;//instance var
	private double balance;
	
	//constructor initializes name with parametter name
	public Account1(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance;
		}
			
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public void depoite(double depoiteAmount) {
		if (depoiteAmount > 0.0) {
			balance = balance + depoiteAmount;
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
}
