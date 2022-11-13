package com.yedam.java.ch0605;

public class GameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//생성자 3개를 통해서 만들기  마인크래프트의 유저 정보
		//1)첫번째 생성자 -- 기본 생성자를 통해 유저를 만듬. >> 도트 연산자를 통해서 데이터를 넣어줌
		Game user1 = new Game();
		user1.id ="예담이";
		user1.passWd ="1234";
		
		//2)두번째 생성자 -> id라는 매개변수가 하나 /.을 통해 passWd를 넣어서 객체를 만듬. 
		Game user2 = new Game("예담이2");
		user2.passWd ="4321";
		
		//3)세번째 생성자 
		Game nser3 = new Game("예담이3","5678");
		
		
		
		
		user1.getInfo();
		user2.getInfo();
		nser3.getInfo();
				
		
		
		
		//static(정적, 고정)필드 사용
		System.out.println("===static필드 호출===");
		System.out.println(Game.gameName);
	}

}
