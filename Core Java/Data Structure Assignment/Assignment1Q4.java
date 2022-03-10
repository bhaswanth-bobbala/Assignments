/**Q4. Supply marks of three subject and declare the result, result declaration is based on below conditions:

              Condition 1: -All subjects marks is greater than 60 is Passed

              Condition 2: -Any two subjects marks are greater than 60 is Promoted

              Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.

Description:-

Specify the marks of 3 subjects and the results will be declared based on the conditions above and for reference go through the test cases for better understanding.      


Test cases:-

              TestCase1:-

                            Input:-     10          10          10

                            Output:-  failed

              TestCase2:-

                            Input:-      70          10          10

                            Output:-   failed
**/

import java.util.Scanner;

class ResultDeclaration{
    public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	if(subject1Marks>60) {
    		if(subject2Marks>60) {
    			if(subject3Marks>60) {
    				return "passed";
    			}
    			else
    				return "promoted";
    		}
    		else if(subject3Marks>60)
    			return "promoted";
    		else {
				return "fail";
			}
    	}
    	else if(subject2Marks>60) {
			if(subject3Marks>60) {
				return "promoted";
			}
			else
				return "fail";
		}
    	else {
			return "fail";
		}
    }
		
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Subject1 marks:");
		double subject1Marks=scanner.nextDouble();
		System.out.print("Enter Subject2 marks:");
		double subject2Marks=scanner.nextDouble();
		System.out.print("Enter Subject3 marks:");
		double subject3Marks=scanner.nextDouble();
		System.out.print(ResultDeclaration.declareResults(subject1Marks,subject2Marks,subject3Marks));
		scanner.close();

	}

}
