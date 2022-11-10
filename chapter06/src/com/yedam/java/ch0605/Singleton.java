package com.yedam.java.ch0605;

public class Singleton {
	//싱글톤 디자인 패턴 
	
	//싱글톤의 기본 패턴//
	
	
	//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
	
	//아무도 접근 하지 못하는 
	//1)단 하나의 객체
	//Singleton을 클래스 타입으로 말할수 있음 파란글자 Singleton의 객체는 Singleton이라는 클래스타입임. 
//방법1
	private static Singleton singleton = new Singleton();
					        //Singleton = new Singleton();
	
	
	//밖에서 객체를 만들지 못하게 넣어주는것
	//1) private을 통해 생성을 막음
	private Singleton() {
		
	}
	
	//어디서든지 사용사능함, 메소드를 통해서 이미 만들어놓은 객체를 사용
	//getInstance을 써서 내가 만들어 놓은 singleton 을 불러오는것
	//주소를 통해서 반환 되는 것이기 때문에 내가 찾는 singleton이 불러져서 옴.
	public static Singleton getInstance() {
		return singleton;
//				Singleton = new Singleton();
	}	
	public void run () {
		System.out.println("싱글톤이 작동중입니다.");
	}
		
	public void connectDB () {
		System.out.println("데이터베이스를 연결합니다.");
	}
	
}
