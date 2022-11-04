package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {
		//2022년 11월 03일
		/* 변수의 
		 * 사용 범위  */  // 여러 줄 주석처리 /* */
		int value1 = 15;
		
		if(value1>10) {  //value2는 {} 안에서만 유효한 변수
			int value2;
			value2 = value1 - 10;
			
		}
		
		int result = value1 + value2 + 5;   //변수가 지정되지 않았다는 오류발생
		
		System.out.println(value1 +","+ value2+","+result);
		
		int v1 = 0;
		if(v1 == 0) {   //{}안의 범위에 따른 변수의 범위 생각할 수있어야함.
			v1 = 1;
			int v2 = 0;
			if(v2 == 0) {
				v2 = 2;
				int v3= v1+ v2;
				System.out.println(v1 +"+"+ v2+ "="+ v3);
			}
			System.out.println(v1 +"+"+ v2+ "="+ v3);
		}
		System.out.println(v1 +"+"+ v2+ "="+ v3);
		
	}
}
