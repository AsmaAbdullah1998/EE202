import java.util.Scanner;
import java.security.SecureRandom;
public class CH6{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumber = new SecureRandom();
		System.out.println("Roll\tValue");
		for(int roll = 1; roll<=20; roll++) {
			int die = 1 + randomNumber.nextInt(6);
			System.out.println(roll + "\t" + die );
		}
		
		
	}//end main method
}//end class

