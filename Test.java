package hanyang.bank;

import java.util.List;

public class Test {
	static final String ACCOUNTS_HEADING = "계좌번호 ||소유자명||잔고||계좌종류";
	static final String TRANSACTIONS_HEADING = "거래일||거래시간||구분||금액||잔고";

	public static void main(String[] args) {
		Bank bank = new HanyangBank();
		bank.addAccount("101", "홍길동",Account.NORMAL);
		bank.addAccount("102", "임꺽정",Account.NORMAL);
		bank.addAccount("103", "장길산",Account.NORMAL);
		bank.addAccount("104", "홍길동",Account.MINUS);
	

	System.out.println("1. 총 계좌 목록 출력");
	List<Account> accounts = bank.getAccounts();
	int totalAccount = accounts.size();
	System.out.println(Test.ACCOUNTS_HEADING);
	
	for (int i = 0; i < totalAccount; i++) {
		System.out.println(accounts.get(i));
	}
	System.out.println();
	
	System.out.println("2. 101계좌에 10,000원 입금");
	Account hong = bank.getAccount("101");
	hong.deposit(10000);
	System.out.println(Test.ACCOUNTS_HEADING);
	System.out.println(hong);
	System.out.println();
	
	System.out.println("3. 101계좌에서 5,000원 출금");
	hong.withdraw(10000);
	System.out.println(Test.ACCOUNTS_HEADING);
	System.out.println(hong);
	System.out.println();
	
	System.out.println("4. 101계좌의 입 출금 내역 출력");
	List<Transaction> transactions = hong.getTransactions();
	int totalTransaction = transactions.size();
	System.out.println(Test.TRANSACTIONS_HEADING);
	for(int i = 0; i < totalTransaction; i++) {
		System.out.println(transactions.get(i));
	}
	System.out.println();
	
	System.out.println("5. 홍길동 계좌찾기");
	List<Account> matched = bank.findAccountByName("홍길동");
	System.out.println(Test.ACCOUNTS_HEADING);
	
	for(Account account : matched) {
		System.out.println(account);
	}
	System.out.println();
	
	System.out.println("6. 마이너스 계좌 104에서 5000을 출금");
	Account minus = bank.getAccount("104");
	minus.withdraw(5000);
	System.out.println(Test.ACCOUNTS_HEADING);
	System.out.println(minus);
	}
}












