package com.yedam.java.ch0702;

public class Car {

	//필드
	//4가지의 필드를 가진 자동차에 타이어를 끼워 넣은거임.
	//객체에 타이어를 달아줌
	Tire frontLeftTure = new Tire("앞왼쪽",6);
	Tire frontRightTure = new Tire("앞오른쪽",2);
	Tire backLeftTure = new Tire("뒤왼쪽",3);
	Tire backRightTure = new Tire("뒤오른쪽",4);
	
	//생성자
	
	//시동걸어서 운전
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTure.roll()==false){
			stop();
			return 1;
			
		}
		if(frontRightTure.roll()==false){
			stop();
			return 2;
			
		}
		if(backLeftTure.roll()==false){
			stop();
			return 3;
			
		}if(backRightTure.roll()==false){
			stop();
			return 4;
			
		}
		return 0;
	}
	
	void stop() {  //
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
	
	
	

}
