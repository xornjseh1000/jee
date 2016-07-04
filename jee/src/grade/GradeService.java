/**
 * 
 */
package grade;

import java.util.List;

/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :GradeService.java
 * @story  :
 */
public interface GradeService {
	// 총 7개의 기본 패턴이 존재하더라
	// exeU
	
	public int insert(GradeBean grade);
	public int update(GradeBean grade);
	public int delete(GradeBean grade);
	// exeQ
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum();
	public GradeBean findBySeq(int seq);
	public int count();
	
	
	
	/*public abstract int total(int kor,int eng, int math);
	public int avg(int total);
	public String grade(int avg);*/
}

