/**
 * 
 */
package member;

import java.util.List;

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
			public String update(MemberBean mem);
			public String delete(String id);
			public int count();
			public MemberBean findById(String findID);
			public List<MemberBean> findByName(String findName);
			public List<MemberBean> list();
}
