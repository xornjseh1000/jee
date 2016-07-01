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
			
			
			public String regist(MemberBean mem);
			public String show();
			public void update(String pw);
			public void delete();
}
