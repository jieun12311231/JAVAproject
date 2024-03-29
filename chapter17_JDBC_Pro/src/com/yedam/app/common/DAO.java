package com.yedam.app.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	//DB접속
	private String jdbcDriver = "org.sqlite.JDBC";
	private String jdbcUrl = "jdbc:sqlite:/C:/Users/admin/Desktop/projectFile/BookList.db";
	
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public void connect() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl);
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC DRIVER LOADING FAIL");
		}catch(SQLException e) {
			System.out.println("DATABASE CONNECTION FAIL");
		}
	}
	public void disconnect() {
		try {
			if(rs != null ) rs.close();
			if(stmt != null ) stmt.close();
			if(pstmt != null ) pstmt.close();
			if(conn != null ) conn.close();
		}catch(SQLException e){
			System.out.println("정상적으로 자원이 해제되지 않았습니다.");
		}
	}
	
	
	
	
	
	
	
}
