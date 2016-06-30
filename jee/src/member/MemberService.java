/**
 * 
 */
package member;

/**
 * @date   :2016. 6. 17.
 * @author :김동혁
 * @file   :StudentService.java
 * @story  :
 */
public interface MemberService {
		//1,등록 2.보기 3수정 4삭제 0.종료
			
			
			public void registStudent(String id,String pw,String name,String ssn);
			public String showStudent();
			public void updateStudent(String pw);
			public void deleteStudent();
}
