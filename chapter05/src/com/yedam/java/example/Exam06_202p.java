package com.yedam.java.example;

import java.util.Scanner;

public class Exam06_202p {

	public static void main(String[] args) {
		boolean run = true; // 반드시 불린 타입으로 사용하기!!!!
		int studentNum = 0;
		int[] scores = null; // 무조건 밖으로 빠져야함!!!!!
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
//			int[] scores = null;
			// while문안에잇는 것이 재실행됨>>계속 새로 재실행 시킴 selectNo 이 while문안에 있으면 계속 리셋됨.
			// 반복문 안에서 반복된다는 것은 새롭게 계속 리셋이 됨!! 리셋이 되면 안되는 변수는 while문 밖에 선언을 해야함.

			switch (selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2: // 복수의 값을 연속적으로 받아야함
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++)
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				break;
			case 4:
				int max = scores[0];
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					// 죄고점수
					if (max < scores[i]) {
						max = scores[i];
					}
					// 합계
					sum += scores[i];

				}
				System.out.printf("최고점수 : %d\n평균점수 : %f\n", max, ((double) sum / scores.length));
//				System.out.println("죄고점수 : "+max);
//				System.out.println("평균 : "+((double)sum/scores.length));
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		// switch문을 사용하면 break하더라도 while문이 종료되는것이 아니라switch문이 종료 되는것이기때문에
		// if문을 사용하는것이 나음.
		// 반복문 안에서 switch문을 잘 안쓰는 것이 좋음.
		//
//			if (selectNo == 1) {
//				System.out.println("학생수> ");
//				studentNum = Integer.parseInt(sc.nextLine());
//				scores = new int[studentNum];
//
//			} else if (selectNo == 2) {
//				System.out.println("scores["+i+"]>");
//				int score = Integer.parseInt(sc.nextLine());
//				scores[i] = score;
//
//			} else if (selectNo == 3) {
//				for(int i = 0;i<scores.length;i++)
//				System.out.printf("scores[%d] : %d\n",i,scores[i]);
//			} else if (selectNo == 4) {
//
//			} else if (selectNo == 5) {
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");

	}

}
