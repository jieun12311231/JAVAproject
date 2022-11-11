package com.yedam.java.ch0701;

public class Application {
	public static void main(String[] args) {
		// 자식클래스 필드 이용
		Child child = new Child();
		child.lastName = " paul";
		child.age = 20;

		// 부모클래스의 필드 이용 부모 클래스에서 정의된 필드를 사용가능함.
		System.out.println(child.firstName + child.lastName);

		// System.out.println(child.job); //필드에 private로 설정되어있기때문에 불러올수 없음!

		// 부모 -> 여러명의 자식 가넝한!!
		// 자식 -> 여러명의 부모 불가넝한!!(자식은 하나의 부모만

		DmbCellphone dmb = new DmbCellphone("고아라폰", "화이트", 10);

		// 부모 클래스 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);

		// 자식 클래스 필드 사용
		System.out.println("채널 : " + dmb.channel);

		// 부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("뚱인데요");
		dmb.powerOff();

		// 자식 클레스 메소드 사용

		dmb.turnOnDmb();

		//Member클래스//
		Member member = new Member("짱구", "123456-123456", 1);
		
		//부모객체의 필드 사용 People//
		System.out.println("name : "+ member.name);
		System.out.println("ssn : "+ member.ssn);
		
		//자식객체의 필드 사용 Member//
		System.out.println("memberNo : "+ member.stdNo);
		
		//자식클래스의 객체 
		Child cd = new Child();
		cd.method1();  //재정의/
		cd.method2();
		cd.method3();  //재정의
		
		///Calculator//
		Compute com = new Compute();
		double result = com.areaCircle(10);
		System.out.println("rsult : " +result);
		
		//AirPlane//
		SupersonicAirPlane sa = new SupersonicAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
		
		
		
		////////자동차입변환 Child-Parent////////
		
		Child chd = new Child();
		//>>Parent parent = new Child(); 한줄로 표현 가능
		
		//부모 클래스에 있는 필드, 메소드를 사용을 하되 만얃에 자식 클래스에
		//오버라이딩 되어있는 메소드가 존재한다면
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 
		//메소드를 사용하게되는 것이 자동타입 변환임
		Parent parent = chd;
		
		parent.method1();
		parent.method2();
		//parent.method3();
		//자식입장이면 method1~3까지 불리는것이 맞지만
		//부모 타입으로 자동변환 시켰기때문에 method1~2만 불려져서 옴
		//chd는 부모 타입이기떄문에 method3를 불러올수없음.
		//chd는 부모 클래스에 정의된method1,2를 실행시킬수있고
		//method1는 자식 클래스에서 오버라이딩으로 재정의 되었기때문에 
		//재정의 된 내용으로 호출이 되고,
		//method2는 부모클래스에 잇는 내용이 그대로 출력이됨.
		
		
		
		

	}
}
