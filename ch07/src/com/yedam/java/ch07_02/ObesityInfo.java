package com.yedam.java.ch07_02;

//ObesityInfo 클래스를 정의한다.
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

public class ObesityInfo extends StandardWeightInfo {

	public double bmi;

	public ObesityInfo(String name, int height, int weigh) {
		super(name, height, weigh);

	}

//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
	@Override
	public void getInformation() {
		String result = null;
		if (bmi < 30) {
			result = "비만";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 23) {
			result = "정상";
		} else {
			result = "저체중";
		}
//		return result;
		System.out.printf("%s님의 신장 %dcm,몸무게 %dkg, %s입니다.\n", name, height, weigh, result);
//		System.out.printf(name + "님의 신장 " + height + ", 뭄무게 " + weigh + "," + getObesity() + "입니다.");
		
	}

	// (2) public double getObesity() : 비만도를 구하는 기능
	// ( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	public double getObesity() {
		double bmi = ((weigh - getStandardWeight()/(getStandardWeight()*100)));
		return bmi;
		
		
		
	}

}
