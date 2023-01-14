package com.yedam.app.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//테이블 만들때 공통적인 요소들이 모여져있는 부모 클래스 
public class DAO { //단순 접속 data access object
	
	//DB에 접속하는것과 DB SQL실행분리  //무조건 DAO얘로 접근해야함 데이터베이스에 연결해주는 아이 
	
	//DateBase 연결 정보를 가지고있음 
	private String jdbcDriver = "org.sqlite.JDBC";
	private String jdbcUrl = "jdbc:sqlite:/D:/dev/database/Yedamdatabase.db";
	
	
	//각 메소드에서 공통적으로 사용하는 변수 -> 필드 
	//상속을 이용해서전달
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	//연결
	//1. JDBC DRIVER LOADING
	//2. CONNECTION  //상속으로만 받은
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
	//연결해제
	//6.자원해제
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
