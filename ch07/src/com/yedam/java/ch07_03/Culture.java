package com.yedam.java.ch07_03;

import java.util.Scanner;

public abstract class Culture {
//	1) Culture 클래스를 정의한다.
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//(2) public String getGrade() : 평점을 구하는 기능
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
//	
	Scanner sc = new Scanner(System.in);
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	public String title;
	public int directorNo;
	public int actorNo;
	public int audience;
	public int total;

//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.	
	public Culture(String title, int directorNo, int actorNo, int audience, int total) {
		this.title = title;
		this.directorNo = directorNo;
		this.actorNo = actorNo;
		this.audience = audience;
		this.total = total;
	}

//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//(2) public String getGrade() : 평점을 구하는 기능
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드

//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능	
	public void setTotalScore(int score) {
	score = Integer.parseInt(sc.nextLine());
	
	}
//(2) public String getGrade() : 평점을 구하는 기능
//	public String getGrade() {
//		for() {
//			
//		}
//	}
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	public abstract void getInformation();
	
	

}
