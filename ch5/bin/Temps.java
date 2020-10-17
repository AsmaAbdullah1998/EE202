import java.util.Scanner;

public class Temps {

	public static void main(String[] args) {
		int HOURS_PER_DAY = 6;
		int temp; 
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Temperature Readings for 6 Hour Period");
		System.out.println();
		int hour = 1;
		System.out.print("Enter the temperature reading at " + hour + " hours: ");
		temp = scan.nextInt();
		int max = temp, min = temp;
		int hMax = 1, hMin = 1;
		
		
		for (hour = 2; hour <= HOURS_PER_DAY; hour++) {
			System.out.print("Enter the temperature reading at " + hour + " hours: ");
			temp = scan.nextInt();
			
			if(temp > max) {
				max =temp;
				hMax = hour;
			}//end if1
			if(temp < min) {
				min = temp;
				hMin = hour;
			}//end if2
			
			
		}//end for loop
		System.out.println();
		
		System.out.println("The maximum temperature is " + max);
		System.out.println("It occured at hour " + hMax);
		System.out.println("The minimum temperature is " + min);
		System.out.println("It occured at hour " + hMin);
		
	}//end main method
}//end class
