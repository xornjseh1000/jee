package bank;

import java.io.Serializable;
import java.util.Random;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * 
 */

/**
 * @date :2016. 6. 16.
 * @author :김동혁
 * @file :Account.java
 * @story :
 */
public class AccountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다.
	private String name;
	private int money;
	private String pw;
	private String id;
	public final static String BANK_NAME = "한빛은행";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static String getBankName() {
		return BANK_NAME;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * 
	 */
	public AccountBean() {
		// default constructor 기본생성자

	}

	public AccountBean(String name, String id, String pw) {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
		this.name = name;
		this.id = id;
		this.pw = pw;

	}

	public void setAccountNo1() {
		this.accountNo = (int) (Math.random() * 999999) + 100000;

	}
	public void setAccountNo(){
		this.accountNo = accountNo;
	}

	public void setmoney(int money) {
		this.money = money;
	}

	public void setid(String id) {
		this.id = id;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public String getname() {
		return this.name;
	}

	public int getmoney() {
		return this.money;
	}

	public String getpw() {
		return this.pw;
	}

	public String getid() {
		return this.id;
	}

	@Override
	public String toString() { // 메소드 오버라이딩
		return Constants.BANK_NAME + "[계좌번호=" + accountNo + ", 이름=" + name + ", 잔액=" + money + ", 비번=" + pw + ", 아이디="
				+ id + "]";
	}

}
