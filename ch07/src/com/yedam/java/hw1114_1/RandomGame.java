package com.yedam.java.hw1114_1;

//import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int num = (int) (Math.random() * 2) + 1;
		System.out.println(num);
		Keypad game;
//		if( num == 1) {
//			game = new ArcadeGame();
//			
//		}else if( num == 2) {
//			System.out.println(
//					"===========================================================================================");
//			System.out.println(
//					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >");
//			System.out.println(
//					"===========================================================================================");
//
//			System.out.print("choice>>");
//			int selecNo = Integer.parseInt(sc.nextLine());
//			game = new RPGgame();
			
//		}
		
		if (num == 1) { // RPGgame 게임
			RPGgame rpg = new RPGgame();
	
			while (run) {

				System.out.println(
						"===========================================================================================");
				System.out.println(
						"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >");
				System.out.println(
						"===========================================================================================");

				System.out.print("choice>>");
				int selecNo = Integer.parseInt(sc.nextLine());

				if (selecNo == 1) {
					rpg.leftUpButton();
				} else if (selecNo == 2) {
					rpg.leftDownButton();
				} else if (selecNo == 3) {
					rpg.rightUpButton();
				} else if (selecNo == 4) {
					rpg.rightDownButton();
				} else if (selecNo == 5) {
					rpg.changeMode();
				} else if (selecNo == 0) {
					num = 2;
				} else if (selecNo == 9) {
					run = false;
					System.out.println("EXIT");
				} else {
					System.out.println("정해진 번호가 아닙니다.");
					System.out.println("번호를 다시 입력하세요");
				}

			}

		} else if (num == 2) { // ArcadeGame게임
			ArcadeGame acd = new ArcadeGame();

			while (run) {
				System.out.println(
						"===========================================================================================");
				System.out.println(
						"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >");
				System.out.println(
						"===========================================================================================");

				System.out.print("choice>>");
				int selecNo = Integer.parseInt(sc.nextLine());

				if (selecNo == 1) {
					acd.leftUpButton();
				} else if (selecNo == 2) {
					acd.leftDownButton();
				} else if (selecNo == 3) {
					acd.rightUpButton();
				} else if (selecNo == 4) {
					acd.rightDownButton();
				} else if (selecNo == 5) {
					acd.changeMode();
				} else if (selecNo == 0) {
					num = 1;
				} else if (selecNo == 9) {
					run = false;
					System.out.println("EXIT");
				} else {
					System.out.println("정해진 번호가 아닙니다.");
					System.out.println("번호를 다시 입력하세요");
				}
			}
		}
	}

}
