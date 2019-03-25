package hanyang.bank;

import java.util.List;

public interface Bank {
	//���»���
	public void addAccount(String accountNo, String name, String kind);
	//���»���
	public void addAccount(String accountNo, String name, long balance,String kind);
	//���°˻�(���¹�ȣ��)
	public Account getAccount(String accountNo);
	//���¹�ȣ(�̸�����)
	public List<Account> findAccountByName(String name);
	//���¸���
	public List<Account> getAccounts();
} 







