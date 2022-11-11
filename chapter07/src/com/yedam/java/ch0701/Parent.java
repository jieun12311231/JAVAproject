package com.yedam.java.ch0701;

public class Parent {
//	Child의 부모

	// 필드
	public String firstName = "smith";// 물려받음
	public String lastName;// 변경가능
//	private String job = "progammer";
	public String job = "progammer";
	public char blootypte = 'o';// 물려받음
	public int age;

	// 생성자

	// 메소드

	public void method1() {
		System.out.println("parent 클래스 method1호출");
	}

	public void method2() {
		System.out.println("parent 클래스 method2호출");
	}
	
	
	
	
	
	
	

}
