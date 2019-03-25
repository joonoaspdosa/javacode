package hanyang.bank;

import java.util.ArrayList;
import java.util.List;

public class HanyangBank implements Bank{
	private List<Account> accounts = new ArrayList<Account>(); 
	
	@Override
	public void addAccount(String accountNo, String name,String kind) {
		Account account = getAccount(accountNo);
		if(account != null)throw new DuplicateAccountException("Áßº¹°èÁÂ");
		if(Account.NORMAL.equals(kind)){ 
			accounts.add(new NormalAccount(accountNo, name,kind));
		}else if (Account.MINUS.equals(kind)) {
			accounts.add(new MinusAccount(accountNo, name,kind));
		}
	}
	
	@Override
	public void addAccount(String accountNo, String name,long balance,String kind) {
		Account account = getAccount(accountNo);
		if(account != null)throw new DuplicateAccountException("Áßº¹°èÁÂ");
		if(Account.NORMAL.equals(kind)){ 
			accounts.add(new NormalAccount(accountNo, name,balance,kind));
		}else if (Account.MINUS.equals(kind)) {
			accounts.add(new MinusAccount(accountNo, name,balance,kind));
		}
	}
	
	@Override
	public Account getAccount(String accountNo) {
		int totalAccount = accounts.size();
		
		for(int i = 0; i < totalAccount; i++) {
			if(accountNo.equals(accounts.get(i).getAccountNo())) {
				return accounts.get(i);
			}
		}
		return null;
	}
	
	@Override
	public List<Account> findAccountByName(String name) {
		List<Account> matched = new ArrayList<Account>();
		int totalAccount = accounts.size();
		
		for(int i = 0;i < totalAccount;i++) {
			if(name.equals(accounts.get(i).getName())) {
				matched.add(accounts.get(i));
			}
		}
		return matched;
	}
	
	@Override
	public List<Account> getAccounts() {
		return accounts;
	}
}







