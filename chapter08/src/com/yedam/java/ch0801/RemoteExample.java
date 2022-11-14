package com.yedam.java.ch0801;

public class RemoteExample {
//만들어놓은 구현 클래스를 실행시키는 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//불러와서 사용하는 방법 /
		//자동타입 변환 ( 자동타입 변환을 통해서 인터페이스를 불러오는거임)
		RemoteControl rc = new Television(); //new Television()라는 구현클래스를 통해 RemoteControl가 생성됨
//		//rc 라는 하나의 객체(설계도)로 new Television()를 끼우거나 new Audio()를 끼워서 필요에 따라 사용가능 
		//
		
//		rc = new Audio();  //rc라는 객체에 오디오로 덮어씀
		//Television객체가 생성되고
		//>>Audio이라는 객체로 변!경!됨
		//원하는 기능으로 갈아끼우기 가능.
		
		//리모크에 있는 정보를 사용하는것이 아닌 오버라이딩 된 텔레비전의 데이터를 끌어와서 사용 가능
		rc.trunOn();
		rc.setVolume(11);
		rc.trunOff();
		
		//다중인터페이스를 이용한 구현 클래스 교재378
		//검색 기능을 사용하기 위해서 
		Search sc = new Television();
		sc.search("naver.com");
		//Television 클래스에 만들어 놓은 메소드 들을 사용하지 못함.
		//Television 클래스 안에 Search타입으로 오버라이딩된 내용만 사용가능함.
		//sc.trunOn()   sc.trunOff() 이런 애들은 Television타입의 메소드 이기떄문에 사용못함.
		//
		
		//텔레비전에 대한 객체만 불러서 사용하는거임 위와 다름
		//자기자신만을 활용
//		Television tv = new Television();
//		
//		tv.trunOn();
//		tv.setVolume(11);
//		tv.trunOff();
		
		
		
//		public void temp(RemoteControl rc){
//	}     >>rc를 통해서 다양한 객체를 만들수 있음
		//>> 하나의 객체로 여러가지 생성 가능
		
//		public void temp (Television tv) {
//			//tv클래스만 만들수있는 객체가 되는거임
			// 다른 리모컨을 만들고싶으면 public문을 많이 사용해야해서 번거로움.
//		}
		
		//★★★//
		// 추상클래스 VS 인터페이스
		// 추상 클래스 extends(상속) -> 필드, 생성자, 메소드  >부모한테 물려받아서 사용하는 요소들
		//>> 상속이기 때문에 한자식은 한부모만 가능
		//
		//
		// 인터페이스 implement -> 상수 , 추상메소드  >>더 많이 사용하게 될예정임 
		// 하나의 구현 클래스에 원하는 기능을 계속 붙일수있음(>> 부모 - 자식의 개념이 아니기때문에 상속 여러가지 가능
		//public class SamsungWashingMachine implements WashingMachine ,RemoteControl{} 가능
		//
		//사용하는 용도가 다름 
		// 부모의 요소를 사용할거면 >> 추상클래스
		// 기능 위주로 사용하고 더 기능을 추가하고 싶다 >>인터페이스
		
		//인터페이스는 생성자가 없음>> 구현클래스를 바로 객체로 만들어서 사용가능 >>쓰고싶은거 쓰면됨.
		//
	}

}
