/**
 * 
 */
package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date :2016. 6. 20.
 * @author :김동혁
 * @file :AccountServiceImpl.java
 * @story :
 */
public class AccountServiceImpl implements AccountService {

	AccountDAO dao = AccountDAO.getInstance();
	private Map<?,?> map;
	private static AccountServiceImpl instance = new AccountServiceImpl();
	
	public static AccountServiceImpl getInstance() {
		return instance;
	}
	private AccountServiceImpl() {
		map = new HashMap<String,AccountMemberBean>();
	}
		public String openAccount(String id) {
			AccountBean acc2 = new AccountBean();
			acc2.setAccountNo();
			acc2.setId(id);
			acc2.setmoney(0);
			String msg = "";
			if (dao.insertAccount(acc2)==1) {
				msg = "계좌생성 완료";
			} else {
				msg = "계좌생성 실패";
			}
			return msg;
		}
		
		
	

	@Override
	public void deposit(String depositInfo) {
		String[] arr = depositInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int money = this.restMoney(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		acc.setmoney(money);
		dao.deposit(acc);
		
		
		
		
	}

	@Override
	public String withdraw(String withdrawInfo) {
		String result = "";
		String[] arr = withdrawInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int restMoney = this.restMoney(Integer.parseInt(arr[0]));
		int withdrawMoney = this.restMoney(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		if (restMoney < withdrawMoney) {
			result = "잔액이 부족합니다";
		} else {
			acc.setmoney(restMoney-withdrawMoney);
			dao.withdraw(acc);
			result = "잔액 :"+String.valueOf(this.restMoney(Integer.parseInt(arr[0])));
		}
		return result;
	}

	@Override
	public String updateAccount(AccountBean tempAcc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteaccount(String acc) {
		//dao.delete
		return "";
		
	}

	@Override
	public List<?> list() {
		
		return dao.selectAll();
	}

	@Override
	public AccountBean findByAccountNo(String searchAcc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findBy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int restMoney(int accNo) {
		
		return dao.selectMoney(accNo);
	}
	@Override
	public Map<?, ?> map() {
		map = new HashMap<String,AccountMemberBean>();
		map = dao.selectMap();
		return map;
	}
	
	

	
}
