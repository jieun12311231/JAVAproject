package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[] numList = null;
		int diNum = 0; // 주사위 크기
		int count = 0;

		while (run) {
			System.out.println("=== 1.주사위크기 2.주사위 굴리기 3.결과보기 4.가장많이 나온 수 5.종료 ===");
			System.out.print("메뉴 > ");
			int num = Integer.parseInt(sc.nextLine());
			if (num == 1) {

				System.out.print("주사위 크기 > ");
				diNum = Integer.parseInt(sc.nextLine());
				if (diNum <= 10 && diNum >= 5) {
					numList = new int[diNum];
				} else {
					System.out.println("정해진 번호를 입력하세요");
				}

			} else if (num == 2) {
				while (true) {
					int diRan = (int) ((Math.random() * 6) + 1); // 랜덤으로 받아지는 주사위의 값
					count += 1; // 횟수
					if (diRan == 5) {
//						numList[count++]= diRan;

						break;
					}

//					int diRan = (int)((Math.random()*6)+1);
//					if(diRan == 5 ) {
//						System.out.println("5가 나올때 까지 주사위를 " +count+"번 굴렸습니다.");
//					}

				}
			} else if (num == 3) {

				for (int i = 0; i < count; i++) {
					System.out.println(numList[i] + "은" + (count - 1) + "번나왔습니다");
					
				}
				System.out.println();

			} else if (num == 4) {
				int[] list = new int[diNum];
				int max = list[0];

				for (int i = 0; i < count; i++) {
					int index = numList[i] - 1;
					list[index]++;

					boolean isChecked = false;
					for (int j = 0; j < list.length; j++) {
						if (max == list[j]) {
							max = list[j];
							continue;
						}
						System.out.printf("가장 많이 나온 수는 %d입니다.\n", max);
						isChecked = true;
					}
					if (!isChecked) {
						System.out.println("중복 값이 존재하지 않습니다.");
					}
				}
			} else if (num == 5) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("정해진 번호가 아닙니다. 다시 입력해주세요.");
			}
		}

	}

}
