package hanyang.bank;

import java.util.List;

public class Test {
	static final String ACCOUNTS_HEADING = "���¹�ȣ ||�����ڸ�||�ܰ�||��������";
	static final String TRANSACTIONS_HEADING = "�ŷ���||�ŷ��ð�||����||�ݾ�||�ܰ�";

	public static void main(String[] args) {
		Bank bank = new HanyangBank();
		bank.addAccount("101", "ȫ�浿",Account.NORMAL);
		bank.addAccount("102", "�Ӳ���",Account.NORMAL);
		bank.addAccount("103", "����",Account.NORMAL);
		bank.addAccount("104", "ȫ�浿",Account.MINUS);
	

	System.out.println("1. �� ���� ��� ���");
	List<Account> accounts = bank.getAccounts();
	int totalAccount = accounts.size();
	System.out.println(Test.ACCOUNTS_HEADING);
	
	for (int i = 0; i < totalAccount; i++) {
		System.out.println(accounts.get(i));
	}
	System.out.println();
	
	System.out.println("2. 101���¿� 10,000�� �Ա�");
	Account hong = bank.getAccount("101");
	hong.deposit(10000);
	System.out.println(Test.ACCOUNTS_HEADING);
	System.out.println(hong);
	System.out.println();
	
	System.out.println("3. 101���¿��� 5,000�� ���");
	hong.withdraw(10000);
	System.out.println(Test.ACCOUNTS_HEADING);
	System.out.println(hong);
	System.out.println();
	
	System.out.println("4. 101������ �� ��� ���� ���");
	List<Transaction> transactions = hong.getTransactions();
	int totalTransaction = transactions.size();
	System.out.println(Test.TRANSACTIONS_HEADING);
	for(int i = 0; i < totalTransaction; i++) {
		System.out.println(transactions.get(i));
	}
	System.out.println();
	
	System.out.println("5. ȫ�浿 ����ã��");
	List<Account> matched = bank.findAccountByName("ȫ�浿");
	System.out.println(Test.ACCOUNTS_HEADING);
	
	for(Account account : matched) {
		System.out.println(account);
	}
	System.out.println();
	
	System.out.println("6. ���̳ʽ� ���� 104���� 5000�� ���");
	Account minus = bank.getAccount("104");
	minus.withdraw(5000);
	System.out.println(Test.ACCOUNTS_HEADING);
	System.out.println(minus);
	}
}












