package com.yedam.java.ch0605;

public class Member {
	// getter setter을 이용하는 예제
//필드
	private String id;
	private String tel;
	private int age;

//생성자

//메소드

	public String getTel() { // 흰바탕 우클릭> 소스> getter and setter >generator누르면 자동으로 생성해줌
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	// private String id;
	public String getId() { // 사용자 입장에서 정보를 가져오는것
		// 원본 데이터(yedam)
		// yedam님 입니다로 만들고 싶으면 하는 방법
		id += "님 입니다."; // 예쁘게 가공하고 싶으면 넣으면되는데
		return id; // 가공안하고 싶으면 이렇게만 하면됨.
	}

	public void setId(String id) {
		this.id = id;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if (age <= 0) { // 데이터의 무결성으로 인해서 점검이 필요함,
			System.out.println("0보다 작은 나이가 저장되었습니다. 다시확인하세요");
			return;
		} else {
			this.age = age;
		}

	}
}
