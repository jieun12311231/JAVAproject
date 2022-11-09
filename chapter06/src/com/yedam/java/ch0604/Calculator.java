package com.yedam.java.ch0604;

public class Calculator {  //계산기 만들기
/////1.전원켜기
	void powerOn() {
		//매개변수도 필요없음 
		System.out.println("전원을 켭니다.");
	}
//////2.더하기, 나누기
	int plus(int x, int y){
		int result  = x + y;
		return result;//타입이 맞지않으면 return되지않음.
		//리턴 변수가 무엇인지에 따라서 리턴할수있는 값이 달라짐.
	}
	double divide(int x, int y){  //매개변수는 가능한 최대 3개정도까지만 사용하는것이 좋음.//매개변수를 굳이 늘리지않고 클래스를 사용하면됨 >> 겉으로는 매개변수가 3개뿐일지라도 내부에는 많은 값이 담김
		double result = (double)x / y;  //둘다 실수로 처리 하든동 둘 중하나는 실수로 처리
		return result;
	}
	
////3.전원끄기	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
////내부에서 선언////
////평균 구하기   >>기존 메서드를 호출 하는 형식으로 사용하면 됨.
	//메서드는 각각이 최소의 단위로 구성되어야함.
	//>> 필요한 곳에서 메소드를 호출할 수 있어야함.
	double avg(int x, int y){
		//더하는 식을 직접 적지않고 위에있는 식을 불러오는 것
		int sum = plus(x,y);
		double result = sum /2.0;
		return result;
	}
	
	void execute() {
		double result =avg(7,10);
		println("실행결과 : "+result);
	}
	void println(String message) {
		System.out.println(message);
	}
	
	/////사각형의 넓이 구하기 교재 265 메서드 오버로딩
	double areaRectangle(double width) {
		return width * width; //간단한 연산은 return 구문에 바로 넣어줘도됨/
	}
	double areaRectangle(double width,double height) {  //매소드 이름은 같고 변수의 이름은 달라야함
		return width * height;
	}
	
	
}
