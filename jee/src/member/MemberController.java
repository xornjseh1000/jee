/**
 * 
 */
package member;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 16.
 * @author :김동혁
 * @file   :SchoolController.java
 * @story  :
 */
public class MemberController {
	public static void main(String[] args) {
		//MemberService service = new MemberServiceImpl(); 
		MemberServiceImpl service = MemberServiceImpl.getInstance();
		
		
		while (true){
			switch (JOptionPane.showInputDialog("" + "--- 회원이 보는화면 ---\n" + "1회원가입 2로그인 3내정보보기(detail) 4내정보수정(비번) 5탈퇴 0종료\n"
					+ "--- 관리자 화면 --- \n" + "11회원목록 12검색(ID) 13검색(이름) 14회원수(성별) 15 회원수")) {
			case "1":
				MemberBean st = new MemberBean();
				String spec = JOptionPane.showInputDialog("ID,PW,이름,SSN");
				String[] specArr = spec.split(",");
				st.setId(specArr[0]);
				st.setPw(specArr[1]);
				st.setName(specArr[2]);
				st.setSsn(specArr[3]);
				st.setRegDate(spec);
				String result = service.regist(st);
				
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.show());
				break;
			case "4":
				MemberBean st1 = new MemberBean();
				String log = JOptionPane.showInputDialog("ID,PW");
				String[] logArr = log.split(",");
				st1.setId(logArr[0]);
				st1.setPw(logArr[1]);
				String result1 =service.update(st1);
				JOptionPane.showMessageDialog(null, result1);
				//service.update(JOptionPane.showInputDialog("비번입력"));
				break;
			case "5":
				
				String result2 =service.delete(JOptionPane.showInputDialog("ID"));
				JOptionPane.showMessageDialog(null, result2);
				break;
			case "12":
				String findID = JOptionPane.showInputDialog("조회할 아이디 입력");
				JOptionPane.showMessageDialog(null, service.findById(findID));
				break;
			case "13":
				String findName = JOptionPane.showInputDialog("조회할 이름 입력");
				JOptionPane.showMessageDialog(null, service.findByName(findName));
				JOptionPane.showMessageDialog(null, "");
				break;
			case "14":break;
			case "15":
				int count = service.count();
				JOptionPane.showMessageDialog(null, count);
				
				break;
			case "0":
				return;

			default:
				break;
			}
		}
		
	}

}
