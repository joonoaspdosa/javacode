package hanyang.bank;

import java.util.Calendar;
import java.util.Date;

public class MinusAccount extends Account{
	public MinusAccount() {}
	
	public MinusAccount(String accountNo, String name, String kind) {
		super(accountNo, name, kind);
	}
	
	public MinusAccount(String accountNo, String name, long balance,String kind) {
		super(accountNo, name, balance, kind);
	}

	@Override
	public void withdraw(long amount) {
		balance = balance - amount;
		Transaction  transaction = new Transaction();
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
