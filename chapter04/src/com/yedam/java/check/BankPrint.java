package com.yedam.java.check;

import java.util.Scanner;

public class BankPrint {

	public static void main(String[] args) {
		// p161 7번
		boolean run = true; // 실행 종료 여부
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) { // while문은 메뉴를담고있음.
			System.out.println("------------------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			// 1,2,3,4라는 숫자받아야함. //String이라는 객체 형태로 오기때문에 int타입으로 변환시켜줘야함.
			// nextLine으로 가지고오면 힙영역에 주소가 생기고 주소를 가지고만 있음.
			// parseInt은 string형태만 가능함. 다른 타입은 캐스팅()사용.
			// string타입을 다른 타입으로 변환하고 싶으면 parse를 사용해야함.
			// 다른 타입은 다른 타입끼리만 가능하고, 참조타입은 참조타입만 가능함.
			int selecNo = Integer.parseInt(scanner.nextLine());
			// >> scanner에 받아온값을 int값으로 변환해서 받음.

			if (selecNo == 1) {
				// 메뉴 : 예금 >>잔액이 상승
				System.out.println("예금액> ");  //문자열 바로 옆에 글자가 오도록 하기 위해서 print만 쓰면 됨.
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
			} else if (selecNo == 2) {
				// 메뉴 : 출금
				System.out.println("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money; // 기존의 금액에서 돈을 빼면됨.
			} else if (selecNo == 3) {
				// 메뉴 : 잔고
				System.out.println("잔고> " + balance);
			} else if (selecNo == 4) {
				// 메뉴 : 종료
				run = false; 
				//break도 가능은 하지만 while문을 돌리고 있는 run이라는 변수를 false로 해주면 전제while문이 종료가 됨. 
				//break는 임의종료라서 선호 x
			} else {
				// 1~4이외의 숫자가 들어오면 보여질 안내문구
				// 기타입력
				System.out.println("정해진 메뉴(1~4) 중에서 선택해주세요.");
			}

		}

		System.out.println("프로그램 종료");

	}

}
