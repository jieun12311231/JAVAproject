package com.yedam.java.ch0702;

public class Application2 {
//타이어 응용하기
	public static void main(String[] args) {
		HankookTire hTire = new HankookTire("right",10);
		KumhoTire kTire = new KumhoTire("left",20);
		
		
		//부모타입인 Tire객체에 자식 객체인 hTrie;
		//tire >>> 한국 타이어를 사용하고 있다.
		//한국 타이어에 오버라이딩 된 내용이 있으면 Tire의 내용을 쓰지않고 한국 타이어에 대한 내용을 출력하겠다.
		Tire tire = hTire;
		System.out.println(tire.roll());
		
		
		//타이어를 금호 타이어로 갈아끼우는것
		//금호 타이어에 오버라이딩 된 내용이 있으면 Tire의 내용을 쓰지않고 금호 타이어에 대한 내용을 출력하겠다
		tire = kTire;
		System.out.println(tire.roll());
		
		
		//다시 한국타이어로 갈아끼움
		//부모의 규격을 가지고와서 사용하되 한국 타이어에 오버라이딩된 내용을 출력
		tire = hTire;
		System.out.println(tire.roll());
		
		
		//>>>>하나의 타입으로 다양한 결과물을 출력하고있음 >>>>이걸 다형성이라고 함~~~~?
		//타이어회사가 6개면 그만큼 다양한 모양을 만들어 낼수있음.
		//상속 > 자식을 부모에 가지고 와서 오버라이딩  
		
	}

}
