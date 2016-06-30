/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :AccountService.java
 * @story  :
 */
public class AccountService2 {
	//1,통장계설2.입금 3조회 4출금 5통장내역 6해지
	AccountBean account = new AccountBean();
	
	// 1개설
	public void openAccount(String name,String id,String pw){
		account = new AccountBean(name,id,pw);
	}
	// 2입금
	public void deposit(int inputMoney){
		int money = account.getmoney();
		money+= inputMoney;
		account.setmoney(money);
	}
	// 3조회
	public void findAccount(){
		
	}
	// 4출금
	public String withdraw(int output){
		String result = "잔액부족";
		int money = account.getmoney();
		if (output <= money) {
			money -= output;
			account.setmoney(money);
			result = String.valueOf(account.getmoney());
		}
		return result;
	}
	// 5통장내역
	public String showAccount(){
		return account.toString();
	}
	// 6해지
	public void deleteaccount(){
		return;
	}
}
