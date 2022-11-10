package com.yedam.java.ch0605;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone iphone14Pro = new SmartPhone();  //이름, 제조사, 가격, 전화걸기,오프의 두가지 기능을 가진 스마트폰
	//new연산자는 SmartPhone라는 생성자를 만들고 객체가 생성됨.
		
		//막 개통한 후대폰에 정보넣어주기
		//도트 연산자를 통해서 아까 만든 매서드와 필드에 접근을 할 수 있음
		iphone14Pro.maker ="Apple";
		iphone14Pro.name = "iphone14Pro"; //컴퓨터가 인식할수있는 이름을 지정해주는것
		iphone14Pro.price= 1000000;
		//세가지의 가능이 들어가있는 객체
		
		//정보가 잘 들어갔는지 확인
		System.out.println("나의 휴대폰은 "+ iphone14Pro.maker+" 입니다.");
		System.out.println("나의 휴대폰 기종은 "+ iphone14Pro.name+" 입니다.");
		
		//.연산자를 통해 정보를 넣을 수도있고 꺼낼수도있음.
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		
		//클래스를 잘만들어놓으면 비슷한 성질을 가진 물체를 계속 만들어 낼수있음.
		SmartPhone zflip4= new SmartPhone();
		
		//객체 생성시 생성자에 초기값을 안 넣어준 경우
//		System.out.print("객체 생성시 생성자에 초기값을 안 넣어준 경우 : ");
//		System.out.println(zflip4.name);
//		System.out.println(zflip4.price);
		
		
		zflip4.name = "zflip4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		System.out.println("나의 휴대폰은 "+ zflip4.maker+" 입니다.");
		System.out.println("나의 휴대폰 기종은 "+ zflip4.name+" 입니다.");
		
		zflip4.call();
		zflip4.hangUp();
		
		System.out.println(iphone14Pro);
		//>>com.yedam.java.ch0601.SmartPhone@5aaa6d82
		//SmartPhone@5aaa6d82 >> 우리가 만든 class @ 주소가 담겨있는 주소(정보를 저장을 해주는 주소/프로그램이 실행되는 메모리의 주소라고 생각하면됨)
		//5aaa6d82이라는 메모리를 찾아가서 정보를 꺼내옴.
		//객체에 대한 정보를 알수있음.
		
		//new SmartPhone()데이터를 저장할수있는 공간을 할당해주는 것이 new연산자
		//SmartPhone() 생성자??>>클래스나 객체를 만들어 줄때 들어가고자하는 공간에 기능을 가지고갈지 안가지고갈지..?
		//>>지금은 ()가 비어있으면 매개 변수가 없는것// 매개변수가 없으면  null값으로 뜸
		//객체 생성시 생성자에 초기값을 안 넣어준 경우 : null
		//생성자를 만들지 않을 경우 자바에서 기본 생성자를 만들어줌.
		
		
		System.out.println(zflip4);
		//com.yedam.java.ch0601.SmartPhone@73a28541

		
	}

}
