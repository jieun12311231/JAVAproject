package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	//생성자
		
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(this.gas == 0) {  //this.gas는 메서드이기떄문에 굳이this안붙여줘도 되긴함.
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다."); 
		return true;
	}
	
	///자동차를 가스가 있는 동안 운행하는 메소드
	//if else 로 묶지 않음.
	//>> return이있기떄문에 리턴을 만나면 그냥 바로 메소드 중지이기떄문에 if else로 묶을 필요가 없음.

	void run() { 
		while(true) {
			if(this.isLeftGas()) {  //while문이 계속 돌면서 if문에서 가스가 있는지 확인 
				System.out.println("달립니다.(gas 잔량 :"+this.gas+")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 :"+this.gas+")");
				return;  
			}
				//void타입인데도 return이 영향을 미치지않음>> 메소드를 종료 시키는 역할만함.
//				System.out.println("종료됩니다.");
				//return구문 뒤에있는 명령어는 실행되지않음. >>빨간줄 생기고 오류 발생.
				//어느 위치에 있든 끝임.
		}
	}
//break는 해당 반복문을 멈추게 하는 것이고, 
//return은 해당 메소드를 빠져나오게 하는 것

//외부호출	
	//메소드
//	void setGas(int gas) {
//		this.gas = gas;
//	}
//	boolean isLeftGas() {
//		if(this.gas == 0) {  //this.gas는 메서드이기떄문에 굳이this안붙여줘도 되긴함.
//			System.out.println("gas가 없습니다.");
//			return false;
//		}
//		System.out.println("gas가 있습니다."); 
//		return true;
//	}
//	
//	///자동차를 가스가 있는 동안 운행하는 메소드
//	//if else 로 묶지 않음.
//	//>> return이있기떄문에 리턴을 만나면 그냥 바로 메소드 중지이기떄문에 if else로 묶을 필요가 없음.
//
//	void run() { 
//		while(true) {
//			if(this.gas>0) {
//				System.out.println("달립니다.(gas 잔량 :"+this.gas+")");
//				this.gas--;
//			}else {
//				System.out.println("멈춥니다. (gas 잔량 :"+this.gas+")");
//				return;  
//			}
//				//void타입인데도 return이 영향을 미치지않음>> 메소드를 종료 시키는 역할만함.
////				System.out.println("종료됩니다.");
//				//return구문 뒤에있는 명령어는 실행되지않음. >>빨간줄 생기고 오류 발생.
//				//어느 위치에 있든 끝임.
//		}
//	}




}
