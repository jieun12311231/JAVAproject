package com.yedam.java.ch07_02;

public class Application {
//Application 클래스 정의 / 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//- 출력결과
//	홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//	박둘이님의 신장 168, 몸무게 90, 비만입니다.  >>인터넷 참고해서 if문돌려야함.
//- 조건
//	변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = null;
		human = new StandardWeightInfo("홍길동",168,45);
		human.getInformation();
		human = new ObesityInfo ("박둘이",168,90);
		human.getInformation();
	
		
		
		
	}

}
