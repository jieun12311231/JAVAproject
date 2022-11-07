package com.yedam.java.ch01;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println("입력 : "+str);

//		String str1 = sc.next();
//		int var = sc.nextInt();
//		System.out.println("입력 : "+str1 + ","+var);

//		System.out.println("첫번째 : ");
//		String x = sc.nextLine();
//		System.out.println("두번째 : ");
//		String y = sc.nextLine();
//		int result = Integer.parseInt(x)+ Integer.parseInt(y);
//		System.out.println("결과 :"+result);

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		System.out.println("결과 : "+(x+y));

//		String inputData;
//		while(true) {
//			inputData = sc.nextLine();
//			System.out.printf("입력된 문자열 : %s \n",inputData);
//			if(inputData.equals("얍")) {
//				break;
//			}
//		}
//		System.out.println("종료");
//		int charCode ='A';
//		System.out.println(charCode);
//		
//		int score  = 85;
//		char grade = (score>90)? 'A':'B';
//		System.out.printf("성적은 %d점이고, 등급은 %s입니다.\n",score, grade);
//		
//		int age = 17;
//		String message = (age>19)? "성인":"미성년자";
//		System.out.printf("나이는 %d살이고, %s입니다. \n",age,message);
//		
//		System.out.println("----자동타입변환----");
//		byte byteValue = 10;
//		int intValue = byteValue;
//		System.out.println(intValue);
//		
//		char charValue = '가';
//		intValue = charValue;
//		System.out.println(intValue);
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println(longValue);
//		
//		longValue = 100;
//		float floatValue = longValue;
//		System.out.println(floatValue);

//		System.out.println("----강제타입변환----");
//		int intValue1 = 10;
//		byte byteValue1 =  (byte)intValue1;
//		System.out.println(byteValue1);
//		
//		int intValue = 65;
//		char charValue = (char)intValue;
//		System.out.println(charValue);

//		int intValue = 10;
//		double doubleValue = 5.5;
//		int result = intValue +(int)doubleValue;
//		System.out.println(result);

//		int x = 1;
//		int y = 2;
//		double result = x / (double)y;
//		System.out.println(result);

//		char charValue1 = 'A';
//		char charValue2 = 1;
//		int intValue = charValue1 + charValue2;
//		System.out.printf("유니코드 %d \n",intValue);
//		System.out.printf("출력문자 %s \n",(char)intValue);

//		int intValue = 10;
//		double doubleValue = intValue/4.0;
//		System.out.println(doubleValue);

		// 1~10까지출력
//		for(int i=1;i<=10;i++) {
//			
//			System.out.println(i);
//		}

		// 1~100까지 합 출력
//		int sum = 0;
//		for (int i = 1;i<=100;i++) {
//			sum += i ;
//			
//		}System.out.printf("1부터 100까지의 합은 %d입니다.\n",sum);

		// 구구단 출력//
//		for(int i =2;i<=9;i++) {
//			System.out.printf("=== %d단 ===\n",i);
//			for(int j =1;j<=9;j++ ) {
//				System.out.printf("%d X %d = %d\n",i,j,i*j);
//			}
//		}

		// 문제 1) 두 개의 정수가 주어졌을 때
		// 두 정수의 합이 자연수 이면 'Nature Number"를 출력하는 코드를 작성하세요.
//		int x = 1;
//		int y = 2;
//		if (x +y >0) {
//			System.out.println("Nature Number");
//		}
//		//문제2)두 개의 정수가 주어졌을때,두 수의 대소 관계에 따라서 부등호를 출력하는 코드를 작성.(3개의 경우)
//		int val1 =1;
//		int val2 = 2;
//		if(val1 == val2) {
//			System.out.println("val1 = val2 ");
//		}else if(val1 > val2 ) {
//			System.out.println("val1>val2");
//		}else {
//			System.out.println("val1<vla2");
//		}
		// 문제3) 체질량 지수인 BMI에 따라서 비만도를 네가지 단계로 구분
		// BMI = 체중(kg) / (키(m) * 키(m))
		// 저체중(18.5 미만), 정상(18.5이상 25미만), 과체중(25이상 30미만) 비만(30이상)
//		double kg = 80;
//		double m = 1.6;
//		double bmi = kg/(m*m);
//		if(bmi<18.5) {
//			System.out.println("저");
//		}else if(bmi<25) {
//			System.out.println("정");
//		}else if (bmi<30) {
//			System.out.println("과");
//		}else {
//			System.out.println("비");
//		}
		// 문제 4) switch 선택한 단의 6번째 값을 출력하는 코드 (1단부터 시작)
		// 예를 들어 2단의 경우 2 X 6 = 12
		// 단, 출력문에는 변수 사용하지 않음.
