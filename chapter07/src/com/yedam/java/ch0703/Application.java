package com.yedam.java.ch0703;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상 클래스는 자신을 객체화(인스턴스화)할수없다.//
				
//		Phone phone = new Phone("아이폰");  >>에러 발생
//
//		SmartPhone smartphone = new SmartPhone("짱구");
//
//		smartphone.turnOn();
//		smartphone.internetSearch();
//		smartphone.turnOff();
		
//Animal// 추상클래스를 사용하기위해서는 자동타입변환을해서 사용
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------------");
		
		Animal animal = null;
		//>자동타입으로 바뀜  >>강아지 객체의 메소드 사용가능 >>강아지의 사운드가출력
		animal = new Dog();
		animal.sound();
		
		//애니멀에 정의해놓은 함수 사용가능 
		animal.breath();
		
		//Cat을 참조해서 animal이 타입이 자동변환됨.
		animal = new Cat();
		animal.sound();
		
		animal.breath();

		//자동타입변환을 하면 추상클래스라도 메소드를 저장할수있음.
		
		System.out.println("---------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		

		
	}

	public static void animalSound(Animal animal) {//Animal은 강아지와 고양이 클래스의 부모 클래스 
		animal.sound();  //이 메소드를 부르게 되면 자동타입변환이 일어나면서 상황이 맞는 소리 출력
	}
	
	
	
}
