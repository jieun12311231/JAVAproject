package com.yedam.java.ch0202;

public class VariableExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//같은 패키지 안에서는 동일한 이름의 클래스 생성 x
		// 패키지가 다르면 동일한 이름 가능
		
		//byte타입 
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 127;
		//byte var4 = 128;  // -128~127오류발생 Type mismatch: cannot convert from double to byte
//		byte var5 = 100.0; // 정수형이기때문에 오류 실수형이 들어가면 오류발생- Type mismatch
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3);
//		System.out.println(var5);
		
		long var6 = 10000000000000L;  //자바에서 정수는 무조건 int라고 인식하기로 정해놓음
		// var6의 값을 먼저 인지하는데 int로 먼저 인식하고 오류를 출력해버림 
		//정수의 값이 아닌 리터럴에 대해서 L을 붙여주면 정수형이 아닌것으로 제대로 인식을 함.
		long var7 = 100000; //int 허용 범위 안에 있기때문에 오류 출력 x 굳이 L를 붙이지 않아도 됨.
		//접시에 물담기로 생각하면됨. int범위에도 있지만 타입만 long으로 저장이 됨.
		//short는 허용범위가 작아서 잘 사용 하지않고 , int가 주로 사용 됨.
		
		//char 타입

		char v1 = 'A';  //char은 원래는 정수형이지만 문자형식도 입력가능 
		char v2 = '가'; //문장은 안되고 한 글자만 담을 수 있음.
		int v3 = v1;  //또다른 정수타입의 값을 옮길수도 있음.but 유니코드 상에 숫자 
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
		
		// String
		String name = "김지은";  //" " 에 싸여져 있는 것은 문자열 리터럴
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));   
		//index기능으로 생각하면 됨. 0부터 시작됨.
		//char VS String
//		char v4 = "A";   //''이 아닌 ""으로 적으면 string으로 인지하기떄문데 오류
//		char v5 = 'AB';  //두 글자 안됨.
//		char v4 = ''; //공백 안됨 >>무조건 유니코드에 있는 문자만 인식가능
		String v5 = ""; // 공백가능 ,제한 없음, 특수 문자도 가능  
//		String v6 = "A"// 한글자도 가능
//		String v7 = '';//"" 대신 '' 안됨.//무슨 문자나 기호가 들어가든 ""만 넣어주면 됨.
		
//		String num = "12345";
//		System.out.println(num);
		
		String str1 = "누군가 \"안녕\"하면서 인사했다."; 
		// ""을 내부 값으로 쓰고 싶으면 \" \" 넣어주면 됨. >>이스케이프 문자
		
		//실수형 float, double ⭐⭐정밀도의 차이a
		float num1 = 3.14F;  
		//3.14 뒤에 F꼭 붙여줘야함. float가 인지 할 수 있는 값이더라도 F를 붙여주지않으면 인식x
		double num2 = 3.14;
		float varF = 0.1234567890123456789F;
		//0.12345679  소수점 7자리까지 출력 >반올림해서 출력됨 
		double varD = 0.1234567890123456789; 
		//0.12345678901234568 소수점 15자리까지 출력
		//float, double에 똑같은 수를 쓰더라도 표기법이 다름
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		
//		boolean stop = false;
		boolean stop = (1>2);//표현식 :연산자를 기반으로해서 결과를 도출할수 있는 식
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
	}

}
