package ServiceImpl;

import Service.AccountService; //비지니스 로직(실무로직), 현실과 유사한 네이밍을 주자.
import domain.Account;

public class AccountServiceImpl implements AccountService {
	Account[] list;
	int count;
	public AccountServiceImpl() {
		list = new Account[10];
		count =0;
	}
	@Override
	public void addList(Account account) {
		list[count++] = account;
	}
	@Override
	public Account[] list() {
		return list;
	}

	@Override
	public Account createAccount(String name, String uid, String pass) {
		return new Account(name, uid, pass);
	}

	@Override
	public int deposit(int restMoney, String money) {

		return 0;
	}

	@Override
	public int withDraw(int restMoney, String money) {

		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		String accountNo = "";
		for (int i = 0; i < 3; i++) {
			createRandom(1, 999);
			accountNo += (i != 2) ? random + "-" : random;
		}
		return accountNo;
	}

	@Override
	public String createRandom(int start, int end) {
		return createAccountNum(String.format("%03d", (int) (Math.random() * end) + start));
	}

	@Override
	public String createDate() {

		return null;
	}

	@Override
	public String showResult() {
		String result="";
		for(int i=0;i<count;i++) {
			result+=list()[i].toString();
		}
		return result;
	}
}
