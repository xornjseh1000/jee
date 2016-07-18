package bank2;

import java.util.ArrayList;
import java.util.List;


public class BankServiceImpl implements BankService {
	List<AccountBean> list;
	
	public BankServiceImpl() {
		list = new ArrayList<AccountBean>();
	}

	@Override
	public void openAccount(AccountBean acc) {
		// 11번개설 (은행창구 개설)

		list.add(acc);
	}

	@Override
	public String accountList() {
		return list.toString();
	}

	@Override
	public AccountBean findByAccountNo(String searchAcc) {
		AccountBean search = new AccountBean();
		String result = "조회 계좌번호 없음";
		for (int i = 0; i < list.size(); i++) {
			if (Integer.toString(list.get(i).getAccountNo()).equals(searchAcc)) {
				search = list.get(i);
				break;
			} 
		}
			if (search.getId() != null) {
				result = search.toString();
			} 
		return search;

	}

	@Override
	public List<AccountBean> findByName(String name) {
		List<AccountBean> list = new ArrayList<AccountBean>();
		System.out.println("컨트롤러에서 넘어온 이름:"+name);
		for (int i = 0; i < this.list.size(); i++) {
			
		}
		return list;
	}

	@Override
	public int count() {
		// 15 계좌수
		return list.size();

	}



	@Override
	public String updateAccount(AccountBean tempAcc) {
		AccountBean acc = this.findByAccountNo(String.valueOf(tempAcc.getAccountNo()));
		String result = "";
		if (tempAcc.getId() == null) {
			result = "계좌번호가 존재하지 않습니다.";
		} else {
			tempAcc.setPw(tempAcc.getPw());
			result = "비밀번호가 변경 되었습니다";
		}
			return result;
		}
		
	

	@Override
	public void deleteaccount(AccountBean del) {
		this.findByAccountNo(String.valueOf(del));
		String result = "";
		if (del.getId() == null) {
			result = "계좌번호가 존재하지 않습니다";
		} else {
			del.getAccountNo();
		}
	}



	
}
