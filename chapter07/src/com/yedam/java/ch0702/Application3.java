package com.yedam.java.ch0702;

public class Application3 {

	public static void method1(Parent parent) { // 매개변수통해서
		// 객체타입확인 instanceof//
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1- child변환성공");
		} else {
			System.out.println("변환실패");
		}

//	public static void main(String[] args) {
//		Parent parentA = new Child();
//		method1(parentA);
//		Parent parentB = new Parent();
//		method1(parentB);
//		
//	}    ????????????????????????????????

	}

	public static void main(String[] args) {

		// 객체타입확인 instanceof//
		Parent parentA = new Child(); // 자동타입변환된것 >>매개변수 안으로 들어감.
		method1(parentA); // 자동타입변환 한것이 이쪽으로 들어감.
		// parentA은 타입은Parent이지만 Child를 참조해서 만듬.
		// instanceof을 쓰면 무엇을 참조했는지 물어보기떄문에 Child되어서 참이 됨.

		
		
		
		
		Driver driver = new Driver();

		// 버스와 택시는 부모 클래스인vehicle을 섬기는것
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// bus에 객체를 넣으면 Driver클래스의 public void drive(Vehicle vehicle)의 vehicle에 들어가게됨.
		// driver.drive(Vehicle vehicle = new Bus())
		// 타입은 Vehicle 부모 클래스의 메소드를 사용할수 잇음.
		// 자동 타입변환에 의해서 오버라이딩 된 메소드가 실행됨

		driver.drive(bus);
		driver.drive(taxi);
		// 이것을 실행하면 데이터가 Driver로 가서 오버라이딩 된 자식 클래스를 부모 클래스인
		//

		Parent parent = new Child();
		parent.method1();
		parent.method2();

//		parent.field2 = "child";
//		parent.method3();

		// 캐스팅 - 강제타입변환
		// 부모 + 자식꺼 까지 다 쓰겠다는 것으로 생각하면됨.
		// 원래는 m1m2만 쓸수잇지만
		// 강제 타입변환으로 fiel2,m3까지 쓸수있음.
		Child child = (Child) parent;
		child.field2 = "parent";
		child.method3();
		child.method1();
		child.field = "parent";
		
		System.out.println(child.field2);
		System.out.println(child.field);

	}

}
