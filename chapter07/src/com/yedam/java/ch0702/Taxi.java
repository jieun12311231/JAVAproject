package com.yedam.java.ch0702;

public class Taxi extends Vehicle{

	@Override  //얘가 없더라도  오버라이딩 상태는 유지됨.
	//자바한테 미리 알려주냐 마냐의 차이
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
