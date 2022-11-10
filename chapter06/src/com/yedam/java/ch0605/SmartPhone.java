package com.yedam.java.ch0605;

public class SmartPhone {
	//필드
	//해당 클래스의 속성(정보) 저장하는 구간
	String name;
	String maker;
	int price;  //가격
		
		
	//생성자
		
		
	//메소드   //기능을 추가하는 구간
	void call() {  //객체의 이름을 가지고 전화를 검
		System.out.println(name + " 전화를 겁니다.");
	}
	
	void hangUp() {  //전화를 끊음
		System.out.println(name +" 전화를 끊습니다.");
	}
	
	//전화걸고 끄는 기능을 가진 스마트폰
	
	
}
