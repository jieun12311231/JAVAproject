package com.yedam.java.ch07_1;

public class Computer extends Calculator{

	@Override
	double aCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("자식 컴퓨터의 객체 실행");
		return Math.PI *r *r;
	}

	
}
