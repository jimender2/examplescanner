/**
 * 
 */
package examplescanner;
import java.util.Scanner;
/**
 * @author Jonathan Meredith
 *
 */
public class examplescanner {

	public static void main(String[] args) {
		System.out.println("Input first number to add");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Input second number to add");
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("The answer: " + num3);
	}

}
