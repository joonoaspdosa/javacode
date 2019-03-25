package hanyang.bank;

import java.util.List;

public interface Bank {
	//계좌생성
	public void addAccount(String accountNo, String name, String kind);
	//계좌생성
	public void addAccount(String accountNo, String name, long balance,String kind);
	//계좌검색(계좌번호로)
	public Account getAccount(String accountNo);
	//계좌번호(이름으로)
	public List<Account> findAccountByName(String name);
	//계좌리턴
	public List<Account> getAccounts();
} 







