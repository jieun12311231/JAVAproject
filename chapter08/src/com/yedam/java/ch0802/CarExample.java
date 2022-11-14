package com.yedam.java.ch0802;

public class CarExample {
//필드의 다형성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		//넥센의 재정의된 내용만 출력
		
		mycar.run();  //넥센 타이어가 roll 
		
		System.out.println("===============");
		
		//인터페이스 된 기능 > 앞 바퀴 두개는  미쉐린 타이에서 가지고옴
		mycar.frontLeftTire = new MichelinTire();
		mycar.frontRightTire = new MichelinTire();
		mycar.run();
	}

}
