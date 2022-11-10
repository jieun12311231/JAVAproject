package com.yedam.java.ch0605;

public class Access {  //클래스는 private 걸면 다른 클래스에서는 사용 못하게됨
	//대상 : 모든 대상, 필드, 메소드 , 생성자 등등등 자바의 모든 접ㄴ부
	//public 누구나, 어디서든 접근 가능하게 만들어 주는것 , 필드, 메소드 , 생성자 다 가능함
	//private: 내가 속한 클래스 내부에서만 사용이 가능함.
	//protected: 상속받은 상태에서 부모- 자식간 사용 가능(패키지 달라도 사용가능)
	//			 > 같은 패키지 내에서 사용가능
	//default : 같은 패키지 내에서 사용가능, 패키지 다르면 사용 불가. 
	
	//필드  //필드에서 접근 제한자 걸기 
	public String free;
	private String privacy;
	protected String parent;
	String basic;
	
	//생성자
	
	
	//메소드   // 메소드에서 접근 제한자 걸기
	public void free() {
		System.out.println("접근 가능합니다.");
		privacy();//직접 부르지는 못하지만 얘를 통해 privacy를 부를수 있음
	}
	private void privacy() {
		System.out.println("접근이 불가능합니다.");
	}
	
	
	
}
