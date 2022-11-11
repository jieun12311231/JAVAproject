package com.yedam.java.ch0702;

public class Driver {
	public void drive(Vehicle vehicle) { // 매개변수에 클래스가 들어갈수도있음
		
		vehicle.run();
		
		//>>>자동 타입변환에 의해서 오버라이딩 된 메소드가 실행됨
		//오버라이딩 된 객체
		//bus.run()
		//taxi.run()이 실행이됨.
		//
	}
}
