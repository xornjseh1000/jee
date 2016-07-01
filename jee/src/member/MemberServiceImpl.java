/**
 * 
 */
package member;


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
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		
		String sql = "insert into member(id,pw,name,ssn,regDate) "+
					"values('"+mem.getId()+"','"+mem.getPw()+"','"+mem.getName()+"','"+mem.getSsn()+"','"+mem.getRegDate()+"')";
	
		int result = dao.exeUpdate(sql);
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
	public void update(String pw) {
		//수정
		student.setPw(pw);
	}

	@Override
	public void delete() {
		//삭제
		student = null;
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