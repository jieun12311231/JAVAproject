package com.yedam.java.ch07_02;

public class Human {
//Human 클래스를 정의한다.

//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능


	// 필드
	public String name;
	public int height;
	public int weigh;

	// 생성자
	public Human(String name, int height, int weigh) {
		this.name = name;
		this.height = height;
		this.weigh = weigh;

	}

	// 메소드
	public void getInformation() {
		System.out.printf("%s님의 신장 %dcm, 몸무게 %dkg",name,height,weigh);
		
	}

}
