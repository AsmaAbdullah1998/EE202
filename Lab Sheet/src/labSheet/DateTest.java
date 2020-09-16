package labSheet;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		Date myDate = new Date(7, 4, 2003);
		
		System.out.print("The initial date is: " );
		myDate.displayDate();
		System.out.println();
		
		myDate.setMonth(11);
		myDate.setDay(1);
		myDate.setYear(2003);
		
		System.out.print("Date with new values is: ");
		myDate.displayDate();
		
		
		
		
		
		
		
	}

}
