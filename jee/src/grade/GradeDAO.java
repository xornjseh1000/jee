package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class GradeDAO {
	Connection con;
	ResultSet rs = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	GradeBean temp;
	private static GradeDAO instance = new GradeDAO();

	private GradeDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE, Constants.USER_ID,Constants.USER_PW).getConnection();
	}

	public static GradeDAO getInstance() {
		return instance;
	}

	public int insert(GradeBean grade) {
		int result = 0;
		String sql = "insert into grade(seq,grade,java,sql,html,javascript,id,exam_date)values(	seq.nextval,?,?,?,?,?,?,?)";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, grade.getGrade());
			pstmt.setInt(2, grade.getJava());
			pstmt.setInt(3, grade.getSql());
			pstmt.setInt(4, grade.getHtml());
			pstmt.setInt(5, grade.getJavascript());
			pstmt.setString(6, grade.getId());
			pstmt.setString(7, grade.getExamDate());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int delete(String del) {
		// TODO Auto-generated method stub
		String sql = "delete from grade where seq =" + del;
		return exeUpdate(sql);
	}

	public int update(String[] chanArr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<GradeBean> list() {
		List<GradeBean> list = new ArrayList<GradeBean>();
		String sql = "select * from grade";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				GradeBean g = new GradeBean();
				g.setSeq(String.valueOf(rs.getInt("SEQ")));
				g.setId(rs.getString("ID"));
				g.setExamDate(rs.getString("EXAM_DATE"));
				g.setGrade(rs.getString("GRADE"));
				g.setJava(rs.getInt("JAVA"));
				g.setHtml(rs.getInt("HTML"));
				g.setJavascript(rs.getInt("JAVASCRIPT"));
				g.setSql(rs.getInt("SQL"));
				list.add(g);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int count(String examDate) {
		int result = 0;
		String sql = "select count(*) as count from grade where exam_Date = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, examDate);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public GradeBean findBySeq(String seq) {
		// TODO Auto-generated method stub
		GradeBean gBean = null;
		String sql = "select * from grade where seq=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, seq);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				gBean = new GradeBean();
				gBean.setSeq(rs.getString("SEQ"));
				gBean.setId(rs.getString("id"));
				gBean.setGrade(rs.getString("grade"));
				gBean.setJava(Integer.parseInt(rs.getString("JAVA")));
				gBean.setSql(Integer.parseInt(rs.getString("SQL")));
				gBean.setHtml(Integer.parseInt(rs.getString("HTML")));
				gBean.setJavascript(Integer.parseInt(rs.getString("JAVASCRIPT")));
				gBean.setId(rs.getString("ID"));
				gBean.setExamDate(rs.getString("EXAM_DATE"));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return gBean;
	}

	public List<GradeBean> findById(String id) {
		List<GradeBean> tempList = new ArrayList<>();
		String sql = "select * from grade where id = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()){
				GradeBean i = new GradeBean();
				i.setSeq(rs.getString("SEQ"));
				i.setId(rs.getString("id"));
				i.setGrade(rs.getString("grade"));
				i.setJava(Integer.parseInt(rs.getString("JAVA")));
				i.setSql(Integer.parseInt(rs.getString("SQL")));
				i.setHtml(Integer.parseInt(rs.getString("HTML")));
				i.setJavascript(Integer.parseInt(rs.getString("JAVASCRIPT")));
				i.setId(rs.getString("ID"));
				i.setExamDate(rs.getString("EXAM_DATE"));
				tempList.add(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempList;
	}
	

	
	

	/*public int update(String[] chanArr) {
		// chanArr[0] = seenum       [1] 과목명            [2] 점수
	
		String sql = "update grade set "+ chanArr[1] + "="+ chanArr[2]+ " where seq = "+ chanArr[0];
		return exeUpdate(sql);
	}*/

	public int exeUpdate(String sql) {
		int result = 0;

		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	

}