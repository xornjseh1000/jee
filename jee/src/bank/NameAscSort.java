package bank;

import java.util.Comparator;
//이름정렬하는거
public class NameAscSort implements Comparator<AccountMemberBean> {

	@Override
	public int compare(AccountMemberBean first, AccountMemberBean second) {
		// TODO Auto-generated method stub
		return first.getName().compareTo(second.getName());
	}
	
	
}
