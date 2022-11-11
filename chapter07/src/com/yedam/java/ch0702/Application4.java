package com.yedam.java.ch0702;


public class Application4 {
public static void main(String[] args) {
	B b = new B();
	C c = new C();
	//부모 ->자식
	//c -> b 상속 관계
	//b -> a 상속 관계
	//>>>>c->b->a 상속관계가 성립하게 됨.
	////손자->아빠->할배
	//손자와 할배는 이어져있음. a가 제일 위에 있는 클래스

	A a1 = b; //a1에 b라는 오버라이딩 아빠 클래스를 넣으면 a클래스에서 사용 가넝
	A a2 = c; //a2에 c라는 오버라이딩 손자 클래스를 넣으면 a클래스에서 사용 가넝
	
	
	
}
	
	
	
}
