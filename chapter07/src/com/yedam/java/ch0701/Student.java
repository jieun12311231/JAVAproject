package com.yedam.java.ch0701;

public class Student {  //클래스만들때 final
//부모//  >>final 클래스를 상속을 할수 없음 아무 클래스나가서 extends Student하면 에러남.
	
	public void setScore() {
		System.out.println("성적을 입력합니다.");
	}
	
	
	public final void getScore() {  //final로 지정되어있으면 오버라이딩 안됨.
		System.out.println("성적을 출력합니다.");
	}
	
	
	
	
	
}
