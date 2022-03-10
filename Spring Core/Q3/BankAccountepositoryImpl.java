package ques3.spring.assiggnmnet;

public class BankAccountepositoryImpl extends BankAccount implements BankAccountRepository{
	
	BankAccount account;
	
	

	public BankAccountepositoryImpl(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		this.account.accountBalance=newBalance;
		return newBalance;
	}

	@Override
	public double getAccountBalance(long accountId) {
		return account.accountBalance;
	}

}
