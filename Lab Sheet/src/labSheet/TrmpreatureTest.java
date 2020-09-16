package labSheet;

import java.util.Scanner;

public class TrmpreatureTest {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		Temperature myTemperature = new Temperature();
		
		System.out.print("Input a degree in Fahrenheit: ");
		double f = input.nextDouble();
		myTemperature.setFahrenheit(f);
		
		System.out.printf("%.1f degree Fahernhiet is equal to %.14f in celsius %n", f, myTemperature.toCelsius());
		
		
	}

}
