import java.util.Scanner;

/**Q1: Find out if the given number is an Armstrong number or not. 

Description :-

An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.

Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).



Specifications:
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {}

public class Assignment1Q1 {
    public static void main(String[] args) {}
}
**/

class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
		String a[]=String.valueOf(num).split("");
		int b=0;
		for (int i=0;i<a.length;i++) {
			b += (int)Math.pow(Integer.parseInt(a[i]), 3);
		}
		Boolean e=(b==num);
		return e;
	}
}

public class Assignment1Q1 {
    public static void main(String[] args) {
    	ArmstrongOrNot amArmstrongOrNot = new ArmstrongOrNot();
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Enter Number:");
    	int num = scanner.nextInt();
    	scanner.close();
    	System.out.print(amArmstrongOrNot.armstrongCheck(num));
    }
}


/**
class Assignment1Q1 {
	public static boolean armstrongCheck(int num) {
		String a[]=String.valueOf(num).split("");
		int b=0;
		for (int i=0;i<a.length;i++) {
			b += (int)Math.pow(Integer.parseInt(a[i]), 3);
		}
		Boolean e=(b==num);
		return e;
	}

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num = scanner.nextInt();
	scanner.close();
	System.out.print(armstrongCheck(num));
}
}**/
