package com.yedam.java.ch1101;

public class StringString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1)문자열 뒤집기  charAt / for
//- 입력되는 문자열을 뒤집어서 출력
//ex) input : abc  ouput : cba
//2) 문자 개수 세기 문자의 범위를 생각해서 if문 만들기 
//-아스키 코드 이용
//- 입력되는 문자열에서 알파벡과 숫자의 갯수를 구하기
//ex) 1a2x4b -> 숫자 3개, 영어 3개
//* 추가 문제 
//3) 거꾸로 읽어도 같은 문자인지 확인
//aba

//1)  input : abc  ouput : cba
//		byte[] bytes1 = null;
//		String str1 = "abc";
//		bytes1 = str1.getBytes();
//		
//		for( int i = 3; i<str1.length();i--) {
//			String str2 = new String();
//			System.out.println(str2);
//		}
		String str1 = "abc";
		for (int i = str1.length() - 1; i >= 0; i--) {
//			char chch = str1.charAt(i);
			System.out.print(str1.charAt(i));
		}
		System.out.println();
////2) 문자 개수 세기 문자의 범위를 생각해서 if문 만들기 
		// -아스키 코드 이용
		// - 입력되는 문자열에서 알파벡과 숫자의 갯수를 구하기
		// ex) 1a2v4b -> 숫자 3개, 영어 3개
		// 1=49 2=50 4=52 >>숫자 49~52
		// 알파벳 97~122
//		String str2 = "1a2x4b";
//		String[] strAry = str2.split("");
//		for(int i = 0;i<strAry.length;i++) {
//			System.out.println(strAry[i]);
//			
//		}
		int countNum = 0;
		int countal = 0;
		byte[] bytes1 = null;
		String str2 = "1a2x4b";

		bytes1 = str2.getBytes();
		for (int i = 0; i < bytes1.length; i++) {
			if (bytes1[i] >= 49 && bytes1[i] <= 52) {
				countNum += 1;
			} else if (bytes1[i] >= 97 && bytes1[i] <= 122) {
				countal += 1;

			}
		}
		System.out.println(countNum);
		System.out.println(countal);

		
		
//		3) 입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
//		- 조건 -  //2022 -"951231" = 26
//		금년 기준으로 100년이 넘어간 경우는 제외 한다. 또한 생일은 신경쓰지 않는다.
//		(221114 -> 1922년 11월 14일 X , 2022년 11월 14일 O)
//		ex) input : 000510, output : 21살	

		String str3 = "20000510";
		int year = Integer.parseInt(str3.substring(0, 4));
		int moth = Integer.parseInt(str3.substring(4, 6));
		int day = Integer.parseInt(str3.substring(6, 8));

		// 오늘
		String str4 = "20221114";
		int year2 = Integer.parseInt(str4.substring(0, 4));
		int moth2 = Integer.parseInt(str4.substring(4, 6));
		int day2 = Integer.parseInt(str4.substring(6, 8));

		int age = ((year2 +1900) - (year+1900)) - 1;
		System.out.println(age + "살");

	}

}
