package com.yedam.java.ch0801;

public class Myclass {

	//필드
	//1) public int a = 1; 이랑 같은 느낌
	RemoteControl rc = new Television();
	
	
	//생성자 -생성자에 내가 원하는 객체를 집어넣어서 사용할수있떼 
	//오버로딩
	public Myclass() {

	}
	public Myclass(RemoteControl rc) { //메소드 이름만 가지고 오면 사용 가능 
		this.rc = rc;
		rc.trunOn();
		rc.trunOff();
	}
		
	//메소드
	
	void methodA() {
		RemoteControl rc = new Audio(); //오디오를 구현 객채를 만들어서 사용
		rc.trunOn();
		rc.trunOff();
	}
	void methodB(RemoteControl rc) { //RemoteControl를 구현 클래스를 매개변수로 넣어주어서 객체로 만들어서 사용
		rc.trunOn();
		rc.trunOff();
	}
	
	
	
	
	
	
	
}
