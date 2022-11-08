package com.yedam.java.ch01;

import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("------------------------");
			System.out.print("선택 > ");  // 
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo  == 1) {
				System.out.print("예금액> ");
				int money =Integer.parseInt(scanner.nextLine());
				balance += money;
			}else if(selectNo  == 2) {
				System.out.print("출금액 > ");
				int money =Integer.parseInt(scanner.nextLine());
				balance -= money;
			}else if(selectNo  == 3) {
				System.out.println("잔고 > " + balance);
			}else if(selectNo  == 4) {
				run = false;
			}else {
				System.out.println("정해진 값을 입력하세요.");
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	}
	

}
