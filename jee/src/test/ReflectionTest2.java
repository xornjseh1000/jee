package test;

import bank.AccountBean;
import sun.awt.SunHints.Value;

public class ReflectionTest2 {
	public static void main(String[] args) {
		try {
			//Class klass = Class.forName("bank.AccountBean");
			AccountBean kk;
				kk = (AccountBean) Class.forName("bank.AccountBean").newInstance();
				kk.setAccountNo();
				kk.setName("김똥");
				kk.setmoney(500);
				kk.setPw("kkk");
				kk.setPw("123");
				System.out.println(kk.toString());
		} catch (Exception e) {
				e.printStackTrace();
			} 
		
		
		}
}


