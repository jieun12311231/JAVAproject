package com.yedam.java.ch07_01;
//1) Employee 클래스를 정의한다.
//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 각 필드의 getter만 존재한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
public class Employee {
	//필드 -이름, 연봉
	private String name;
	private int money;
	
	//생성자- 값을 초기화
	public Employee(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	//메소드 
	//getInformation() - 이름 연봉 출력
	public void getInformation() {
		System.out.println("이름 : "+name);
		System.out.println("연봉 : "+money);
	}
	
	//print() - "수퍼클래스" 문구 출력
	public void print() {
		System.out.println("슈퍼클래스");
	}

	
	//getter만 존재 
	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
	
	
	
}
