package ques3.spring.assiggnmnet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountcontrollerTest {

	@Test
	@DisplayName("Test 1")
	void test() throws Exception {
		BankAccount account = new BankAccount();
		account.setAccountBalance(10000);
		account.setAccountHolderName("Naga");
		account.setAccountId(123);
		account.setAccountType("Savings");
		BankAccountcontroller controller=new BankAccountcontroller(account);
		assertEquals(9500.0, controller.withdraw(123, 500));
	}

}
