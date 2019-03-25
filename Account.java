package hanyang.bank;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Account {
	private String accountNo;
	private String name;
	protected long balance;
	protected String kind;
	protected List<Transaction> transactions = new ArrayList<Transaction>();
	
	
	static final SimpleDateFormat DATE_FORMAT = 
			                       new SimpleDateFormat("yyyy/MM/dd");
	static final SimpleDateFormat TIME_FORMAT = 
                                   new SimpleDateFormat("HH:mm:ss");
	static final String DEPOSIT = "입금";
	static final String WITHDRAW = "출금";
	static final String NORMAL = "일반";
	static final String MINUS = "마이나스";
	static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
	
	public Account() {};
	
	public Account(String accountNo, String name, String kind) {
		this.accountNo = accountNo;
		this.name = name;
		this.kind = kind;
	}
	
	public Account(String accountNo, String name, long balance, String kind) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.kind = kind;
	}
	
	public void deposit(long amount) {
		balance = balance + amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(Account.DATE_FORMAT.format(date));
		transaction.setTransactionTime(Account.TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setKind(Account.DEPOSIT);
		transaction.setBalance(this.balance);
		transactions.add(transaction);
	}
	
	public abstract void withdraw(long amount);
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(accountNo);
		sb.append("||");
		sb.append(name);
		sb.append("||");
		sb.append(Account.NUMBER_FORMAT.format(balance));
		sb.append("||");
		sb.append(kind);
		
		return sb.toString();
	}	
}