//		int num = (int)(Math.random()*9)+1;
//		System.out.println(num);
//		switch (num) {
//		case 1: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 2: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 3: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 4: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 5: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 6: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 7: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 8: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		case 9: 
//			System.out.printf("%d X 6 = %d\n",num,num*6);
//			break;
//		
//		}

		// 1~10
//		int count = 1;
//		while(count<=10) {
//			System.out.println(count);
//			count++;
//		}

//		int count =0;
//		while(count <=9) {
//			count++;
//			System.out.println(count);
//		}
//		// 1~100까지 출력, 1~100까지 합을 출력
//		count = 1;
//		int sum = 0;
//		while(count<=100) {
//			System.out.println(count);
//			sum += count;
//			count++;
//		}System.out.println(sum);

		// 주사위 두개를 굴림. 합이 3이 되는 경우가 나올 때까지 굴리는 경우.

//		int num1 =0;
//		int num2=0;
//		
//		while(num1 + num2 !=3) {
//			num1 = (int) (Math.random() * 6) + 1;
//			num2 = (int) (Math.random() * 6) + 1;
//			System.out.printf("%d,%d의 합은 3입니다.\n",num1,num2);
//				
//		}
//		int index = 1;
//		while (index != 1) {
//			System.out.println("반복문 실행");
//		}
//		
//		do {
//			System.out.println("반복문 실행");
//		}while(index!=1);
//		
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			System.out.println(num);
//			if(num ==6) {
//				break;
//			}
//		}
//		while (true) {
//			int num1 = (int)(Math.random()*6)+1;
//			int num2 = (int)(Math.random()*6)+1;
//			System.out.printf("%d,%d\n",num1,num2);
//			if(num1 + num2 == 3) {
//				System.out.println("합이 3입니다.");
//				break;
//			}
//		}
//		
//		Outter:for(char upper ='A';upper<='Z';upper++) {
//			for(char lower ='a';lower <='z';lower++) {
//				System.out.println(upper+","+lower);
//				if(lower =='g') {
//					break Outter;
//				}
//			}
//		}
		// continue이용한 for문
		// 1~10까지 짝수가 아닌수 출력
//		for(int i = 1;i<=10;i++) {
//			if(i%2 ==0) continue;
//			System.out.println(i);
//		}
//		
//		for(int j =1;j<=10;j++) {
//			if(j%2 != 0) {
//				System.out.println(j);
//			}
//		}
//		
		// 문제1) 교재 161 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
//		String str ="";
//		for(int i =1;i<=5;i++) {
//			str+="*";
//			System.out.println(str);
//		}
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 문제2) for문을 이용해서 1~100까지의 정수 중에서
		// 2의 배수가 아닌 숫자의 개수를 구해시오. >>홀수
//		int count = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				count+=1;
//				System.out.println(i);
//			}
//		}
//		System.out.println(count+"개");
//		int count= 0;
//		for(int i = 1;i<=100;i++) {
//			if(i%2 ==0)continue;
//			count+=1;
//			System.out.println(i);
//		}
//		System.out.println(count);
// 문제3) p161 4번
		// 중첩 for문을 이용하여 4x+5y=60의 해 중에서 첫번째로 구해지는 값을(x,y)형태로출력하세요
		// x,y는 10이하의 자연수
		// 1)중첩 for문 2) x,y는 1~10까지 정수
//		Outter:for(int x=1;x<=10;x++) {
//			for(int y=1;y<=10;y++){
//				if((4*x)+(5*y)==60) {
//					System.out.printf("(%d,%d)\n",x,y);
//					break Outter;
//				}
//			}
//		}
//		
// 문제4)do~while 문과 Math.random()함수를 이용
		// 1~10의 정수 중 7이라는 수가 나올때까지 숫자를 출력
//		int num =0;
//		do {
//			num = (int)(Math.random()*10)+1;
//			System.out.println(num);
//		}while(num!=7);

// 문제5) 161 3번  //방정식의 연장선으로 생각하면됨.
		// 내가 반복해야하는게 무엇인지 잘 생각해보기 >> 반복하고자 하는것을 while문 안에 쓰기★★★★★★★★★★
		// while문과 Math.random()이용해서
		// 두개의 주사위를 던졌을때 1~6(숫자1, 슷자2)로 출력하고
		// 숫자의 합이 5일 경우 종료, 아닐경우 계속 던짐
		// 최종으로 주사위를 몇번 던졌는지 횟수를 출력.
		// 숫자의 합이 5가 되는 조합은 1,4/4,1/ 2,3/3,2
//		int count = 0;
//		while (true) {
//			int num1 = (int)(Math.random()*6)+1;
//			int num2 = (int)(Math.random()*6)+1;
//			count+=1;
//			System.out.printf("%d,%d\n",num1,num2);
//			if(num1 +num2 ==5) {
//				break;
//			}
//		}
//		System.out.println(count+"회");

		for (int i = 1; i < 5; i++) {
			for (int j = 4; j >0 ; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
