package com.yedam.java.ch0601;

public class Car {  //main이 없음//main이 없으면 프로젝트 실행이 안됨. 
	//필드 : 속성
	int maxSpeed = 100;
	String color = "red";
	
	
	//생성자 ((여기서는 원래는 생략해도 상관없음))
	public Car() { //생성자는 본인의 이름을 가질수 없어서 클래스의 이름을 가져와서 씀/생성자는 클래스와 이름이 똑같음
		System.out.println("자동차가 출하되었습니다.");
	}
	
	
	//매소드 : 동작  //별도의 이름이 있고, 리턴되는 값을 담을 곳이 필요함
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}
}
