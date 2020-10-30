import java.security.SecureRandom;
public class CH6{
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
		for(int counter = 1;  counter<=50_000; counter++) {
			int rand = 2*randomNumbers.nextInt(5) + 2;
			switch(rand) {
			case 2 : f1++; break;
			case 4 : f2++; break;
			case 6 : f3++; break;
			case 8 : f4++; break;
			case 10 : f5++; break;
			}
			
		}
		System.out.println("rand\tFreq");
		System.out.printf("2\t%d%n4\t%d%n6\t%d%n8\t%d%n10\t%d%n", f1, f2, f3, f4, f5);
	}
}

