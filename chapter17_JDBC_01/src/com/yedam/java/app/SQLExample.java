package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {// ▶실행하고자 하는 코드
				// 1. JDBC Driver로딩하기 ★한 번만 실행하는 부분
			Class.forName("org.sqlite.JDBC");

			// 2. DB(DBMS)에 서버 접속하기 ★한 번만 실행하는 부분
			String url = "jdbc:sqlite:/D:/dev/database/testDataBase.db";
			conn = DriverManager.getConnection(url);

			/********* INSERT ***********/ // > 정수 반환됨
			// 3. Statement or PrepareStatement 이용해서 객체 생성하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			String insert = "INSERT INTO Students (student_id, student_name) VALUES (? , ?)"; // insert하고자 하는 부분에 ?를 넣어줌
			ps = conn.prepareStatement(insert);
			ps.setInt(1, 110);
			ps.setString(2, "김머룽");

			// 4. SQL문 실행하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			int result = ps.executeUpdate(); // 정수값이 반환됨!

			// 5. 결과값 가져오고 + 결과값 출력하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			System.out.println("INSERT 결과 : " + result);

			/************ SELECT **************/
			// 3. Statement or PrepareStatement 이용해서 객체 생성하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			stmt = conn.createStatement();

			// 4. SQL문 실행하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			String select = "SELECT student_id, student_name, student_dept FROM Students";
			rs = stmt.executeQuery(select);

			// 5. 결과값 가져오고 + 결과값 출력하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			while (rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String dept = rs.getString("student_dept");

				System.out.printf("학번 : %d, 이름 : %s, 학년 : %s\n", id, name, dept);

			}

			/*********** UPDATE ************/
			// 3. Statement or PrepareStatement 이용해서 객체 생성하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			String update = "UPDATE Students SET student_dept = ? WHERE student_id = ?";
			ps = conn.prepareStatement(update);
			ps.setInt(2, 110);
			ps.setString(1, "3학년");

			// 4. SQL문 실행하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			result = ps.executeUpdate();

			// 5. 결과값 가져오고 + 결과값 출력하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			System.out.println("UPDATE 결과 : " + result);

			/*********** DELETE ************/
			// 3. Statement or PrepareStatement 이용해서 객체 생성하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			stmt = conn.createStatement();

			// 4. SQL문 실행하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			String delete = "DELETE FROM Students WHERE student_id = " + 110;
			result = stmt.executeUpdate(delete);

			// 5. 결과값 가져오고 + 결과값 출력하기 ★어떤 sql문을 사용하느냐에 따라 여러 번 사용
			System.out.println("DELETE 결과 : " + result);
			
		} catch (ClassNotFoundException e) { // ▶예외처리 코드
			// e : exception으로, 하나의 객체임, 모든 오류(빨간줄)에 대한 정보가 들어있음
			// jdbc 가져올 때만 오류가 발생하므로 아래처럼 출력
			System.out.println("JDBC Driver Loding Fail");

		} catch (SQLException e) {
			System.out.println("SQL관련 예외 발생 : " + e.getMessage());
		} catch (Exception e) {// Exception : 모든 예외의 부모격 > 기타 느낌으로
			e.printStackTrace(); // 빨간줄 내용 출력하는 거
		} finally {
			// ▶무조건 실행 코드
			// 6. 자원 해제하기 : finally에 넣는 이유는 아무리 예외가 발생하더라도(비정상종료됨) 자원을 해제해주어야함
			// (자원 해제 안 하면 폐허가 된 통로를 그대로 두는 격)
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("정상적으로 자원이 해제되지 않았습니다.");
			}
		}

	}
}
