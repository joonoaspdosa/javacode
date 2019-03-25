package hanyang.bank;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public long getAmount() {
		return amount;
	}


	public void setAmount(long amount) {
		this.amount = amount;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.transactionDate);
		sb.append("||");
		sb.append(this.transactionTime);
		sb.append("||");
		sb.append(this.kind);
		sb.append("||");
		sb.append(Account.NUMBER_FORMAT.format(this.amount));
		sb.append("||");
		sb.append(Account.NUMBER_FORMAT.format(this.balance));
		
		return sb.toString();
	}
}









