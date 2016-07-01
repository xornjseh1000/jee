/**
 * 
 */
package bank;

import java.util.List;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date :2016. 6. 15.
 * @author :김동혁
 * @file :accountController.java
 * @story :
 */
public class BankController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		BankService bankservice = new BankServiceImpl();
		String spec = "";
		String[] specArr = new String[3];
		AccountBean tempAcc = new AccountBean();
		
		while (true) {
			
			switch (JOptionPane.showInputDialog("1통장계설,2입금 ,3조회, 4출금, 5통장내역,11계설,12조회,13계좌조회,14이름조회,15계좌수,16계좌비번수정, 0종료")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름,id,pw");
				specArr = spec.split(",");
				service.openAccount(specArr[0], specArr[1], specArr[2]);

				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
				// JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				;
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());
				break;
			// case "6":
			// public void deleteAccount(){
			// account = null;
			// }
			case "11":
				spec = JOptionPane.showInputDialog("이름,id,pw");
				specArr = spec.split(",");
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setId(specArr[1]);
				acc.setName(specArr[0]);
				acc.setPw(specArr[2]);
				bankservice.openAccount(acc);
				break;
			case "12":
				String accountList = bankservice.accountList();
				JOptionPane.showMessageDialog(null, accountList);
				break;
			case "13":
				String searchAcc = JOptionPane.showInputDialog("검색하려는 계좌번호");
				bankservice.findByAccountNo(searchAcc);
				AccountBean findByAccountNo = bankservice.findByAccountNo(searchAcc);
				JOptionPane.showMessageDialog(null,findByAccountNo);
				break;
			case "14":
				String findName = JOptionPane.showInputDialog("검색하려는 이름");
				List<AccountBean> list = bankservice.findByName(findName);
				
				break;
			case "15":
				int count = bankservice.count();
				JOptionPane.showMessageDialog(null, count + "개");
				break;
			case "16":
				String change = JOptionPane.showInputDialog("수정하려는 계좌,비번");
				String[] changeArr = change.split(",");
				tempAcc.setAccountNo(Integer.parseInt(changeArr[0]));
				tempAcc.setPw(changeArr[1]);
				JOptionPane.showMessageDialog(null,bankservice.updateAccount(tempAcc));
				
				break;
			case "17":
				String del = JOptionPane.showInputDialog("삭제하려는 계좌");
				
				break;

			default:
				JOptionPane.showConfirmDialog(null, "close OK?");
				return;
			}
		}
	}

}
