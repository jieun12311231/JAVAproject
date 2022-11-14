package com.yedam.java.ch0801;

public class MyclassExaple {

	public static void main(String[] args) {
		
		//교재 380의 1번
		
		//Myclass에 만들어놓은 필드 사용
		System.out.println("1)---------");
//		RemoteControl rc = new Television();
		Myclass mc = new Myclass();
		//mc객체 안에 RemoteControl rc객체가 있음
		//mc안에 rc안에 있는 메소드들을 사용
		//객체 안에 구현객체를 넣었기떄문에 사용가능한것.
		mc.rc.trunOn();
		mc.rc.trunOff();
//		
		
		//생성자를 통해서 객체 만들기
		System.out.println("2)---------");
//		RemoteControl rc = new Audio();		
		Myclass mc2 = new Myclass(new Audio());
		//rc.trunOn();
		//rc.trunOff();
//		mc2.rc.trunOn();
//		mc2.rc.trunOff();
		
		//
		System.out.println("3)---------");
//		RemoteControl rc = new Audio();		
		Myclass mc3 = new Myclass();
		mc3.methodA();
		//rc.trunOn()
		//rc.trunOff()
		
		//
		System.out.println("4)---------");
//		RemoteControl rc = new Television();
		Myclass mc4 = new Myclass();
		mc4.methodB(new Television());  //텔레비전 안에있는 턴온, 턴오프 출력됨
		//rc.trunOn();
		//rc.trunOff();
	}

}
