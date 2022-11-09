package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; 

	
	//생성자
//	public Car(String model, String color) {  //()안에 매개변수의 형태로 선언이 가능해짐
//		//모델과 칼라를 받아와서 값을 바꾸겠다는것
//	
//		this.model = model;  //this는 이 클래스로 생성되는 !!!인스턴스!!!를 의미함.
//		this.color = color; 
//		
//		//this는 생성자와 매서드 안에서만 작동 가능
//		//인스턴스가 참고하는것이 매서드와 생성자이기때문
//	}
	public Car() {  //이것을 넣어줘야지 newCar가 정상적으로 작동을 함
		//디폴트 만들기
			
	}
	
	public Car(String model) {
//		this.model = model;  //>> 기존의 모델값이 넘어온 값을 가질것
		this(model,"은색", 150);
		//this를 불러올때는 전제조건이 필요함//>> 얘는 반드시 첫줄에만 호출이가능함
		//this전에 어떠한 명령어라도 있으면 아예 사용이 불가능함.
		//this는 생성자를 호출하기떄문에!!!!!this가 실행이 되어야 인스턴스가 생성되기때문에
		//>>> 실행이 가능하게 됨.
		//this가 존재하면 인스턴스라고 생각하면됨.
		//this하고 괄호 없으면 필드 /괄호가 있으면 생성자 /
		
	}
	
	public Car(String model, String color) {  
	
//		this.model = model;  
//		this.color = color;
		this(model,color, 250);
	}
	
	public Car(String model, String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
