package com.yedam.java.ch06_04;

public class MemberService {

	String id;
	String password;

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃");
	}

}
