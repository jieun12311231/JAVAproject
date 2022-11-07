package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////////모니터로 변수값 출력하기 p90
//		
//		int value = 123;
//		System.out.printf("상품의 가격:%d원\n",value);
//		System.out.printf("상품의 가격:%6d원\n",value);  //왼쪽 공백
//		System.out.printf("상품의 가격:%-6d원\n",value); //오른쪽 공백
//		System.out.printf("상품의 가격:%06d원\n",value);
//		//적절한 위치에 \n넣어 줘야 줄바꿈이 됨.
//		
//		double area = 3.14159 *10*10;
//		System.out.println(area);
//		System.out.printf("%s이 %d인 원의 넓이:%10.2f\n","반지름",10,area);
//		//%s에는 문자열 "반지름" %d에는 정수 10이 들어가고, %10.2f자리에 변수가 들어감 
//		//%10.2f - 10자리가 들어가고 소수점 2자리 출력 왼쪽 자리에 공백
//		
		//p92 키코드
		Scanner sc = new Scanner(System.in);
		//shift +ctrl+ space + o 눌러서 java scanner로 등록해줘야함
		
//		String str = sc.nextLine();
//		System.out.println("입력 :"+str);
		//Scanner를 통해 nextLine()을쓰면 입력 가능
		//nextLine()은 무조건 단독으로만 사용가능
		//nectInt()등등을 같이 쓰면 오류
		//nextLine()은 엔터까지 읽어들임.
		//nextLine()은 메모리상 엔터가 있는지 읽음
		
//		String str1 = sc.next();
//		int var = sc.nextInt();
//		System.out.println("입력 :"+str1+","+var);
		//today 951 입력후 엔터 누르면 입력 :today,951 이라고 뜸
		//nextInt()는 엔터를 읽지 못함.
		//today값 출력 , 951 값 출력
		//한줄을 통해 두가지의 값을 받기 위해서는 next()를 사용해야함.
		
//		System.out.println("첫번째 : ");
//		String x = sc.nextLine();
//		System.out.println("두번째 : ");
//		String y = sc.nextLine();
//		int result = Integer.parseInt(x)+Integer.parseInt(y);
//		System.out.println("결과:"+result);
		//한줄한줄 입력 해야함
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("결과 : "+(x+y));
		//값 사이에 반드시 공백 넣어야함
		
		String inputData;
		while(true) {  //nextLine()은 한번만 출력하기때문데 반복문을 통해 계속 입력할 수 있도록 유도 
			inputData = sc.nextLine();  
			System.out.printf("입력된 문자열 : %s\n",inputData);
			if(inputData.equals("얍")) {    //equals는 매개변수로 들어온 것이 exit인지 확인
				break;
			}
		}
		System.out.println("종료");
		
		//git관련 작업 추가 
	}

}
