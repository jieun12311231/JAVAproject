package com.yedam.java.ch06_05;

public class Car {

	String model;
	int speed;
	
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i =10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.");
			System.out.println("시속 "+speed+"로 달립니다.");
		}
	}
}
