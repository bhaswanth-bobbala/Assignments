package ques3.spring.assiggnmnet;

public class BankAccountcontroller extends BankAccountServiceImpl   {
	
	
	public BankAccountcontroller(BankAccount account) {
		super(account);
		// TODO Auto-generated constructor stub
	}
	/**
	@Override
	public double withdraw(long accountId, double balance) throws Exception {
		if(balance>accountBalance) {
			throw new InsufficientBalanceException("Insufficent Balnce");
		}
		else if(balance<-1) {
			throw new IllegalBankTransactionException("Illegal Bank Transaction");
		}
		else {
			
			return updateBalance(accountId,accountBalance-balance);
		}
		
	}

	@Override
	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		
		return updateBalance(accountId, accountBalance+balance);
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return getAccountBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) throws Exception {
		// TODO Auto-generated method stub
		withdraw(fromAccount, amont);
		deposit(toAccount, amont);
		
		return true;
	}

}

**/

	@Override
	public double withdraw(long accountId, double balance) throws Exception {
		return super.withdraw(accountId, balance);
		
	}
	@Override
	public double deposit(long accountId, double balance) {
		return super.deposit(accountId, balance);
	}
		
	@Override
	public double getBalance(long accountId) {
		return super.getBalance(accountId);
	}
	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) throws Exception {
		return super.fundTransfer(fromAccount, toAccount, amont);
	}

}

