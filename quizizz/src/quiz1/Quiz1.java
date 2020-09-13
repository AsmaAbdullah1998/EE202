package quiz1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 0;
		int nP =0;
		int nN = 0;
		int nZ = 0;
		
		for(int i =0; i < 5; ++i) {
			System.out.print("Enter num:");
			num = input.nextInt();
			if (num > 0) {
				++nP;
			}
			else if (num < 0) {
				++nN;
			}
			else {
				++nZ;
			}
		}
		
		System.out.println("num of Positive: " + nP);
		
		System.out.println("num of Negative: " + nN);
		
		System.out.println("num of Zero: " + nZ);
						
						
						
	}

}
