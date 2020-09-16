package labSheet;

import java.util.Scanner;

public class Invoic {

	//instance var
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	//construcor
	public Invoic(String partNumber, String partDescriotion, int quantity, double price) {
	
		this.partNumber = partNumber;
		this.partDescription = partDescriotion;
		this.quantity = quantity;
		this.price = price;	
	}
	
	

	//setMehtod
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		public void setPartDescription(String partDescription) {
			this.partDescription = partDescription;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		//getMethods
		public String getPartNumber() {
			return partNumber;
		}
		public String getPartDescription () {
			return partDescription;
		}
		public int getQuantity() {
			return quantity;
		}
		
		public double getPrice() {
			return price;
		}
		
	
	//getInvoicAmount
		public double getInvoiceAmount() {
			if ( quantity< 0) {
				quantity = 0;
			}
			if (price < 0) {
				price = 0.0;
			}
			
			return  quantity * price;
		}
	
	
	//original invoice info method
	public void info() {
		System.out.printf("Part number: %s%nDescription: %s%nQuantity: %d%nPrice: %.2f%n", partNumber, partDescription, quantity, price);
		
	}
	
	public void setAll(String partNumber, String partDescriotion, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescriotion;
		this.quantity = quantity;
		this.price = price;	
		
	}
	

	
	
	

	
	
	
	
	
	
	
	
}