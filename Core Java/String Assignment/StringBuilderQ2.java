/**
 * Insert the following string “insert text” into the string “It is used to _ at the specified index
position” at the location denoted by the sign _
 * @author Manindra
 *
 */


public class StringBuilderQ2 {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		string.append("It is used to at the specified index position");
		string.insert(13, " insert text");
		System.out.println(string);

	}

}
