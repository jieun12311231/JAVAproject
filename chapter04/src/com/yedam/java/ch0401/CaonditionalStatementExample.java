package com.yedam.java.ch0401;

public class CaonditionalStatementExample {

	public static void main(String[] args) {  //순수 자바 프로젝트의 시작//메인이 여러가지면 선택해야함
		// TODO Auto-generated method stub
/////////기본 IF문
		System.out.println("----IF문----");
		int score = 90;
		if(score >=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 'A'입니다.");   //true일 경우 if문안은 다 출력
		}
		System.out.println("if문 상관없이 실행됩니다.");  //if문이 실행되면 무조건 실행되어서 출력됨.
		
		if(score <90)   //중괄호가 생략이 허용이 되긴하지만 바로 다음 줄만 인식이 됨 .
			//두번째 줄은 종속된 것처럼 보이지만 if절로 인식되지않음.그냥 출력이 됨 >> 무조건 중괄호로 묶기
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 'B'입니다.");   //if문의 참,거짓 여부와상관없이 그냥 출력이 됨  
			
/////////IF~ELSE문
		System.out.println("----IF~ELSE문----");
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 'A'입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 'B'입니다.");
		}System.out.println("if문 상관없이 실행됩니다.");
		
/////////IF~ELSE IF~ELSE문 //제일 많이 사용, 점수에따라 등급나누기, 원래는 중첩으로 표현 가능하긴함 //조건주기 중요
		//조건이 순차적으로 정렬되어있는지 확인!!!!!조건 주기 중요함
		System.out.println("----IF~ELSE IF~ELSE문----");
		if(score >=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다");
		}else if(score >=80) {  //score <90 && score>=80
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B입니다");
		}else if(score >=70) { //score <80 && score>=70
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C입니다");
		}else { //score <70
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다");
		}
		System.out.println("⭐⭐⭐⭐랜덤값 찾기⭐⭐⭐⭐");
		
		//⭐⭐⭐⭐⭐⭐⭐⭐반드시알기p139 랜덤값을 가지고 오기//방법 알고있어야함 로또에도 사용⭐⭐⭐⭐⭐⭐⭐⭐
		//1)0.0<= Math.random() <1.0 //값이 실수
		
		//2)주사위 값은 실수이기때문에 실수로 만들어줘야함 
		//0.0*10 <= Math.random() *10  <1.0*10  >>>>>  0<x<10 값은 비슷하지만 소수점은 떨어져나감
		
		//3)어쨋든 아직 소수점이 나오는 범위이기때문에 정수형으로 만들어줌
		//(int) 0<= (int)(Math.random()*10) <(int)10
		
		//4)(int)0+1<=(int)(Math.random()*10+1)<(int)10+1
		
		//5)1,2,3,4,5,6,7,8,9,10
		
		//=> ⭐⭐⭐⭐⭐⭐ (int)(Math.random() *count) + start  ⭐⭐⭐⭐⭐⭐
			//카운트(가지고오는 개수)할 값을 곱하고 시작할 값을 더해줘야 함
		
		int num = (int)(Math.random()*6)+1;
		if(num == 1 ) {
			System.out.println("1번이 나왔습니다");
		}else if(num == 2 ) {
			System.out.println("2번이 나왔습니다");
		}else if(num == 3 ) {
			System.out.println("3번이 나왔습니다");
		}else if(num == 4 ) {
			System.out.println("4번이 나왔습니다");
		}else if(num == 5 ) {
			System.out.println("5번이 나왔습니다");
		}else if(num == 6 ) {
			System.out.println("6번이 나왔습니다");
		}
		
/////////switch문  //변수의 값이 무엇인지에따라서 실행이 나뉨/ 조금 더 직관적으로 표시 됨
		System.out.println("----switch문----");
		num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1:  //num값이 1일때
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		default :
			System.out.println("6번이 나왔습니다");
		}
		
		//break가 중요함 없어도 되고 없어도 실행은 가능함 ,
		//but 없으면 그 다음을 연속적으로 다 출력함
		//break가 반드시 있다고 생각하면 됨.defualt를 제외한 case에는 break있어야함.
		//default는 그 외의 모든 상황을 일컫는 것이기때문에 break없음
		//break문이 없는 case
		System.out.println("----break문이 없는 switch문----");
		int time = (int)(Math.random()*4)+8;
		System.out.println("[현재 시각:"+time+"시]");
		switch(time) {
		case 8:
			System.out.println("출근합니다");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근을 나갑니다");
			
		}
		
		//char 타입의 switch문 >> 일부러 break를 뺌 (대,소문자 때문에 )
		//쇼핑몰 : 고객을 구분해서 관리 우수회원 - A/ 일반 회원 - B/ 둘다 아니면 - 손님
		//하나의 if문에는 하나의 조건문만들어감 > 총 3개의 if와 if else가 필요함 대소문자 구분이 필요하기 때문
		//개발자는 a,A 둘중에 하나만 입력해도  우수회원으로 인지 되도록 만들어야함.
		System.out.println("----일부러 break 생략한 switch문----");
		char grade = 'B';
		switch(grade) {
		case 'A':	//자바가 인식할때는 두가지의 값이지만 실제로는 하나의 값이면 일부러 break생략해서 쓸수도있음
		case 'a':  //일부러 break문을 빼서 두가지 경우를 한번에 출력할수 있도록도 할 수 있음. 
			System.out.println("우수 회원입니다.");
			break; 
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
		
		//String 타입의 switch문
		System.out.println("----String 타입의 switch문----");
		
		String position = "과장";
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case"과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
	}

}
