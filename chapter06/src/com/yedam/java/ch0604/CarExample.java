package com.yedam.java.ch0604;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		myCar.setGas(5);

///외부호출
//		boolean gasState = myCar.isLeftGas();
//		if(gasState) {
//			System.out.println("출발합니다.");
//			myCar.run();
//	}
//내부 호출		
		myCar.run();
	}
}
