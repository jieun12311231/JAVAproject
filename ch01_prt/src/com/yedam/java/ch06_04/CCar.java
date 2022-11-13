package com.yedam.java.ch06_04;

public class CCar {

	
	int speed;
	
	
	
	
	
	
	int getspeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키 돌림");
	}
	void run() {
		for(int i =10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다 시속 "+speed);
		}
	}
	
	
	
	
	
	
	
}
