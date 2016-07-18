/**
 * 
 */
package grade;

import java.util.List;
import java.util.Map;

/**
 * @date :2016. 6. 21.
 * @author :김동혁
 * @file :GradeServiceImpl.java
 * @story :
 */
public class GradeServiceImpl implements GradeService {
	GradeBean bean;
	GradeDAO dao = GradeDAO.getInstance();
	String msg = "";

	private GradeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	private static GradeServiceImpl instance = new GradeServiceImpl();

	public static GradeServiceImpl getInstance() {
		return instance;
	}

	@Override
	public String insert(GradeBean grade) {
		
		String grade1 = "",str = "";
		int total = 0,avg = 0;
		total = grade.getJava()+grade.getSql()+grade.getHtml()+grade.getJavascript();
		System.out.println("토탈점수 "+ total);
		
		avg = total/4;
		switch (avg/10) {
		case 9:
			 grade1 = "A";
			break;
		case 8:
			grade1 = "B";
			break;
		case 7:
			grade1 = "C";
			break;
		case 6:
			grade1 = "D";
			break;
		case 5:
			grade1 = "E";
			break;
			
			
		default:
			grade1 = "F";
			break;
		}
		grade.setGrade(grade1);
		int result = dao.insert(grade);
		if (result == 1) {
			str = "성공입니다";
		} else {
			str = "실패입니다";
		}
		return str;
	}

	@Override
	public int update(String[] chanArr) {
		// TODO Auto-generated method stu
		//update grade set 과목명 = 점수 where seq = 시퀀스 
		
		return dao.update(chanArr);
	}

	@Override
	public String delete(String del) {
		// TODO Auto-generated method stub
		String str = "";
		int result = dao.delete(del);
		if (result == 1) {
			str = "성공입니다";
		} else {
			str = "실패입니다";
		}
		return str;
	}

	@Override
	public List<GradeBean> list() {
		List<GradeBean> list = dao.list();
		return list;
	}

	@Override
	public List<GradeBean> findByGrade() {
		// TODO Auto-generated method stub
		
		return null;
	}



	@Override
	public int count(String examDate) {
		// TODO Auto-generated method stub
		return dao.count(examDate);
	}

	public GradeBean findBySeq(String seq) {
		// TODO Auto-generated method stub
		return dao.findBySeq(seq);
	}

	@Override
	public List<GradeBean> findById(String id) {

		return dao.findById(id);
	}

	@Override
	public List<?> findBy(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
