package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) { // 변수i를 초기화 시켜줘야함
			// i가11까지 올라가면 조건식에서 false가 되기떄문에 빠져나옴
			// 초화식, 조건식, 증감식 >> 필요하다면 생략가능
//			System.out.println(i);
		}
		int x = 1; // 필요하다면 초기화 식을 밖에서 선언할수도있음
		for (; x <= 100; x += 15) {
			System.out.println("출력");
		}
		System.out.println("x : " + x); // x는 106이 나오고 조건식은 x<=100이 false이기때문에 for문 종료

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		} // 조건식을 둘 다 만족해야 for문 진행

		// 1~100출력 동시에 1~100합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
//			System.out.println(sum);   //1~100까지의 합계 과정을 보고싶으면 중괄호 안에 넣으면 됨
		}
		System.out.println("1~100까지의 합계 : " + sum);
		// float타입 카운터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			// 우리 눈에는 0.1로 보이지만 0.1에 근접한 값이기때문에 예상한 값이 나오지 않음. for문에는 int타입으로 계산하는 것이 좋음
			System.out.println(f);
		}

		// ★구구단 >>출력할 수 있어야함 2~9단
		for (int i = 2; i <= 9; i++) { // 바깥 for문이 1번 돌때 안에 있는 for문이 9번 동작
			System.out.println("*** " + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				// i = 0 j = 0
				// i = 0 j = 1
				// i = 0 j = 2....
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}

//////////while문 (두가지 경우 비교 잘 하기!!!!)
		// 1~10까지 출력
		int count = 1;
		// 조건식에서 사용되는 변수는 while문 밖에서 선언해줘야함
		while (count <= 10) {
			System.out.println(count); // 무한루프에 빠지지 않도록 증감식을 넣어줘야함/
			count++; // 조건식이 한번에 출력되야하기때문에 대부분 출력식 바로 뒤에 증감식이 들어감
		}

		count = 0;
		// 조건식에서 사용되는 변수는 while문 밖에서 선언해줘야함
		while (count <= 9) {
			count++;
			System.out.println(count);
		}
		// 증감식 위치가 바뀌면 초기화 식도 바뀌고 조건식도 바뀜 우리는 1이 필요하기떄문에 0을 통과 시켜버려야함
		// 범위를 10까지로 잡아버리면 11까지 출력이 됨.
		// 증감식의 위치에 따라서 값의 초기화나 범위식을 잘 봐줘야함!!!!★★★★

		// 1~100까지 출력, 1~100까지 합을 출력
		count = 1;
		sum = 0;
		while (count <= 100) {
			System.out.println(count);
			sum += count; // ☆★☆★증감식 앞에 있어야함
			count++;
		}
		System.out.println("1~" + (count - 1) + "까지의 합 : " + sum);
		// count는 while문을 다 돌면 101임★★ 101일때 조건식이 종료되고 , count는 101값을 가지고 있기떄문에 -1을 해줘야함

		// 주사위 두개를 굴림. 합이 3이 되는 경우가 나올 때까지 굴리는 경우.
		// 횟수가 정해져있지 않기때문에 for문은 쓰기 힘들고 while문을 써야함.
//		/방법1)
		//int num1 =0;
//		int num2=0;
//		
//		while(num1 + num2 !=3) {
//			num1 = (int) (Math.random() * 6) + 1;
//			num2 = (int) (Math.random() * 6) + 1;
//			System.out.printf("%d,%d의 합은 3입니다.\n",num1,num2);
		
		//방법2)
//		while (true) {
//			int num1 = (int)(Math.random()*6)+1;
//			int num2 = (int)(Math.random()*6)+1;
//			System.out.printf("%d,%d\n",num1,num2);
//			if(num1 + num2 == 3) {
//				System.out.println("합이 3입니다.");
//				break;
//			}
//		}
		

		int index = 1;
		while (index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		}

		do { // 일단 출력문이 한번은 출력이 됨!!
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		} while (index != 1);

		// break로 while문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break; // 조건을 만족했을때 반복문을 벗어남. 6이 나오면 벗어남.
		}

		// 이중for문에서 break사용
		// for문에는 break를 잘 쓰지 않지만 이중for문일 경우 사용함.  
		//안쪽 for문은 종료가 되지만 바깥쪽으 for은 계속 돌고있음. 
		//if문이 제어할수 있는 것은 안쪽 for문 만가능
		//바깥쪽에 if문을 하나 더 써야함  >>굳이 안써도 됨
		boolean result = false;
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					result = true;
					break;
				}
			}
			System.out.println("1)안쪽 for문 종료");
			if(result)break;
		}
		System.out.println("2)바깥쪽 for문 종료");
	
		
		System.out.println("---------구분선--------");
		Outter : for (char upper = 'A'; upper <= 'Z'; upper++) {  //for문에 이름붙이기
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter; // break문에 이름을 붙이면 이름 적힌 곳을 stop하겠다.
				}
			}
			System.out.println("1)안쪽 for문 종료");
			
		}
		System.out.println("2)바깥쪽 for문 종료");
		
		//continue를 사용한 for문
		//1~10까지 짝수가 아닌값을 출력 
		//방법1)
//		for(int i=1;i<=10;i++) {
//			if(i%2 !=0) {      //짝수가 아닌값을 출력.
//				System.out.println(i);
//			}
//		}
		//방법2)
//		for(int i=1;i<=10;i++) {
//			if(i%2 ==0) continue;  //짝수를 배재시키고 출력 continue는 건너뜀 ,짞수 배재시켜버리기
//			System.out.println(i);
//			
//		}
		
		
		
	}

}

