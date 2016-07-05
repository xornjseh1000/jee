package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;

public class MemberDAO {
	Connection con;
	ResultSet rs = null; // executeQuery() 에서만 리턴받는 객체
	Statement stmt = null;
	PreparedStatement pstmt = null;
	MemberBean temp;
	
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public int insert(MemberBean mem) {
		String sql = "insert into member(id,pw,name,ssn,regDate) " + "values('" + mem.getId() + "','" + mem.getPw()
				+ "','" + mem.getName() + "','" + mem.getSsn() + "','" + mem.getRegDate() + "')";
		return exeUpdate(sql);
	}

	public int update(MemberBean mem) {
		String sql = "update member set pw = '" + mem.getPw() + "'where id = '" + mem.getId() + "'";
		return exeUpdate(sql);
	}

	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}

	public int exeUpdate(String sql) {
		String sqlCreate = "";
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

	public List<MemberBean> list() {  //list
		String sql = "select * from member";
		List<MemberBean> list = new ArrayList<MemberBean>();
		MemberBean mem = new MemberBean();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public MemberBean findById(String pk) {  //findByPk
		String sql = "select * from member where id = 'hong'"+pk+"'";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			MemberBean temp = null;
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW
					);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				 temp = new MemberBean(
					rs.getString("ID"),
					rs.getString("PW"),
					rs.getString("PW"),
					rs.getString("SSN"));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}

	public MemberBean findByName(String name) {  //findByNotPk
		String sql = "select * from member where name = kim'"+name+"'";
		List<MemberBean> list = new ArrayList<MemberBean>();
		MemberBean mem = new MemberBean();
		
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW
					);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	public int count() {  // count
		String sql = "select count(*) as count from member";
		int count = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW
					);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()){
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public int delete(String id) {
		String sql = "delete from member where id = '" + id + "'";
		return exeUpdate(sql);
	}

	
}
                   