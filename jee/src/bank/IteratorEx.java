package bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorEx {
	public static void main(String[] args) {
		Map<?,?> map = new HashMap<String,Object>();
		AccountDAO dao = AccountDAO.getInstance();
		map = dao.selectMap();
		Set<?> keyset = map.keySet();
		Iterator<?> it = keyset.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
	//		System.out.println(map.get(key));
		}
		
		Collection<?> accounts = map.values();
		it = accounts.iterator();
		List<AccountMemberBean> list = new ArrayList<AccountMemberBean>();
		while (it.hasNext()) {
			AccountMemberBean obj = (AccountMemberBean) it.next();
			if (obj.getName().equals("홍길동")) {
				list.add(obj);
			}
			
			//System.out.println(obj);
		}
		//Collection.sort<list,new NameAscSort().>;
		
	}
}
