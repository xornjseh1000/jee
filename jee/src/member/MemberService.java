/**
 * 
 */
package member;

import java.util.List;

import global.CommonService;


public interface MemberService extends CommonService{
	public String regist(MemberBean mem);
	public MemberBean findById(String findID);
	public void update(MemberBean stu2);
	public String delete(String string);
	public String login(MemberBean member);
	public void logout(MemberBean member);
	public MemberBean show();
	
}