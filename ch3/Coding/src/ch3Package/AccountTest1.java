package ch3Package;

import java.util.Scanner;
public class AccountTest1 {

	public static void main(String[] args) {
		/*LOCAL VAR ARE NOT AUTOMATICALLY INITIALIZED
		String myName;
		myName = "asma";
		System.out.println(myName);
		*/
		Account1 myAccount = new Account1(); //create object from Account1 class
		Scanner input = new Scanner(System.in);
		
		/*ANOTHER WAY TO CREATE OBJECT!
		 *Account1 myAccount;
		 *myAccount = new Account1(); 
		*/
		
		System.out.printf("Initial name is: %s%n", myAccount.getName());
		
		System.out.println("Please enter the name: ");
		//String name = input.next();//Store the first word just!. Read the input only till the space
		String name = input.nextLine();//read a line of text
		myAccount.setName(name); //put var in myAccount name
		
		System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());
		
		
	}

}
