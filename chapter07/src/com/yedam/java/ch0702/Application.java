package com.yedam.java.ch0702;

public class Application { // 실행할수있는 공간
	public static void main(String[] args) {
		
		//타이어가 다 달린 완성된 자동차
		Car car = new Car();  //자동차 만듬
		
		//반복문 이용해서 차 굴리기
		for (int i = 1;i<=5;i++) {
			int problemTire =car.run(); 
			//타이어의 수명이 다하면 Car에서 return 숫자를 받아서 타이어의 위치가 어디인지 알수있게 한것
			//1은 앞왼쪽 2- 앞 오른쪽 등등
			
			switch(problemTire) {
			case 0:
				System.out.println("타이어 네개 다 멀쩡합니다.");
				
				break;
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				//frontLeftTure의 타입은 Tire인데 HankookTire로 타입을 바꿔줌
				//펑크가 나면 타이어를 한국타이어로 교체
				//car.frontLeftTure가 부모 타이어 HankookTire가 자식  >> 자동타입변환
				//Tire의 기능을 쓰는것이 아니라 HankookTire의 세부적인 기능을 사용하게 됨.
				//자식타이어HankookTire로 갈아 끼우지만 부모 클래스에서 바꿧다는 안내문구를 출력
				//>>정리<<
				//frontLeftTure 펑크 > 교체 필요 >HankookTire로 교체 
				//규격은 부모Tire를 따르되 자식인 HankookTire의 세부적인 기능을 가지게됨.>>부모클래스인 Tire에서 오버다리딩한 내용을 HankookTire의 정의된 내용을 사용한다.
				//Tire를 금호, 한국등 여러가지 회사가 있고 그것을 car에 사용이 가능하기떄문에
				//>>>다형성이 있다고함.
				car.frontLeftTure = new HankookTire("앞왼쪽",15);
				//HankookTire tire = new HankookTire("앞왼쪽",15);
				//car.frontLeftTure =tire;
				break;
			case 2:
				System.out.println("앞오른쪽 kumhoTire로 교체");
				car.frontRightTure = new KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTure = new HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 kumhoTire로 교체");
				car.backRightTure = new KumhoTire("뒤오른쪽",17);
				break;
			
			}
			System.out.println("===============================");
			
		}
		
	}
}
