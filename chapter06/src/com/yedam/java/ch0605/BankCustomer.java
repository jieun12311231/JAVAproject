package com.yedam.java.ch0605;

public class BankCustomer {
	//필드
	//이름, 은행, 계좌, 잔액
	String name;
	String bank;
	int number;
	static int money;
	
	
	//생성자
	public BankCustomer (String name,String bank,int number,int money) {
		this.name = name;
		this.bank = bank;
		this.number = number;
		this.money = money;
	}
	
	
	//메소드 getInfo() : 입력한 정보 출력
	void getInfo() {
		System.out.println("=== 입력 하신 회원 정보 ===");
		System.out.println("이름 : " + name);
		System.out.println("은행 : " + bank);
		System.out.println("계좌 : " + number);
		System.out.println("잔액 : " + money);
	}
	void withDraw() {
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 : " + money);
		System.out.println("금리 : " + Bank.pmoney +"%");
//		System.out.println("예상 금액 : " + Bank.flex );
	}
}
