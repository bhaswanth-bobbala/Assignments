/**
 * 4. Test the following principles of an abstract class:

• If any class has any of its method abstract then you must declare entire class abstract.

• Abstract class cannot be instantiated.

• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

• Abstract class cannot be private.

• Abstract class cannot be final.

• You can declare a class abstract without having any abstract method.

Description:-

Write a program in such a way that all the conditions above for abstract class should satisfy.

 
 */


import java.util.ArrayList;

abstract class Bank{
	String bankName;
}
abstract class Customer extends Assignment2Q4{
	int AccountNumber;
	String name;
	String accountType;
	
}
class Current extends Assignment2Q4 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class Save extends Assignment2Q4 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits-fixedDepositAmount;
    }
}
abstract class num extends Customer{
	
}
public abstract class Assignment2Q4 {
    public static int totalCashInBank(ArrayList<Integer> cash){
    	int sum=0,i;
    	for (i=0;i<cash.size();i++) {
    		sum += cash.get(i);
    	}
    	return sum;
    }
    public abstract int getCash();
    public static void main(String[] args) {
    	Current currentAccountTotal = new Current();
    	Save savingsAccountTotal = new Save();
    	ArrayList<Integer> cash = new ArrayList<>();
    	cash.add(currentAccountTotal.getCash());
    	cash.add(savingsAccountTotal.getCash());
    	System.out.println(totalCashInBank(cash));
    	
    }
}