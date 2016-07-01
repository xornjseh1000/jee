package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

public class GradeDAO {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet set = null;
		String sqlCreate = "create table grade("
				+ "kor int,"
				+ "eng int,"
				+ "math int,"
				+ "name varchar(20)"
				+ ")";
		String sqlDrop = "drop table grade";
		int result = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.ORACLE_ID,
					Constants.ORACLE_PW
					);
			result = stmt.executeUpdate(sqlCreate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result ==0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
				
	}
}
