package com.yedam.java.ch06_04;

public class CCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar car = new CCar();
		car.keyTurnOn();
		car.run();
		
		int speed = car.getspeed();
		System.out.println("현재속도 :" +speed);
		
		
		
		Print print = new Print();
		
		print.println(10);
	}
	

}
