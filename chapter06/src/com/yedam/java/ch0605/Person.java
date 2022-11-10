package com.yedam.java.ch0605;

public class Person {
//한국국적을 가진 사람을 넣는 클래스
	
	final String nation = "korea";
	final String ssn;  //주민번호  //정해진 값이 없으면 최초에 들어가는 값이 고정이 됨.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;  //한번 final로 정의 된 값은 고정
		this.name = name; //개명 가능하기떄문에 final을 붙이지 않음.
		
	}
}
//국적과 주민번호는 변경이 안되기떄문에 final이라는 연산자를 통해 고정 시켜줌.
//