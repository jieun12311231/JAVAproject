package com.yedam.java.ch0802;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// 매개변수의 다형성을 확인하기 위해

		driver.drive(bus);
		// bus 가 Driver의 drive(Vehicle vehicle) 으로 들어감. >>bus.run 이 되어서 실행이됨.
		driver.drive(taxi);

		// 어떤 매개 변수가 들어오는지에 따라서 다양한 형태가 나타남

		
		
		
		Vehicle vhc = new Bus();  //버스의 vhc이라는 구현 객체가  있어야함,
		vhc.run();
		
		
		//강제타입변환- Bus클래스의 checkFare을 쓰고 싶다. 
		System.out.println("===강제 타입 변환===");
		Bus bus2 = (Bus) vhc;
		
		bus2.run();
		bus2.checkFare();
		
		
		//객체타입확인
		//instanceof
		System.out.println("===객체 타입 확인===");
		driver.drive(bus);
		driver.drive(taxi);
	}
	

}
