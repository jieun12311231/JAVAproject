package com.yedam.java.ch06;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("제작회사는 "+car.company);
		System.out.println("모델명은 "+car.model);
		System.out.println("색깔은 "+car.color);
		System.out.println("최고속도는 "+car.maxSpeed);
		System.out.println("현재속도는 "+car.speed);
		
		car.speed = 100;
		System.out.println("수정된 현재 속도는 "+car.speed);
		
	}

}
