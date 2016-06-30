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
		MemberService service = new MemberServiceImpl(); 
		
		while (true){
			switch (JOptionPane.showInputDialog("1,등록 2.보기 3수정 4삭제 0.종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("ID,PW,이름,SSN");
				String[] specArr = spec.split(",");
				service.registStudent(specArr[0],specArr[1],specArr[2],specArr[3]);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.showStudent());
				break;
			case "3":
				service.updateStudent(JOptionPane.showInputDialog("비번입력"));
				break;
			case "4":
				service.deleteStudent();
				break;
			case "0":
				return;

			default:
				break;
			}
		}
		
	}

}
