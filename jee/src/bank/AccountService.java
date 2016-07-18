/**
 * 
 */
package bank;

import java.util.List;
import java.util.Map;

import global.CommonService;

/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :AccountService.java
 * @story  :
 */
public interface AccountService extends CommonService {
	//1,통장계설2.입금 3조회 4출금 5통장내역 6해지
		
		// 1개설
		public String openAccount(String id);
		// 2입금
		public void deposit(String depositInfo);
		// 3출금
		public String withdraw(String withdraw);
		// 4.수정.. 사용자의 요청에 의해 비번만 전환가능
		public String updateAccount(AccountBean tempAcc);
		// 5해지
		public String deleteaccount(String acc);
		
		// 7조회(계좌번호)
		public AccountBean findByAccountNo(String searchAcc);
		
		// 9조회(전체통장수)
		public int count();
		// 원래 요구사항에는 없었지만... 필요에 따라 생성하는 메소드
		public int restMoney(int accNo);

}
