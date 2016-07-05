/**
 * 
 */
package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

import member.MemberBean;

/**
 * @date   :2016. 6. 8.
 * @author :김동혁
 * @file   :Avg.java
 * @story  :
 */
public class GradeController {
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서()
	 * [홍길동 : 총점 ***점, 평균***점,학점 : ??]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 * 평균점수가 90점 이상 A
	 * 80점이상이면 B
	 * 70점이상이면 C
	 * 60점이상이면 D
	 * 50점이상이면 E
	 * 50점 미만이면 F학점입니다라고 
	 * 출력되게 해주세요.
	 * [단] switch-case 문으로 해결하세요.
	 **/
	public static void main(String[] args) {
		GradeServiceImpl service = GradeServiceImpl.getInstance();
		GradeBean st = new GradeBean();
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "1추가 2수정 3삭제 4전체조회 5학점조회 6시퀀스조회 7응시생수"
					+ "")) {
			case "1":
				String plus = JOptionPane.showInputDialog("java성적,sql성적,html성적,javascript성정,ID,시험날짜");
				String[] plusArr = plus.split(",");
				st.setJava(Integer.parseInt(plusArr[0]));
				st.setSql(Integer.parseInt(plusArr[1]));
				st.setHtml(Integer.parseInt(plusArr[2]));
				st.setJavascript(Integer.parseInt(plusArr[3]));
				st.setId(plusArr[4]);
				st.setExamDate(plusArr[5]);
				String result = service.insert(st);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2": 
				String chan = JOptionPane.showInputDialog("시퀀스 ,과목명 , 점수입력");
				String[] chanArr = chan.split(",");
				service.update(chanArr);
				
				
				
				break;
			case "3": 
				String del = JOptionPane.showInputDialog("시퀀스");
				service.delete(del);
				break;
			case "4": break;
			case "5": break;
			case "6": break;
			case "7": break;
			case "0": break;
			default:
				return;
			}
		}
	
	
	}
}
	