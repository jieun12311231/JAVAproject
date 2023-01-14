package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) {
		//JDBC : 무조건 아래의 6단계 반복!!!!
		
		try {
			// 1. JDBC Driver로딩하기 ★무조건
			Class.forName("org.sqlite.JDBC"); // 메모리상에 끌어올리는 것(!=Import)
												// "문자열" 틀리면 실행오류남!!

			// 2. DB(DBMS)에 서버 접속하기
			String url = "jdbc:sqlite:/D:/dev/database/testDataBase.db"; // jdbc:sqlite:절대경로(해당 데이터파일 우클릭+속성
			Connection conn = DriverManager.getConnection(url); // connection은 자바와 db 간 경로!

			// 3. Statement or PrepareStatement 이용해서 객체 생성하기 : 통로를 다니는 트럭/배달부 같은 거
			Statement stmt = conn.createStatement();

			// 4. SQL문 실행하기
			ResultSet rs = stmt.executeQuery("SELECT student_id, student_name, student_dept FROM students"); // resultset
																												// = 커서

			// 5. 결과값 가져오고 + 결과값 출력하기
			while (rs.next()) { // next() = 커서 움직ㅇㅣ기
				int sId = rs.getInt("student_id");
				String sName = rs.getString("student_name");
				String sDept = rs.getString("student_dept");
				System.out.println("아이디 : " + sId);
				System.out.println("이름 : " + sName);
				;
				System.out.println("소속 : " + sDept);
				System.out.println("========================");
			}

		} catch (ClassNotFoundException | SQLException e) {//ClassNotFoundException : Class.forName에 무조건 따라오는 오류 //SQLException : sql 실행시 무조건 발생함.
			e.printStackTrace(); //빨간줄 내용 출력하는 거
		} finally {
			// 6. 자원 해제하기 : resultset해제 > statement해제 > connection해제 
		//	if(rs!=null) rs.close(); //resultset해제 > null체크 이유 : 사용도 안 한 애를 삭제할 수는 없으므로
		//	if(stmt!=null) stmt.close(); //statement해제
		//	if(conn!=null) conn.close();
		}

	}

}
