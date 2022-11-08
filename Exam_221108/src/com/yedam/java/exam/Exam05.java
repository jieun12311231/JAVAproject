package com.yedam.java.exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] dice = null;// 반복문을 돌리기전에 주사위를 굴려서 나올 값을 담을 배열선언// 주사위의 각 숫자별로 몇번씩 나왔는지를 기록.
		// 배열은 index와 해당 배열이 갖는 값이 무엇인지 정해야함
		// index -> 변동 안됨! =>>주사위의 각 숫자와 연동
		// 각 index별로 가지는 값 -> 변동 됨! =>> 주사위의 각 숫자가 가지는 횟수(..?)

		// 주사위의 각 숫자와, 몇변쨰 나왔는지 중 =>
		int size = 0;
		while (run) {
			System.out.println("=== 1.주사위크기 2.주사위 굴리기 3.결과보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.print("메뉴 > ");
			int selestNo = Integer.parseInt(sc.nextLine());

			if (selestNo == 1) {// 주사위크기 입력
				System.out.print("주사위 크기 > ");
				size = Integer.parseInt(sc.nextLine());
				if (size >= 5 && size <= 10) {
					dice = new int[size]; // 주사위를 굴려서 나오는 배열을 담음.
				} else {
					System.out.println("정해진 번호를 입력하세요");
					size = 0;
				}
			} else if (selestNo == 2) {// 주사위 굴리기 => 주기능
				int count =0;
				while (true) {
					int num = (int) (Math.random() * size) + 1; // size를 통해서 범위를 지정해줘야함.
					count++;
					dice[num-1] = dice[num-1]+1;  //랜덤할떄마다 숫자가 나옴 3이 나오면 +1을 하면서 카운팅을 해줌.
					//num은 단순한 숫자이지만 인덱스를 만들려면 -1을 해줘야함
					//num을 인덱스로 쓰기위해 -1을 해줘야함.
					//index = num -1  <-> num = index +1
					if (num == 5)  //5가 나올때까지 굴리고, 5가나오면 빠져나옴.
						break;
				}
				System.out.println("5가 나올때 까지 주사위를 " + count + "번 굴렸습니다.");
				//num이 몇번 중복되었는지, 몇번 나왔는지
			} else if (selestNo == 3) {// 결과 보기  //for문에 있는 해당값 출력
				for(int i = 0;i<dice.length;i++) {
					System.out.println((i+1)+"은"+dice[i]+"번 나왔습니다.");
				}
			} else if (selestNo == 4) {// 가장 많이 나온 수
				int maxCount = dice[0]; //나온 횟수
				int maxIndex = 0; // 나온 수 >인덱스로 먼저 구하고 숫자로 바꿀거임
				for(int i=0 ;i<dice.length;i++) {
					if(maxCount < dice[i]) {
						maxCount = dice[i];
						maxIndex =i;  //중복으로 나온 수 중 가장 많이 나온 수 중 큰 수 출력
	                }//나보다가 큰 경우만 반복문이 돌기때문데 경계값에 = 를 넣어주면 가능함.
				}
				System.out.println("가장 많이 나온 수는 "+(maxIndex+1)+"입니다.");
			
			} else if (selestNo == 5) {// 종료
				run = false;
			} else { // 메뉴(1~5)외 입력 시
				System.out.println("정해진 번호가 아닙니다. 다시 입력해주세요.");

			}
		}
		System.out.println("프로그램 종료");
//주사위 크기만큼 정수의 변수가 필요>> 배열로 담으면 편함
	}

}
