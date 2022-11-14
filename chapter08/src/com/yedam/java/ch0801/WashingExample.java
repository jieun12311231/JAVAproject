package com.yedam.java.ch0801;

public class WashingExample {
	public static void main(String[] args) {
		WashingMachine wm = new LGWashingMachine();
		
		//생성자의 매개변수를 이용한 방법
		washing(new LGWashingMachine())	;  //LG세탁기가 출력됨. 
//		washing(new samsungWashingMachine());  //>>r개발코드르르 수정하지않고 객체 사용가능  
		
		//washing이라는 메소드를 만들고 () 안에 new LGWashingMachine() 이라는 매개변수를 넣으면 
		//WashingMachine에 전달이 돼서 LG의 세탁기가 출력이됨.
		//내가 매개변수에 무엇을 넣냐에 따라서 다양한 세탁기가 만들어짐 >> 다형성 
	}
	
	
	public static void washing(WashingMachine wm) {
		wm.startBtn();
		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
		wm.pauseBtn();
		wm.stopBtn();
		
		//인터페이스는 자기자신이 객체가 될수없음 
		
	}
}
