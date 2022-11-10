package com.yedam.java.ch0605;

public class ConstantNo {
	
	//필드//
	//
	static final double PI = 3.14;  //static어디서든 불러쓸수있는 final불변의 데이터가 됨// 
	static final int EARTH_ROUND = 46250;
	static final int lIGHT_SPEED = 127000;
//	static int = appleBanana  //원래는 이렇게 씀
	//static final이 들어가면 대문자로 써야하고 합성어의 경우 사이에 _ 가 들어감.
	
	
	String words = "This is Java";
	char word = 'Y';
	
			
	//생성자
	
	
		
	//메소드//
	//static멤버의 사용 범위 (scope) 교재 277
	
	//static 메소드 r은 매개변수로 받아올수있도록 함. 
	//static간의 필드 사용
	//스태틱으로 정으된 스태틱 소드
	static void getCircle(int radius) {
		//원 넓이 pi* r*r
		System.out.println("원 넓이 : "+ (PI *radius *radius));
		//pi가 같은 static공간에 있기떄문에 호출하고 사용가능 . 
	}
	//메소드의 static필드 호출.
	//메소드가 스테틱 메소드가 아님 >>스태틱안에 인스턴스영역이 있기떄문에 스태틱을 사용가능.
	//스테틱은 어느 영역에서든 사용이 가능하기떄문에 >>> 스태틱이 없는 메소드에서도 사용이 가능함.
	// 
	public void allData() {
		double result = PI +EARTH_ROUND+lIGHT_SPEED;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {
//		String getWord = words + String.valueOf(word);
	//스태틱 영역에서는 기본 타입, 참조타입은 사용 x .
	//따로 참조할수 있도록 만들어 줘야함.
	//word는 힙영역에 등록이 되어있기떄문에 메소드영역에있는 스테틱 영역을 끌어올수는 없음
	//>>>>>해결하는 방법은????
		
	}
	
}
