/**
 * 
 */
package grade;

import java.util.List;

import member.MemberDAO;

/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :GradeServiceImpl.java
 * @story  :
 */
public  class GradeServiceImpl implements GradeService {
	GradeDAO dao = GradeDAO.getInstance();
	private GradeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	private static GradeServiceImpl instance = new GradeServiceImpl();
	
	public static GradeServiceImpl getInstance() {
		return instance;
	}

	@Override
	public int insert(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GradeBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GradeBean> findByHakjum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeBean findBySeq(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
