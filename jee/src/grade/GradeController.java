/**
 * 
 */
package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
		String name = "",grade = "";
		int kor = 0, eng = 0, math = 0,avg=0,total=0;
		GradeService service = new GradeServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("go(1)?")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,국어,영어,수학");
				String[] arr = spec.split(",");
				name = arr[0];
				kor = Integer.parseInt(arr[1]);
				eng = Integer.parseInt(arr[2]);
				math = Integer.parseInt(arr[3]);
				grade = service.grade(service.avg(service.total(kor,eng,math)));
				JOptionPane.showMessageDialog(null, "이름 :"+ name + "성적:"+grade);
				break;

			default:
				return;
			}
		}
	
	
	}
}
	