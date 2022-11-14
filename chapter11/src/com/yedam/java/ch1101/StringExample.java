package com.yedam.java.ch1101;

import java.io.UnsupportedEncodingException;

public class StringExample {
	public static void main(String[] args) {

		// String에 대하여

		// String a = "1"; //100번지
		// Stirng c = "1"; //100번지 a,c는 같은 주소에서 같은 값을 가지고있음
		// String b = new Sting("1"); //200번지 >>> new연산자를 통해서 객체를 만들면 다른 주소의 데이터를 가지게 됨.
		// new연산자 없으면 같은 주소 공유
		//
		// 바이트 -> 문자열 변환
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);

		// String str2 = new String(bytes배열,시작점,출력할 개수); 0번째부터가 시작임~!
		String str2 = new String(bytes, 6, 4); // 6번째부터 4개 가지고 와라
		System.out.println(str2);

		// String 메소드
		// 1) charAt(int index) : 특정 문!자!의 위치를 반환해줌. >>문자열이 아니기때문에 하나만 가넝
		String ssn = "123456-2876541"; // 0부터 카운트시작
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 2) 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";

		// 주소를 비교 ==
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 잠초");
		}

		// 값을 비교 .equals
		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}

		//3) 바이트 배열로 변환하기 >> 한글자씩 쪼개기
		byte[] bytes2 = null; // str을 쪼개서 글자를 담을 배열
		String str = "안녕하세요";
		bytes2 = str.getBytes();
		System.out.println(bytes2.length); // 한글은 한글자에 3byte >>15출력

		// 쪼개놓은 안녕하세요 다시 뭉쳐서 안녕하세요로 출력
		String str3 = new String(bytes2);
		System.out.println("byte2 -> String " + str3);

		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length " + bytes3.length);

			// 쪼갠거 다시 복구
			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("byte3 -> String " + str4);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} // try catch는 오류 날까봐 넣은 것 안에 있는 내용만 보면됨.

		// 인코딩 : 스트링 > 바이트 >>쪼갬
		// 디코딩 : 바이트 > 스트링 >>압축
		
		
		//4)문자열! 찾기
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
		
		index = subject.indexOf("a");
		System.out.println(index);      ///없는 문자열이면 -1 이 반환됨
		
		//5)문자열의 문자 개수	
		System.out.println(subject.length());
		
		//6)문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		//자바 프로그래밍가 Java 프로그래밍으로 바뀐것이 아니고
		//자바 프로그래밍은 그대로 남아있고 Java 프로그래밍이라는 데이터가 새로 만들어진것
		//
		System.out.println(newStr);
		
		//책에 없는 내용//
		
		//oldStr = "자바"; 100번지 
		//oldStr += "프로그래밍";  200번지 
		//oldStr += "재밌다";  300번지 
		//내용이 지워지는 것이 아니고 새로운 데이터가 새로 만들어지는 것!
		
		
		//butter는 임시저장소라고 생가하면됨. 임시 저장소에 담기때문에 메모리를 잡아먹지않ㅇ,ㅁ
		//StringBuilder 또는 buffer
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		sb.append("자바");   //>>500번지 같은 임시 저장소!!!!
		sb.append("프로그래밍");  //500번지 
		sb.append(123);   //500번지 
		
		sb2.append("박박");
		sb2.append("디라라");
		
	
		System.out.println(sb);
		System.out.println(sb2);
		
		
		//대소문자 바꾸기 
		String strVal = "dfsffgdfgdfgsfdsfdgsdfg";
		String strVal2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		
		//trim() 공백지우기
		String strTrim = "            자바                 ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		//substring() 문자열 짤라내기
		//index부터 end앞자리 까지 자르기   >>5자리 까지 자르고 싶으면(0,6)  5+1
		//substring(index,end)
		
		//index부터 뒤에 다 날려버림.
		//substring(index)
		
		String ssn2 = "880815-1234567";
		String firstNum = ssn2.substring(0,6);
		
		String secondNum = ssn2.substring(7);  //7번째 자리부터 출력
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//split()  --구분자를 가지고 쪼갤수있음 / 정규표현식(?)
		String strSplit = "1-1-1-1-1-2-3-5-6-6-9";
		String[] strAry = strSplit.split("-");
		for(String temp: strAry ) {  //향상된 for문 
			System.out.println(temp);
		}
		//strAry 첫번째 배열을 temp에 넣어서 출력
		//배열에 값이 없을때까지 for문이 돌아감.
		
		//문자열 변환 -숫자, 소수, 불리언 -> String 으로 변환
		//valueOf()
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		//>> valueOf에 들어가있는 내용이 String으로 변환한것!
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
		
		
		

	}
}
