package ques3.spring.assiggnmnet;

public interface BankAccountRepository {
	public double getAccountBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);


}
