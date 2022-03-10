/*
 * Design and Develop a Banking Application as follows:
a. Create a BankAccount class with following attributes: accountId,
accountHolderName, accountType, accountBalance
b. Create an interface BankAccountRepository with following methods:
public double getBalance(long accountId)
public double updateBalance(long accountId, double newBalance):
Note: Above method returns updated balance.
c. Create a class BankAccountepositoryImpl that implements
BankAccountRepository interface.
You can use database or any collection object as persistence store.
d. Create an interface BankAccountService with following methods:
public double withdraw(long accountId, double balance)
public double deposit(long accountId, double balance)
public double getBalance(long accountId)
public boolean fundTransfer(long fromAccount, long toAccount, double amont)
e. Create a class BankAccountServiceImpl that implements BankAccountService
interface.
f. Create a class BankAccount controller with following operations:
public double withdraw(long accountId, double balance)
public double deposit(long accountId, double balance)
public double getBalance(long accountId)
public boolean fundTransfer(long fromAccount, long toAccount, double amont)
g. Create a Test class with main() method, get BankAccountController bean object
from ApplicationContext and perform all the operations.
h. Also write the JUnit Test cases for above program.
- Use XML based configuration and perform autowiring with different types.
(byName, byType and constructor). Use one autowiring type at a time.
 */

package ques3.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Ques3.xml");
		BankAccountcontroller controll = (BankAccountcontroller) context.getBean("controll");
		System.out.println(controll.withdraw(123, 500));

	}

}
