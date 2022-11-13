package com.yedam.java.ch06_05;

public class CCar {

	int speed;

	void run() {
		System.out.println(speed + "로 달립니다.");

	}

	public static void main(String[] args) {
		CCar car = new CCar();
		car.speed = 60;

		car.run();

	}

}