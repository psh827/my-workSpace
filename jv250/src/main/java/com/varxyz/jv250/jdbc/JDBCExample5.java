package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample5 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		PreparedStatement stmt = null;
		Connection con = null;
		
		try {
			try {
				Class.forName(driver);
				System.out.println("LOADED DRIVER ---> " + driver);
				
				con = DriverManager.getConnection(url, id, passwd);
				System.out.println("CONNECTED TO ---> " + url);
				
				String sql = "DELETE FROM Account WHERE customerId = ? ";
				stmt = con.prepareStatement(sql);
				stmt.setLong(1, 1002);
				stmt.executeUpdate(); //DB로 가게되면 이 sql문을 파싱해서 자기의 구문으로 변환. 몇 건인지 모르기 때문에 while로 돌림
				
				
				System.out.println("DELETE....");
				stmt.close();
				con.close();
				
			}  finally {
				if (stmt != null) try { stmt.close(); } catch(SQLException ex) {}
				if (con != null) try { con.close(); } catch(SQLException ex) {}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
