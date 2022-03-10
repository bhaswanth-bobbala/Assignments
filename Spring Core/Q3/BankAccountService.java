package ques3.spring.assiggnmnet;

public interface BankAccountService {
	public double withdraw(long accountId, double balance) throws Exception;
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) throws Exception;


}
