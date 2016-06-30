/**
 * 
 */
package bank;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :AccountService.java
 * @story  :
 */
public interface AccountService {
	//1,통장계설2.입금 3조회 4출금 5통장내역 6해지
		
		// 1개설
		public abstract void openAccount(String name,String id,String pw);
		// 2입금
		public void deposit(int inputMoney);
		// 3조회
		public void findAccount();
		// 4출금
		public String withdraw(int output);
		// 5통장내역
		public String showAccount();
		// 6해지
		public void deleteaccount();
}
