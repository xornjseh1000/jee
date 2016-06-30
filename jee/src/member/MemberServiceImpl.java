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
	@Override
	
	public void registStudent(String id, String pw, String name, String ssn) {
		student = new MemberBean(id,pw,name,ssn);
		// 1등록
	}

	@Override
	public String showStudent() {
		// 2보기
		return student.toString();
	}

	@Override
	public void updateStudent(String pw) {
		//수정
		student.setPw(pw);
	}

	@Override
	public void deleteStudent() {
		//삭제
		student = null;
	}
	

}
