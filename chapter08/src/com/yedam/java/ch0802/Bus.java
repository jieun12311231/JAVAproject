package com.yedam.java.ch0802;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	 //구현 클래스 Bus에서 자체적으로 정의한 메소드
	public void checkFare() { 
		System.out.println("승차요금을 확인합니다.");
	}

}
