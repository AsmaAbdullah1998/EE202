/* Traditional Comments!*/
/** Java Doc Comments! */
package ch2Practice;
import java.util.Scanner;
public class Ch2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * main method is the starting point of every Java application
		 * For Java application one of the methods must be called "main", otherwise (JVM) will not excute the app
		 * Methods perform tasks and can return info when they complete their tasks
		 * key "void" indicates that this method will not return any information
		 */
		//Primitive types (boolean, byte, char, short, int, float, long and double)
		System.out.println("\"Hi There!\"");
		System.out.print("Hi");
		System.out.println(" There!");
		System.out.println("Hi\nThere!"); //same result as: System.out.printf("Hi\nThere!");
		System.out.println("my name is Asma\\Sama\\");
		/*
		 * \n Newline
		 * \t Horizontal tab
		 * \r carriage return -windows tend to use \r\n as a line separator, Unix tends to use \n, Macs used to use \r
		 * \\ print backslash character
		 * \* print double-quote 
		 */
		
		//DISPLAYING TEXT WITH PRINTF
		System.out.printf("My name is:%nAsma%n"); //%n newline
		System.out.printf("Today is:%s%n", "Sunday");//$s string
		System.out.printf("Today is:%S%n", "Sunday");//$s capital string
		System.out.printf("my age is:%d%n", 23);//%d integer decimal number
		System.out.printf("the weight is:%f kg%n", 53.9);//%d float number
		System.out.printf("this is a character:%c%n", 'a');//%c character
		System.out.printf("this is a capital character:%C%n", 'a');//%C capital character
		System.out.printf("5>6 is %b%n",5>6 ); //boolean
		System.out.printf("5>6 is %B%n",5>6 ); //capital boolean
		/*
		 * SUMMARY
		 * System.out.printf --(f means "formatted") displays formatted data.
		 * fixed text is output by printf just as it would be by print or println
		 * format specifiers each of it is a "placeholder" for a value and specifies the type of data to output
		 * format specifiers begin with a percent sign (%) followed by a character that representeds the data type
		 * %s is a placeholder for a string, %S capital string
		 * %n a newline 
		 * %c a character, %C a capital character
		 * %d decimal integer number
		 * %f float number 
		 * %b boolean, %B a capital boolean
		 */
		
		
		//Adding Integers--Scanner
		System.out.println("This programm will sum two numbers");
		Scanner input = new Scanner(System.in);
		int n1,//first number to add
			n2,//second number to add
			sum;// the result of the additon
		System.out.print("Enter the first number: ");
		n1 = input.nextInt();
		System.out.print("Enter the second number: ");
		n2 = input.nextInt();
		sum = n1 + n2;
		System.out.printf("The sum of %d and %d is %d%n", n1, n2, sum);
		
		/*SCANNER!!
		 * Enables a program to read data for use in a program
		 * Data can come from many sources, such as the user at the kayboard or a file on disk
		 * Here are three steps to enable user to enter data:
		 **Importing Scanner class by typing "import java.util.Scanner;"
		 **Scanner declaration statement by typing "Scanner input = new Scanner(System.in);"
		 **Scanner method nextIn by typing "number1 = input.nextIn;"
		 */

	}

}
