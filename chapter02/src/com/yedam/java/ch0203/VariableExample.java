package com.yedam.java.ch0203;

public class VariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////////자동 타입 변환
		byte byteValue = 10;
//		char charValut = byteValue;
		//byte는 char타입으로 변환 안됨.
		int intValue = byteValue;
		System.out.println("intValue :" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue :"+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue :"+ intValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue :"+ doubleValue);
		///값의 손실이 일어나지 않음!!!
		
/////////강제 타입변환
		intValue = 44032;
		charValue = (char) intValue;  // 실질적으로 data손실은 일어나지 않음.
		System.out.println(charValue);  //  >> 가 출력됨
		
		longValue = 500;
		intValue = (int) longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);   
		//>>결과 값이 3.14에서 3으로 바뀜  >> 소수점 값은 손실이 됨.
		//실수에서 정수로 값을 변환할때 주의 해야함.
		
		
////////정수 타입 연산
		byte result = 10+20; //리터럴 끼리는 연산처리 가능>>30으로 출력
		byte x = 10;
		byte y = 20;
//		byte result2 = x + y;  
		int result2 = x + y;
		byte result3 = (byte)(x+y);  //강제로 byte타입으로 변환>> 잘 안쓰이는 방법
		//변수끼리는 연산처리 안됨. 문법적 에러 
		// 한줄 한줄 컴파일하면서 문법적 검사를 진행 하기떄문에 에러로 인식해 빨간줄 생김
		//x,y가 뭔지 인식 못함
		System.out.println(result2+","+result3);
		
		char charValue1 = 'A';   // A- 유니코드 65
		char charValue2 = 1;
		int intResult = charValue1 +charValue2;
		System.out.println("유니코드 :"+intResult);
		System.out.println("출력문자 :"+(char)intResult);
		//문자도 유니코드 내의 문자일 경우는 연산이 가능하게 됨.
		//int보다 낮은 값은 int로 출력

		byte value1 = 10;
		int value2 = 100;
		long value3 = 100L;
		long longResult = value1 + value2 + value3;
		System.out.println(longResult);
		//long이 하나라도 있으면 long으로 출력 
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1; 
		//int plusV1 = intV1 + doubleV1; 는 오류 생김
		System.out.println(plusV1);
		//double이 하나라도 있으면 double로 출력
		
		int intVar1 = 10;
		
//		int resultVar1 = intVar1/4;
//		System.out.println("10/4의 결과 : " + resultVar1);
		//double을 int로 담게 되면 소수점이 사라짐
		//결과 2 
		
//		double resultVar1 = intVar1/4;
//		System.out.println("10/4의 결과 : " + resultVar1);
		//결과 2.0
		//intVar1인 10이 정수이기때문에 결과는 무조건 정수로 나오게 되어있음
		// 타입을 double로 하더라도 .0 만 생김
		
		System.out.println("10/4의 결과 : " +(intVar1/4));
		//result : 2
		
		double resultVar1 = intVar1/4.0;
		System.out.println(resultVar1);
		//result : 2.5
		//>> ⭐⭐⭐⭐ 붙는 타입이랑은 크게 상관없이 값에 들어가는 타입이 무엇인지가 중요함.
		//>> 소수점을 결과로 받고 싶으면 계산할때부터 double로 값을 주면 됨.
		
		int x1= 1;
		int y1 = 2;
		double result1 = x1/y1;
		System.out.println("1/2의 결과 :" + result1);
		//result : 0.0
		
		int x2=  1;
		int y2 = 2;
		double result10 = (double)x1/y1;
		System.out.println("1/2의 결과 :" + result10);
		//result : 0.5  >>연산하려하는 값(피연산자) 중에 하나를 (double)로 바꿔서 출력하면 
		//소수값으로 출력이 가능

////////+연산에서의 문자열 자동타입변환 p.82
		int value = 10+2+8;
		System.out.println(value);
		//result 20
		
//		String str1 = 10+2+8;
//		System.out.println(str1);  //>>에러
		
		String str2 = 10+2+"8";
		System.out.println(str2);
		//>> 128  "12" +"8"
		String str3 = 10+"2"+8;
		System.out.println(str3);
		//1028  "102"+"8" >> "1028"
		String str4 = "10"+2+8;
		System.out.println(str4);
		//1028  "102"+8 >"102" +"8"
		
		String str5 = "10"+(2+8);
		System.out.println(str5);
		//1010 "10"+10

////////기본 타입 <->String
//		int aVar = Integer.parseInt("10");
//		double bVar = Double.parseDouble("a101.0");
//		boolean cVar = Boolean.parseBoolean("5");
//		System.out.println("a :"+ aVar);
//		System.out.println("b :"+ bVar);
//		System.out.println("c :"+ cVar);
		//세가지는 컴파일 할떄는 오류 x 실행하면 오류 발생
		
		int aVar = Integer.parseInt("10");
		//parse를 이용하면 문자열을 기본 타입으로 변환 가능
		double bVar = Double.parseDouble("101.0");
		//
		boolean cVar = Boolean.parseBoolean("true");
		System.out.println("a :"+ aVar);
		System.out.println("b :"+ bVar);
		System.out.println("c :"+ cVar);
		
		//<정석>
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		///문자열로 변환됨!! >> console창에서는 티가 나지않음.
		
		//<편법> 숫자 앞에 문자열로 공백을 넣으면 비슷한 효과를 낼 수 있음
		//문자열로 출력되는데는 문제가 없음
		String strV4= ""+105.23;
		System.out.println(strV4);
		
	}

}
