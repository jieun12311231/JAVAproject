package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {  //프로젝트를 실행시키기 위해서 반드시 main이 있어야함.
		Car car1 = new Car();  //Car타입 불러오고 car1이라는 변수선언 //new연산자를 통해 인스턴스 만듬	
		System.out.println("최대스피드 : "+car1.maxSpeed);  //.(도트연산자)을 통해 생성한 필드를 불러올수있음
		System.out.println("색상 : "+car1.color);
		car1.run(); //제대로 동작하는지 함수 호출
		
		System.out.println();
		
		Car car2 = new Car("blue");
		System.out.println("최대스피드 : "+car2.maxSpeed);
		System.out.println("색상 : "+car2.color);
		car2.run();
		
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참고합니다.");
		}else {
			System.out.println("car1과 car2는 서로 다른 객체를 참고합니다.");  
			// 출력되는 값은 같더라도, new연산자를 통해 인스턴스를 생성했기때문에 서로 다른 객체를 참고하게됨.
			//다른 객체를 참고하는건 맞지만 서로다른 객체안에 같은 값을 가지고있는 것임. 
			//new연산자는 존재여부와 상관없이 무조건 새로운 객체를 만들어 냄.
			//매소드 >> 프로젝트의 모든 클래스가 올라감 /실행여부 상관없음/ 설계도가 모여있는 공간이라고 생각하면 됨.
			//car1는 매소드에서 Car이라는 클래스에서 생성자를 찾아서 힙영역에 객체(인스턴스)를 생성하고 스ㅊ택영역에 주소를 보냄
			//car2는 매소드에서 Car이라는 클래스에서 생성자를 찾아서 힙영역에 객체를 생성(인스턴스)하고 스ㅊ택영역에 주소를 보냄
			//동일한 객체를 참고하기떄문에 모양은 같지만 서로다른 존재임.>>개별적인 존재들임 
			//car1의 speed를 200으로 바꾸면 클래스가 변동되는건 아니기떄문에 car1의 speed만 200으로 바뀜 
			//car2에는 영향 x
			//인스턴스는 클래스를 기반으로 만들지만 개별적인 존재가 됨 >> 같은 설계도에 따라 차를 만들어 내지만 자동차로 만들어지는 순간 개별적인 존재가 됨.
			
			
		}
	}

}
