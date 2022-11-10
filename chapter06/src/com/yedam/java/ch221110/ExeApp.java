package com.yedam.java.ch221110;

import java.util.Scanner;

public class ExeApp {

	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;  //while문 안에서 입력받은 배열의 크기를 정하기 위해 while문 밖에 배열 선언
	int menuNo;


	// 메인문에서 실행하면 제한적임.

	public ExeApp() {  //객체를 만들때 /프로그램을 만들때 생성자를 통해 구성을 하게 됨.
		
// 메인문 호출
// while문을 활용해서 프로그램 만들기.	
		while (true) {
			showMenu();  //메뉴를 출력해줌
			
			//메뉴 번호 선택
			menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {  //입력받은 숫자를 통해서 switch문을 돌려서 실행되게 함
			case 1: // 1번을 적으면 함수로 이동해서 실행됨.
				setSize(); // setSize()함수로 이동해서 학생의 수를 받고 배열의 크기를 정함.
				break;
			case 2:
				setInfo();
				break;
			case 3:

				break;
			case 4:
				showInfo();
				break;
			case 5:

				break;
			case 6:
			
				break;

			}

		}

	}

	// 메뉴 출력을 해주는 부분
	public static void showMenu() {
		System.out.println("==========================================================");
		System.out.println("1.회원 수 입력 2.회원 정보 입력 3.단건 조회 4.모든 조회 5.삭제 6.종료");
		System.out.println("==========================================================");
	}

	public void setSize() { // 메뉴에서 1번을 선택하면 실행됨
		// 회원 수를 입력받아서 배열의 크기를 지정
		System.out.println("회원의 수 >");
		int count = Integer.parseInt(sc.nextLine());
		Bary = new Bank[count];
	}

	public void setInfo() { // 메뉴 2번을 선택하면 실행됨.
		// 배열의 크기만큼 반복문을 실행
		// 회원 정보를 객체에 담아서 배열에 저장
		for (int i = 0; i < Bary.length; i++) { // 반복문 돌때마다 새로운 객체를 생성하기 위해>> 반드시 반복문 안에 들어가야
			// 회원 정보 입력 부분
			Bank bank = new Bank();// ★위치 중요★//
			// new연산자를 통해서 bank라는 빈객체을 만들어줌 /들어갈수잇는 내용물은 4가지 4가지의 필드가 내용물이됨.
			// 반복문이 돌때마다 bank라는 빈 객체가 생성되어야지 회원의 정보를 담을 수 있음.
			// for문 밖에 있으면 마지막에 입력하는 한명밖에 못만듦.

			// 1.계좌 번호 입력
			System.out.println("계좌번호 >"); // 고객에게뜨는 문구
			int account = Integer.parseInt(sc.nextLine()); // 입력받는 창
			bank.setAccount(account); // bank배열에 setAccount메서드를 통해 데이터를 넣어줌

			// 2.은행 입력
			System.out.println("은행입력 >");
			String bname = sc.nextLine();
			bank.setBank(bname);

			// 3.예금
			System.out.println("금액설정 >");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);

			// 4.고객 이름 입력
			System.out.println("고객이름 >");
			String name = sc.nextLine();
			bank.setName(name);
			// -----여기까지 bank객체에 계좌번호, 은행이름, 예금, 고객이름이 들어감

			Bary[i] = bank;// ★// >>데이터가 들어간 bank이라는 객체를 해당하는 Bary배열의 i번째 방에 넣어주는거임
		}
	}

	public void showInfo() { // 4번
		for (int i = 0; i < Bary.length; i++) { // 지정해준 배열 크기에 따라 데이터를 확인할수 있음
			Bary[i].getInfo();
		}
	}
}
