/**
 * 
 */
package member;

import java.util.List;


/**
 * @date   :2016. 6. 20.
 * @author :김동혁
 * @file   :StudentServiceImpl.java
 * @story  :
 */
public class MemberServiceImpl implements MemberService{
	//	1,등록 2.보기 3수정 4삭제 0.종료	
	MemberBean student;
	MemberDAO dao = MemberDAO.getInstance();
	String msg = "";
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public String regist(MemberBean mem) {
		
		
		
	
		int result = dao.insert(mem);
		if (result==1) {
			msg = "회원가입 축하";
		} else {
			msg = "회원가입 실패";
		}
		
		// 1등록
		return msg;
	}

	@Override
	public String show() {
		// 2보기
		return student.toString();
	}

	@Override
	public String update(MemberBean mem) {
		//수정
		
		
		
		
		int result = dao.update(mem);
		if (result==1) {
			msg = "변경완료";
		} else {
			msg = "변경실패";
		}
		return msg;
	}

	@Override
	public String delete(String id) {
		//삭제
		
		if (dao.delete(id)==1) {
			msg = "삭제완료";
		} else {
			msg = "삭제실패";
		}
		return msg;
	}
	@Override
	public int count() {

		return dao.count();
	}
	public MemberBean findById(String findID) {
		MemberBean temp = dao.findById(findID);
		MemberBean mem = new MemberBean();
		return null;
	}
	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> findByName(String findName) {
		// TODO Auto-generated method stub
		MemberBean temp = dao.findByName(findName);
		MemberBean mem = new MemberBean();
		return null;
	}
	

}
/*
 * create table account("
			+ "account_no int primary key,"
			+ "name varchar(20),"
			+ "money int,"
			+ "pw varchar(20),"
			+ "id varchar(20)
 */