/**
 * 
 */
package grade;

import java.util.List;

import global.CommonService;

/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :GradeService.java
 * @story  :
 */
public interface GradeService extends CommonService {
	// 총 7개의 기본 패턴이 존재하더라
	// exeU
	
	public String insert(GradeBean grade);
	public int update(String[] chanArr );
	public String delete(String del);
	// exeQ
	public List<GradeBean> list();
	public List<GradeBean> findByGrade();
	public int count(String examDate);
	public GradeBean findBySeq(String seq);
	public List<GradeBean> findById(String id);
	

}

