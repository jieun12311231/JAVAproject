package com.yedam.java.ch0701;

public class Compute extends Calculator{

	@Override  //자식클래스를 가지고 와서 사용. .연산자 사용하면서 어디서 데이터를 가지고 오는지 확인해보기 
	double areaCircle(double r) {
		System.out.println("Compute 오버라이드 실행");
		return r*r*Math.PI;
		
	}

	
	
	
}
