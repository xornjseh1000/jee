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
			switch (JOptionPane.showInputDialog("1,등록 2.보기 3수정 4삭제 0.종료")) {
			case "1":
				MemberBean st = new MemberBean();
				String spec = JOptionPane.showInputDialog("ID,PW,이름,SSN");
				String[] specArr = spec.split(",");
				st.setId(specArr[0]);
				st.setPw(specArr[1]);
				st.setName(specArr[2]);
				st.setSsn(specArr[3]);
				String result = service.regist(st);
				
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.show());
				break;
			case "3":
				service.update(JOptionPane.showInputDialog("비번입력"));
				break;
			case "4":
				service.delete();
				break;
			case "0":
				return;

			default:
				break;
			}
		}
		
	}

}
