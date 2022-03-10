/**
 * Q3. Find out the simple as well as the compound interest of supplied value

Description:-

Simple Interest:- Generally, simple interest paid or received over a certain period is a fixed percentage of the principal amount that was borrowed or lent

              Simple Interest = (P×r×n)/100

              where:

              P            =            Principal amount

              r             =            Annual interest rate

              n            =            Term of loan, in years

​Compound Interest:-Compound interest accrues and is added to the accumulated interest of previous periods; it includes interest on interest, in other words.

              Compound Interest = P(1+r)^t-P

              Where:

              P=Principal amount

              r=Annual interest rate

              t=Number of years interest is applied

Specifications:
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){}
    public double compoundInterest(double principalAmount,int time,double interestRate){}
}
public class Assignment1Q3 {
    public static void main (String args[]) {}
}


 */

import java.util.Scanner;
class Sici {
	public static double simpleInterest(double principalAmount,int time,double interestRate){
		double SimpleIntrest = (principalAmount*(interestRate/100/12)*(time*12));
		return SimpleIntrest;
	}
    public static double compoundInterest(double principalAmount,int time,double interestRate){
    	double CompundInterest = (Math.pow(principalAmount*(1+(interestRate/100/12)),(time*12))-principalAmount);
    	return CompundInterest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Enter Pricipal Amount:");
    	double principalAmount = scanner.nextDouble();
    	System.out.print("Enter Time:");
    	int time=scanner.nextInt();
    	System.out.print("Enter Intreset Rate:");
    	double interestRate=scanner.nextDouble();
    	scanner.close();
    	System.out.println(Sici.simpleInterest(principalAmount,time,interestRate));
    	System.out.println(Sici.compoundInterest(principalAmount,time,interestRate));
    }
}
/**class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner scanner=new Scanner(System.in);
    	double principalAmount = scanner.nextDouble();
    	int time=scanner.nextInt();
    	double interestRate=scanner.nextDouble();
    	double SimpleIntrest = (principalAmount*(interestRate/100/12)*(time*12))/100;
    	double CompundInterest = (Math.pow(principalAmount*(1+(interestRate/100/12)),(time*12))-principalAmount);
    	System.out.println(SimpleIntrest);
    	System.out.println(CompundInterest);
    	scanner.close();
    }
}**/