package test;

import member.MemberBean;

public class ReflectionTest {
	public static void main(String[] args) {
		//MemberBean mem = new MemberBean();
		try {
			Class klass = Class.forName("member.MemberBean");
				MemberBean mem = (MemberBean) Class.forName("member.MemberBean").newInstance();
				mem.setId("hong");
				mem.setName("홍길동");
				mem.setPw("1");
				System.out.println(mem.toString());
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		}
	

