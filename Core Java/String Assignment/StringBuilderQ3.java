/**
 * Reverse the following string “This method returns the reversed object on which it was
called” using StringBuffer Class
 * @author Manindra
 *
 */


public class StringBuilderQ3 {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		string.append("This method returns the reversed object on which it was called");
		System.out.println(string.reverse());

	}

}
