package com.yedam.java.ch0702_1;

public class Animal {

	void speak() {
		System.out.println("Animal 클래스의 Sound()");
	}
	
}
//부모 - 애니멀 >>범위가 큰 클래스를 생성해 부모로 지정
//자식은 애니멀 이라는 큰 그룹안에 속해있음
//자식 - 고양이 강아지 >> 애니멀의 성질을 가지고 있는 것들을 자식클래스로 만들어줌
// 고양이와 강아지는 짓는다는 공통점이있음.
//오버라이딩을 하면 자식에 잇는 객체를 부모 클래스에서 사용이 가능하도록함.
//오버라이딩을 하지않으면 Animal의 Animal 클래스의 Sound()이 출력됨.
//>>하나의 객체로 다양한 객체를 만들어서 사용하는것을 다형성이라고 함
//
