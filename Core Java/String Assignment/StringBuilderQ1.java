/**
 * Write an application to append the following strings “StringBuffer”, “is a peer class of
String”, “that provides much of “, “the functionality of strings” using a StringBuffer
 * @author Manindra
 *
 */

public class StringBuilderQ1 {

	public static void main(String[] args) {
		StringBuilder string =new StringBuilder();
		string.append("StringBuilder");
		string.append(" is a peer class of String");
		string.append(" that provides much of");
		string.append(" the functionality of strings");
		System.out.println(string);

	}

}
