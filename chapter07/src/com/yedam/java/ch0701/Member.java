package com.yedam.java.ch0701;

public class Member extends People{
//People 의 자식 Member
	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) { 
		// 부모 클래스가 매개변수를 두개를 만들었기때문에 자식클래스에서 매개변수를 넣어줘야함
		//member을 인스턴스화할때  부모 클래스의 생성자를 super(name, ssn)을 통해서 부름
		//>> Peaple을 통해서 Member이라는 부모 객체가 만들어가는것
		super(name, ssn);  //부모 클래스에 "짱구", "123456-123456" 정보를 넣어줌
		//부모의 생성자가 정해져있기떄문에 super써야함.
		
		//super 부모 클래스의 유무에 따라 나뉨 
		
		
	
		this.stdNo = stdNo;
		
		//부모 클래스가 기본 생성자일떄 (()가 비어있는경우>>this를 통해서 부름)
		//기본생성자가 아니면 super를 통해서 불러옴
		//super
		//
	}

}
