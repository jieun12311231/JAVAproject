package com.yedam.java.ch01;

import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {

//		boolean run = true;
//		int balance = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("------------------------");
//			System.out.println("1.예금 2.출금 3.잔고 4.종료");
//			System.out.println("------------------------");
//			System.out.print("선택 > ");  // 
//			int selectNo = Integer.parseInt(scanner.nextLine());
//			
//			if(selectNo  == 1) {
//				System.out.print("예금액> ");
//				int money =Integer.parseInt(scanner.nextLine());
//				balance += money;
//			}else if(selectNo  == 2) {
//				System.out.print("출금액 > ");
//				int money =Integer.parseInt(scanner.nextLine());
//				balance -= money;
//			}else if(selectNo  == 3) {
//				System.out.println("잔고 > " + balance);
//			}else if(selectNo  == 4) {
//				run = false;
//			}else {
//				System.out.println("정해진 값을 입력하세요.");
//			}
//		}
//		
//		System.out.println("프로그램 종료");

//		int[] intAry = null;
//		int[] scores = { 83, 90, 87 };
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		
//		int sum  = 0;
//		for(int i =0;i<scores.length;i++) {
//			sum += scores[i];
//		}
//		System.out.println(sum);
//		double avg = (double)sum /scores.length;
//		System.out.println(avg);
//		 int[] scoreList = null;
//		 scoreList = new int[] {83,90,87};
//		 
//		int[] arry = new int[3];
//		for(int i=0;i<arry.length;i++) {
//			System.out.printf("%d번째 인덱스의 값은 %d입니다.\n",i,arry[i]);
//		}
//		String[] strAry = new String[4];
//		for(int i=0;i<strAry.length;i++) {
//			strAry[i] = String.valueOf(i);
//			System.out.println(i+","+strAry[i]);
//		}
//		for (int i = 0; i < strAry.length; i++) { // 배열의 크기를 알수있는 length
//			System.out.println("strAry[" + i + "] : " + strAry[i]);
//		}
//		int[] score = {83,90,97};
//		
//		int[] array = { 10, 53, 26, 85, 75 };
//		int max = array[array.length - 1]; // array[array.length-1] >>>가능
//		int min = array[0]; // int는 음수가 가질수있기때문에 0으로 주면 안됨.//임의의값 주지말기
//		for (int i = 0; i < array.length; i++) {
//			// 최대값 >>최대, 최소 각각 if문을 줘야함.
//			if (max < array[i]) { // array이가 더 크면 max가 최대값이 아니기떄문에 max를 덮었씀
//				max = array[i];
//			}
//			// 최소값
//			if (min > array[i]) {
//				min = array[i];
//			}
//		}
//		System.out.printf("최대값 : %d 최소값 : %d\n", max, min);
//		int maxInt=0;
//		int minInt =0;
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			if (max == array[i]) { 
//				maxInt = i;
//			}
//		
//			if (min == array[i]) {
//				minInt = i;
//			}
//		}
//		System.out.println(maxInt+","+minInt);
//		
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println(i);
			int[] mathScore = mathScores[i];

			for (int j = 0; j < mathScore.length; j++) {
				System.out.println("\t"+mathScore[j]);
			}
		}
		
		for(int i =0;i< mathScores.length;i++) {
			System.out.printf("mathScores [%d}\n",i);
			
			for (int j=0;j<mathScores.length;j++) {
				System.out.printf("mathScores [%d][%d] : [%d]\n",i,j,mathScores[i][j]);
			}
		}
		
		int[][]scoreList = {
				{86,65},{58,95,73}
		};
		
		for(int i = 0;i<scoreList.length;i++ ) {
			System.out.printf("%d번쨰 학생의 성적\n",i);
			for(int j=0;j<scoreList.length;j++) {
				System.out.print(scoreList[i][j]+" ");
			}
			System.out.println();
			}
		
		
		
		
		
		
	}

}
