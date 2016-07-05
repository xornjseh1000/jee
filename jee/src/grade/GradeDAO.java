package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.xml.internal.ws.wsdl.writer.document.Service;

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
		return 0;
	}

	public int update(String[] chanArr) {
		// TODO Auto-generated method stub
		return 0;
	}
	

/*	public int update(String[] chanArr) {
		// chanArr[0] = seenum       [1] 과목명            [2] 점수
	
		String sql = "update grade set "+ chanArr[1] + "="+ chanArr[2]+ " where seq = "+ chanArr[0];
		return exeUpdate(sql);
	}

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

	*/

}