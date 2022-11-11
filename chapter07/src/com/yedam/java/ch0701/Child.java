package com.yedam.java.ch0701;

public class Child extends Parent { // 부모의 핑드를 가지고 와서 쓸수있음
//Parent의 자식

	// 필드
	public String lastName;
	public int age;

	// 생성자

	// 메소드

	
	////오버라이드////
	@Override // @은 컴파일 하겠다는 의미 /부모 클래스으 내용 재정비 하겠다
	// 동일한 시그니처 public void method1() 는 똑같이 해야함
	public void method1() {  //재정의
		System.out.println("Child클래스 재정의 된 method1 호출");
	}

	public void method3() {  //자식 클래스에서만 정의됨
		System.out.println("Child클래스 정의 된 method3 호출");
	}
	
	
	
	
	
	
	
	
	
}
