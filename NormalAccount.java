package hanyang.bank;

import java.util.Calendar;
import java.util.Date;

public class NormalAccount extends Account{
	public NormalAccount() {}
	
	public NormalAccount(String accountNo, String name, String kind) {
		super(accountNo, name,kind);
	}
	public NormalAccount(String accountNo, String name, long balance,String kind) {
		super(accountNo, name,balance, kind);
	}
	
	@Override
	public void withdraw(long amount) {
		if(amount > balance) {
			throw new InsufficientBalanceException("ÀÜ¾× ºÎÁ·");
		}
		balance = balance - amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(Account.DATE_FORMAT.format(date));
		transaction.setTransactionDate(Account.TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setKind(Account.WITHDRAW);
		transaction.setBalance(this.balance);
		transactions.add(transaction);
		
	}
}
