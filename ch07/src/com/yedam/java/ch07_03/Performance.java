package com.yedam.java.ch07_03;

public class Performance extends Culture {

	public Performance(String title, int directorNo, int actorNo) {
		super(title, directorNo, actorNo);
		// TODO Auto-generated constructor stub
	}
//	3) Performance 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.printf("영화제목 : %s\n", title);
		System.out.printf("감독 : %d\n", directorNo);
		System.out.printf("배우 : %d\n", actorNo);

	}
}
