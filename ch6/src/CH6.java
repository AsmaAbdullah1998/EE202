import java.util.Scanner;
import java.security.SecureRandom;
public class CH6{
	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	public static int rolling() {
		int number1 = 1+ randomNumber.nextInt(6);
		int number2 = 1+ randomNumber.nextInt(6);
		System.out.printf("%d+%d=%d", number1, number2, (number1+number2));
		return number1+number2;
	}
	public static void main(String[] args) {
		int counter = 0;
		while(true) {
			int sum = rolling();
			counter ++;
			if(sum == 7) {
				System.out.printf(" You won after %d tries!", counter );
				break;
			}
			System.out.println();
		}
		
		
		
	}//end main method
}//end class

