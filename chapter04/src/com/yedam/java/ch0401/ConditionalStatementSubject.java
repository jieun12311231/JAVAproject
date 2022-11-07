package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 1) 두 개의 정수가 주어졌을 때 
		// 두 정수의 합이 자연수 이면 'Nature Number"를 출력하는 코드를 작성하세요.
		System.out.println("----1번 문제----");
		int val1 = 1; //>> int val; val =1;
		int val2 = 2; 
		
		if( val1 + val2 > 0) {
			System.out.println("Nature Number");
		}
		
		//문제2)두 개의 정수가 주어졌을때,두 수의 대소 관계에 따라서 부등호를 출력하는 코드를 작성.(3개의 경우)
		System.out.println("----2번 문제----");
		if(val1 == val2) {
			System.out.println("val1 = val2");
		}else if(val1 > val2) {
			System.out.println("val1 > val2");
		}else {
			System.out.println("val1 < val2");
		}
		
		//문제3) 체질량 지수인 BMI에 따라서 비만도를 네가지 단계로 구분
		// BMI  = 체중(kg) / (키(m) * 키(m))
		// 저체중(18.5 미만), 정상(18.5이상 25미만), 과체중(25이상 30미만) 비만(30이상)
		//switch문은 값이 딱 떨어질때 사용가능함, 범위가 지정되어있으면 if문으로 해야함
		System.out.println("----3번 문제----");
		double kg = 90;   //몸무게도 소수점이 있기때문에 double로 줘야함
		double m = 1.6;
		double bmi = kg /(m*m);
		if (bmi <18.5) {   
			System.out.println("저제중입니다.");
		}else if(bmi <25) { //else if 문이 있으면 범위를 한쪽만 적어줘도 됨!bmi >=18.55 && bmi <25 안적어도 됨.
			System.out.println("정상입니다.");
		}else if(bmi <30) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("비만입니다.");
		}
		
		if (bmi >=30) {
			System.out.println("비만입니다.");
		}else if(bmi >=25) {
			System.out.println("과체중입니다.");
		}else if(bmi >=18.5) {
			System.out.println("정상입니다.");
		}else {
			System.out.println("저제중입니다.");
		}
		//문제 4) switch 선택한 단의 6번째 값을 출력하는 코드 (1단부터 시작)
		// 예를 들어 2단의 경우 2 X 6 = 12
		// 단, 출력문에는 변수 사용하지 않음. 
		System.out.println("----4번 문제----");
//		int val3 = 2;
		
		int val4 = (int)(Math.random()*9)+1;
		System.out.println(val4);
		
//		System.out.println("첫번째 : ");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextLine();
		
		switch(val4) {
		case 1: 
			System.out.printf("%d X 6 = %d\n",1,1*6);
			break;
		case 2: 
			System.out.printf("%d X 6 = %d\n",2,2*6);
			break;
		case 3: 
			System.out.printf("%d X 6 = %d\n",3,3*6);
			break;
		case 4: 
			System.out.printf("%d X 6 = %d\n",4,4*6);
			break;
		case 5: 
			System.out.println("5 X 6 = 30");
			break;
		case 6: 
			System.out.println("6 X 6 = 36");
			break;
		case 7: 
			System.out.println("7 X 6 = 42");
			break;
		case 8: 
			System.out.println("8 X 6 = 48");
			break;
		default:
			System.out.println("9 X 6 = 54");
	
		}
		//문제5)switch(범위) 다음과 같이 점수 범위에 따라 등급을 구분
		//		해당 점수에 대한 등갑을 출력하는 코드
		//90점 이상 100점 이하: A등급  ->90,91,...100
		//80점 이상 90점 미만 : B등급
		//70점 이상 80점 미만 : C등급
		//60점 이상 70점 미만 : D등급
		//60점 미만 : E등급
		System.out.println("----5번 문제----");
		
		int score = 65;
		switch((int)(score/10)) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}
	

}
