package com.yedam.java.ch0703;

public class Dog extends Animal {// 오버라이딩을 안해주면 Dog에 에러가 남.

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}
