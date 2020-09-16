package labSheet;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Triangle myTriangle = new Triangle();
		
		
		System.out.printf("The triangle's Area is %.16f%n", myTriangle.getArea(3, 2.6));
		System.out.printf("The triangle's permeter is %.1f%n", myTriangle.getPermiter(3, 3, 3));
		
		
	}

}
