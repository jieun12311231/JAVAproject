package com.yedam.java.ch0703;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();  //무조건 오버라이드 해줘야함.
	//sound가 어떤용도인지/ 같은 메소드 이름을 쓰기위해
	
}
