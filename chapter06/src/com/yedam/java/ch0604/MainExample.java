package com.yedam.java.ch0604;

public class MainExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();  // 리턴되는 것이 없기때문에 변수선언 필요없음.
		
		int sumRes = myCalc.plus(5,6); //매개변수가 두개 선언되어있기떄문에 무조건 두개의 매개변수를 넣어줘야함.//리턴하는 타입이 있기때문에 변수를 생성해줘야함.
		//리턴타입이 있는 매소드는 기본적으로 변수에 담긴하지만 필수는 아니라서 변수선언을 안하더라도 오류발생은 안생김 >>but이런 경우에 결과는 못받고, 내부에서 연산만 하고 끝임
		//리턴하는 타입이 인트이면 인트. float,double로 자동 타입변환이 일어남
		System.out.println("sum : " +sumRes);
		
		byte x = 10;  //범위가 더 좁기떄문에 byte로 넘어오는 값충분히 소화가넝
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println("divide : "+diviRes);
		
		myCalc.powerOff();
		
System.out.println("=== computer ===");		
////////변수를 선언 하는 방법  >>번거로움 한번 실행할떄마다 배열을 만들어줘야함		
		Computer myCom = new Computer();
		int[]values1 = {1,2,3};
		int intResult1 = myCom.sum1(values1);
		//변수를 선언해서 해당개체를 통째로 넘겨줌
		System.out.println("intResult1 : "+intResult1);
////////변수를 선언하지않고 분리해서 하는방법
		
		int intResult2 = myCom.sum1(new int[] {1,2,3,4,5});
		//>>한번만 사용하면 굳이 변수를 선언하지않아도됨
		System.out.println("intResult2 : "+intResult2);
		
////////sum2
		int intResult3 = myCom.sum2(1,2,3);
		//값을 주면 알아서 배열로 처리해줌.
		System.out.println("intResult3 : "+intResult3);

		int intResult4 = myCom.sum2(1,2,3,4,5);
		System.out.println("intResult4 : "+intResult4);
		
System.out.println("=== 내부선언 계산기 평균 ===");		
////// 내부에서 선언해서 사용하는 방식////////
		myCalc.execute();
		
System.out.println("=== 사각형 넓이 구하기 ===");				
////사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);  // >> 같은 매서드를 사용하지만 정사각형 넓이
		double result2 = myCalc.areaRectangle(10, 20);  //>> 직삭각형 넓이
		//동일한 메서드를 호출한다고 느낄수있지만 아님!!
		
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);
	}

}
