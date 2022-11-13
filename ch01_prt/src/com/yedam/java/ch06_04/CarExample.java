package com.yedam.java.ch06_04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.setGas(5);
//		
//		boolean gasState = car.isLeftGas();
//		if(gasState) {
//			System.out.println("출발합니다");
//			car.run();
//			
//		}
//		if(car.isLeftGas()) {
//			System.out.println("gas를 주입할 필요가 ㅇ벗습니다");
//			
//		}else {
//			System.out.println("가스를 넣어 주세요");
//		}
//		
		
		car.run();
	}

}
