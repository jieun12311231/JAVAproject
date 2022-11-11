package com.yedam.java.ch0701;

public class SupersonicAirPlane extends AirPlane {
//자식
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() { // 비행모드에 따라 어떻게 비행하는지 출력
		if (flyMode == SUPERSONIC) {  //초음속인 경우 
			System.out.println("초음속 비행 모드입니다.");
		} else {
			super.fly(); 
			// 일반비행일경우 부모 클래스의 메소드를 가지고 와서 쓸수 있도록 해줌
			//부모 클래스에 있기떄문에 따로 정의 안해줘도 됨.
			//초음속 비행기외에도 다른 비행기를 만들고 싶으면 부모클래스의 내용만 바꿔주면 
			//내용변경이 가능함 //그렇지 않으면 자식마다 다 수정해줘야함.
			//클래스가 많아질수록 상속을 하면 편함 //중복되는 코드가 없음.
			
		}
	}

	public void test() {  //일반클래스에서도 부모 클래스를 불러와서 사용 가능함.
		super.fly();
	}
	
	
}
