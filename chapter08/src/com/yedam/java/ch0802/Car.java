package com.yedam.java.ch0802;

public class Car { // car를 객체로 만들어서 run을하면 넥센의 roll이 실행됨.
	
	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire backLeftTire = new NexonTire();
	Tire backRightTire = new NexonTire();

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
