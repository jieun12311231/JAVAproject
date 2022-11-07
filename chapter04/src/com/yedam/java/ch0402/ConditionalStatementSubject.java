package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 교재 161 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// 방법1)
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += "*"; // 문자열도 필요한만큼 누적가능함.
			System.out.println(str);
//			i += i;
		}

		// 방법2) n번째 줄에 n개의 *를 출력
		for (int i = 1; i <= 5; i++) { // n번째 줄
			for (int j = 1; j <= i; j++) { // 개의 * 출력
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제2) for문을 이용해서 1~100까지의 정수 중에서
		// 2의 배수가 아닌 숫자의 개수를 구해시오. >>홀수
		int count = 0;
//		//for문이 도는 동안 안에서 살아 남아있을 변수를 선언 해줘야함
//		//for문 안에 변수를 선언하면 for문이 한번 돌때 마다 0으로 초기화가 됨.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				count += 1;
//				//System.out.println(i);
			}
		}
		System.out.println(count + "개");

		// 방법2
		int count1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			count1++;
		}
		System.out.println(count1 + "개");

		// 문제3) p161 4번
		// 중첩 for문을 이용하여 4x+5y=60의 해 중에서 첫번째로 구해지는 값을(x,y)형태로출력하세요
		// x,y는 10이하의 자연수
		// 1)중첩 for문 2) x,y는 1~10까지 정수

		Outter: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) { // if문에 ;붙이면 안됨 //컴퓨터가 인지하는 방정식으로 바꿔줘야함.
//					System.out.println(x);
//					System.out.println(y);
					System.out.printf("(%d,%d)\n", x, y);
					break Outter;
				}
			}
		}

		// 문제4)do~while 문과 Math.random()함수를 이용
		// 1~10의 정수 중 7이라는 수가 나올때까지 숫자를 출력
		// while은 처음의 값이 7이 나오면 출력안되고 바로 종료되기떄문에, do while문을 쓰는것이 적절함
		// 방법1)
//		int val = (int) (Math.random() * 10) + 1; // 반복문안에서 숫자가 돌수있게 밖에서 변수를 선언해주고 안에서 값을 줘야함
//		do {
//			val = (int) (Math.random() * 10) + 1; // 무조건 한번은 랜덤문이 돌 수 있게 do while을 써야함
//			System.out.println(val);
//		} while (val != 7);
//
//		// 방법2) //while은 처음의 값이 7이 나오면 출력안되고 바로 종료되기떄문에, do while문을 쓰는것이 적절함
//		int val1 = 0;
//		while (val1 != 7) {
//			val1 = (int) (Math.random() * 10) + 1;
//			System.out.println(val1);
//		}

		// 문제5) 161 3번  //방정식의 연장선으로 생각하면됨.
		//내가 반복해야하는게 무엇인지 잘 생각해보기 >> 반복하고자 하는것을 while문 안에 쓰기★★★★★★★★★★
		// while문과 Math.random()이용해서
		// 두개의 주사위를 던졌을때 1~6(숫자1, 슷자2)로 출력하고
		// 숫자의 합이 5일 경우 종료, 아닐경우 계속 던짐
		// 최종으로 주사위를 몇번 던졌는지 횟수를 출력.
		// 숫자의 합이 5가 되는 조합은 1,4/4,1/ 2,3/3,2
		
		//방법1)
		int num1 = 0;
		int num2 = 0;
		int turn = 0;
		
		while (num1 + num2 != 5) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			turn++;
			System.out.printf("주사위 조합은 %d,%d입니다\n",num1,num2);
		}System.out.printf("시도횟수는 %d회입니다",turn);
		
		
		//방법2)
//		int total1 = 0;  //누적되는 횟수를 담아야하기때문에 while문 밖에 선언이 됨.
//		while(true) {
//			int num3 = (int)(Math.random()*6)+1;  //반복할때마다 누적될 필요가 없기떄문에 안에 바로 선언하면 됨,
//			int num4 = (int)(Math.random()*6)+1;
//			total1++;
//			System.out.printf("(%d,%d)\n",num3,num4);
//			if(num3+num4 ==5) {
//				break;
//			}
//		}
//		System.out.println("주사위를 던진 횟수는 총 "+total1+"번입니다." );
		
		

		
		
		
		
		
		
	}

}
