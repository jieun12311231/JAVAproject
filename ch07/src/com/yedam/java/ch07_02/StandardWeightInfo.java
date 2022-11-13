package com.yedam.java.ch07_02;

public class StandardWeightInfo extends Human{

	
//StandardWeightInfo 클래스를 정의한다.
//- Human 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
//( * 표준 체중 : (Height - 100) * 0.9 )

	//필드 
	
	
	//생성자
	//표준 체중
	public StandardWeightInfo(String name, int height, int weigh) {
		super(name, height, weigh);
		// TODO Auto-generated constructor stub
	}
	
	
	//메소드
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf(", 표준체중은 %.1fkg입니다.\n",getStandardWeight());
	}

	
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
	
	public double getStandardWeight() {
		double avgewight = ((height -100)*0.9);
		return avgewight;
		
	}


	
	
	
	
	
}
