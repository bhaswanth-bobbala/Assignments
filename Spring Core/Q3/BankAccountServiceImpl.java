package ques3.spring.assiggnmnet;

public class BankAccountServiceImpl extends BankAccountepositoryImpl implements BankAccountService{

	

	public BankAccountServiceImpl(BankAccount account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(long accountId, double balance) throws Exception {
		if(balance>account.accountBalance) {
			throw new InsufficientBalanceException("Insufficent Balnce");
		}
		else if(balance<-1) {
			throw new IllegalBankTransactionException("Illegal Bank Transaction");
		}
		else {
			
			return updateBalance(accountId,account.accountBalance-balance);
		}
		
	}

	@Override
	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		
		return updateBalance(accountId, account.accountBalance+balance);
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


@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	
	}
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}
}