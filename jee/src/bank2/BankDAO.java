package bank2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;import global.Constants;
/*
 * account_no ,
	name ,
	money ,
	pw ,
	id 
 */
public class BankDAO {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet set = null;
		Statement stmt = null;
		int updateResult = 0;
		String executeResult = "";
		String sqlCreate = "create table account("
				+ "account_no int primary key,"
				+ "name varchar(20),"
				+ "money int,"
				+ "pw varchar(20),"
				+ "id varchar(20)"
				+ ")";
		String sqlDrop="drop table account";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW);
			stmt = con.createStatement();
			stmt.executeUpdate(sqlDrop);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB다녀온 결과 :"+ updateResult);
	}
}
