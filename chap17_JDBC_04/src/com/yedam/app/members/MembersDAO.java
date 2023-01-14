package com.yedam.app.members;

import java.sql.SQLException;

import com.yedam.app.common.DAO;

public class MembersDAO extends DAO {
	//싱글톤
	private static MembersDAO dao = null;
	private MembersDAO() {}
	public static MembersDAO getInstance() {
		if(dao == null) {
			dao = new MembersDAO();
		}
		return dao;
	}
	//CRUD
	public Member selectOne(Member member) {
		Member loginInfo = null;
		try {
			connect();
			String sql = "SELECT * FROM members WHERE member_id = '" + member.getMemberId() +"'"; //아이디만 가지고 확인 
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//아이디 존재
				if(rs.getString("member_password").equals(member.getMemberPassword())){//입력한 패스워드 값이랑 비교 Stirng이라서 equals 
					//비밀번호 일치
					// -> 로그인 성공  //계속 들고있어야하느느 정보 > 하나의 객체에 담아줌
					loginInfo = new Member();
					loginInfo.setMemberId(rs.getString("member_id"));
					loginInfo.setMemberPassword(rs.getString("member_password"));
					loginInfo.setMemberRole(rs.getInt("member_role"));
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");  //아이디는 존재함 
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}	
		return loginInfo;  //로그인 정보 반환
	}
	
}
