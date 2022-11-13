package com.yedam.java.ch0602;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.인스턴스 만들기
	   	Car myCar = new Car();//new연산자를 호출해서 인스턴스 만들기.
		//클래스를 기반으로 인스턴스 만듬
		
//2.내부필드를 불러와서 사용		
		System.out.println("제작회사 : "+myCar.company);
//		System.out.printf("제작회사는 %s입니다\n",myCar.company);
		System.out.println("모델명 : "+ myCar.model);  //도트 연산자를 통해 매서드와 ()에 접근
		//자바 프로젝트의 모든 클래스는 같은 부모를 가지고 있음 >>object
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
//3.생성된 인스턴스의 속성 변경 가능 		
		//현재 속도 올려보기
		myCar.speed = 60;   //speed는 필드이기떄문에 필드가 어디에 속해있는지만 적어주면 기존의 변수처럼 쓸수있음.
		System.out.println("수정된 현재의 속도 "+myCar.speed);
		
		Car newCar = new Car();  // new Car() >>기본 생성자 // 괄호안에 들어가는것도 없고 따로 적어줘여하는것도 없음.
		System.out.println("새로운 차의 현재속도는 :" + newCar.speed);  //my카와 new카는 현재 속도를 공유하지않음.
		
		
		
		
		
		
		String str = new String("Con");  //>> 생성자 선언
		
		//****변수와 필드의 차이****//
		//변수는 임의의 값 >>임시로 값을 담아놓을 수 있는 공간/언제 사라져도 ㄱㅊ
		//필드 임시의 값X 웬만하면 변하지 않는 값으로 고유의 값. /클래스라면 가지고있어야하는 성격 (제조사, 모델명, 색 등등 )
		
	}

}
