/**
 * 
 */
package bank;

/**
 * @date :2016. 6. 20.
 * @author :김동혁
 * @file :AccountServiceImpl.java
 * @story :
 */
public class AccountServiceImpl implements AccountService {

	AccountBean account;

	@Override
	public void openAccount(String name, String id, String pw) {
		account = new AccountBean(name, id, pw);
	}

	@Override
	public void deposit(int inputMoney) {
		int money = account.getmoney();
		money += inputMoney;
		account.setmoney(money);
	}

	@Override
	public void findAccount() {

	}

	@Override
	public String withdraw(int output) {
		String result = "잔액부족";
		int money = account.getmoney();
		if (output <= money) {
			money -= output;
			account.setmoney(money);
			result = String.valueOf(account.getmoney());
		}
		return result;
	}

	@Override
	public String showAccount() {
		return account.toString();
	}

	@Override
	public void deleteaccount() {
		return;
	}

}
