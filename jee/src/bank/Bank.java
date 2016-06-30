/**
 * 
 */
package bank;

/**
 * @date   :2016. 6. 15.
 * @author :김동혁
 * @file   :Bank.java
 * @story  :
 */
public class Bank {
	private int account; // 인스턴스 변수는 초기화를 하지 않는다.
	private String name;
	private int money;
	private String bankName;
	private String pw;
	private String id;
	
	public void setAccount(int account){
		this.account = account;
	}
	public void setname(String name){
		this.name = name;
	}
	public void setmoney(int money){
		this.money = money;
	}
	public void setbankName(String bankName){
		this.bankName = bankName;
	}
	public void setpw(String pw){
		this.pw = pw;
	}
	public void setid(String id){
		this.id = id;
	}
	public int getAccount() {
		return this.account;
	}
	public String getname(){
		return this.name;
	}
	public int getmoney(){
		return this.money;
	}
	public String getbankName(){
		return this.bankName;
	}
	public String getpw(){
		return this.pw;
	}
	public String getid(){
		return this.id;
	}
}
