package com.yedam.java.ch06_06;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(-50);
		
		System.out.println(car.getSpeed());
		
		
		
		car.setSpeed(60);
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println(car.getSpeed());
	}
}
