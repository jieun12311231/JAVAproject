package com.yedam.java.ch07_02;

//ObesityInfo 클래스를 정의한다.
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, int height, int weigh) {
		super(name, height, weigh);
		
	}
	
	public double getObesity() {
		double bmi = ((weigh -getStandardWeight())/getStandardWeight()*100);
		return height;
		
	}
	
	

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf("");
	}

	@Override
	public double getStandardWeight() {
		return super.getStandardWeight();
		
	}

	
	
}
