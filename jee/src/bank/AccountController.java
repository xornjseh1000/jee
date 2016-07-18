/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import grade.GradeServiceImpl;
import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

/**
 * @date :2016. 6. 15.
 * @author :김동혁
 * @file :accountController.java
 * @story :
 */
public class AccountController {
	public static void main(String[] args) {
		AccountBean account = new AccountBean();
		AccountService service = AccountServiceImpl.getInstance();
		MemberService memberService = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog("1개설 2입금 3출금 4수정 5해지 6조회(전체) 7조회(계좌번호) 8조회(이름) 9통장수 10로그인 0종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("ID");
				String msg = service.openAccount(id);
 				JOptionPane.showMessageDialog(null, msg);
				
				break;
			case "2":
				String depositInfo = JOptionPane.showInputDialog("계좌,입금액");
				service.deposit(depositInfo);
				break;
			case "3":
				String withdrawInfo = JOptionPane.showInputDialog("계좌,출금액");
				service.deposit(withdrawInfo);
				break;
			case "4":
				MemberBean st1 = new MemberBean();
				String log = JOptionPane.showInputDialog("ID,PW");
				String[] logArr = log.split(",");
				st1.setId(logArr[0]);
				st1.setPw(logArr[1]);
				memberService.update(st1);
				
				break;
			case "5":
				String result2 =service.deleteaccount(JOptionPane.showInputDialog("계좌"));
				JOptionPane.showMessageDialog(null, result2);
				break;
			case "6":
				BankUI ui = new BankUI();
				break;
			case "7":
				
				break;
			case "8":
				
				break;
			case "9":
				
				break;
			case "10":
				
				break;
			default:
				break;
			}
		}

}
}