/**
 * Write an application to determine the length of the String str = “Hello World”. (Hint: Use
String method
 */

import java.util.Scanner;

public class StringQ1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the String to print the length:");
		String word = scanner.nextLine();
		System.out.println("length of the String is "+word.length());
		scanner.close();
	}

}
