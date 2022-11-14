package com.yedam.java.ch0801;

public interface RemoteControl {
	//리모컨을 만드는 인터페이스  >> 리모컨만 만들어놓으면 티비, 컴퓨터,스피커 등등 여러가지 장비에 사용할수있게 됨

	// 기존의 클래스와 다르게 생김(상수와 추상 메소드만 가짐)

	// 상수
	// public static final PI = 3.15;

	// 추상 메소드  --미완성 설계도 
	//public void method1();
	
	//기본 설계도
	// ex) 대규모 프로젝트 -> 번역
	//A영어 -> 한글 (메소드 : 번엳
	//B영어-> 일본어(메소드 : method1()
	
	//C영어 -> 중국어(메소드 : method2()
	
	//같은 번역이지만 사람마다 다른 이름의 메소드로 사용함  >> 인터페이스에 필요한 설정 몇개만 정해놓으면
	//밑의 사람들이 각자의 입맛에 맞게 사용
	
	//프로젝트 완료
	//똑같은 메소드 이름으로 구현 > 유지보수 할때 금방 알수있어서 편함
	
	
	//상수 만들기  - 스태틱 안써도 알아서 스태틱 성격을 가짐 //써도 되고 안써도 됨.
	//public static final int MAX_VOLUME = 10;와 같음.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 선언  -- 꼭 구현해야하는 요소가 됨.
//	public abstract void turnOn(); 이랑 같음
	public void trunOn();  //abstract 가 생략 되어있는것임  >> 오버라이딩이 가능한 이유//인터페이스에서는 생략이 가능하지만 추상클래스에서는 생략안됨
	public void trunOff();
	public void setVolume(int volume);
	
	//게시판을 만든다고 치면 쓰기, 읽기, 리스트 조회 기능, 
	//>> 각제 조원별로 다른 메소드를 사용 하기때문에
	//나중에 보기가 어려움. 
	// 다른 사람들이 한 것을 참조하기 어려움 
	// 인터페이스를 통해서 이름은 같지만 다른기능 구현 가능
	
	
}
