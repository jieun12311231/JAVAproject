package com.yedam.java.ch01;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
		   출력예시) "변수명1: 변수값, 변수명2: 변수값" */
		
		int x = 37;
		int y = 91;
		System.out.println("====1번 문제====");
		System.out.println("x: " + x +", "+ "y: " + y);
		
		
		/* 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		   2.1) 91 더하기 37
		   2.2) 91 빼기 37
		   2.3) 91 곱하기 37
		   2.4) 91 나누기 37 */
		int sum = y + x;
		int min = y - x;
		int mul = y * x;
		double div = (double)y / x;
		int div2 = y/x;
		System.out.println("====2번 문제====");
		System.out.println("91 + 37 = "+ sum);
		System.out.println("91 - 37 = "+ min);
		System.out.println("91 * 37 = "+ mul);
		System.out.println("91 / 37 = "+ div);
		System.out.println("91 / 37 = "+ div2);  //int 값으로 출력
		
		/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
	    출력예시) int a = 10; 의 경우 "10, int"로 출력. */
		System.out.println("====3번 문제====");
//		byte var1 = 128;
		int var1 = 128;
		System.out.printf("%d, int\n", var1);
		
//		char var2 = "B";
		String var2 = "B";
		System.out.printf("%s, String\n",var2);
		
//		String var3 = 44032;
		int var3 = 440032;
		System.out.printf("%d, int\n",var3);
		
		
//		int var4 = 100000000000;
		long var4 = 100000000000L;
		System.out.printf("%d, long\n",var4);
		
		
//		float var5 = 43.93106;
		float var5 = 43.93106F;
		double var55 = 43.93106;
		System.out.printf("%8.5f, float\n",var5);
		System.out.printf("%8.5f, double\n",var55);
		
//		long var6 = 301.3;
		float var6 = 301.3F;
		double var66 = 301.3;
		System.out.printf("%5.1f, float\n",var6);
		System.out.printf("%5.1f, double\n",var66);
				
		
		// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
		System.out.println("====4번 문제====");
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		long result1 = a + c + d;
		System.out.println(result1);
		
		int result2 = a + b + c;
		System.out.println(result2);


		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);	
		
		/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된대로 출력하세요.
	    출력예시) A278번지10.0 */
		System.out.println("====5번 문제====");
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
				
		//A 24+3  8 번지 실수10
		System.out.printf("%s%s%d%s%.1f\n",charValue,intValue1+intValue2,intValue3,strValue,(double)intValue4);
		System.out.printf("%s%s%d%s%.1f\n",charValue,intValue1+intValue2,intValue3,strValue,(float)intValue4);
		
		
		//????????????????????????//
		/* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	    예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
	    힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		System.out.println("====추가 문제====");
		int value = 485;
//		//4 + 8 + 5 =17
		
		System.out.println((value%10)+((value/100)%10)+((int)value/100));

		
		
		
	}

}
