import java.util.Scanner;
public class IsPrime {

	static Scanner input = new Scanner(System.in);

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if(number == 1) isPrime = false;
		for(int i = 2; i<=number-1; i++) {
			if(number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		System.out.println(isPrime(number)? "Prime":"NOT Prime");
	}

}
