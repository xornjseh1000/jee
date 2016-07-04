package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

public class GradeDAO {
	
	private static GradeDAO instance = new GradeDAO();
	
	private GradeDAO() {

	}
	public static GradeDAO getInstance() {
		return instance;
	}

		Connection con = null;
		Statement stmt = null;
		ResultSet set = null;
}