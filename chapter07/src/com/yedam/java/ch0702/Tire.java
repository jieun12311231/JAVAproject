package com.yedam.java.ch0702;

public class Tire {
/////다형성//////교재 332///////
// 교재 340~344 Tire문제
//
	// 필드
	public int maxRotation; // 수명 최대회전수
	public int accRotation; // 누적 회전수
	public String location; // 타이어의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	// 메소드
	//Tire에 정의된 기본 규격
	
	public boolean roll() {
		++accRotation;
		// 누적 회전수 < 최대 회전수 roll이 호출 될때마다 바퀴가 굴러감
		// >> 누적 회전수가 최대 회전수 보다 작으면 아직 타이어 수명 ㄱㅊ
		// 누적회전수가 ㅌ최대회전수를 넘어가면 펑크
		if (accRotation < maxRotation) {
			System.out.println(location + "Tire 수명 " + (maxRotation - accRotation) + "회");
			return true;
		} else {
			System.out.println("### " + location + "Tire 펑크 ###");
			return false;
		}
	}

}
