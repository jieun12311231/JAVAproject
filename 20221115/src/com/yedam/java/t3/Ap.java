package com.yedam.java.t3;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 10000;
		Payment card  = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : "+card.online(price));
		System.out.println("오프라인 결제 금액 : "+card.offline(price));
		
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : "+simple.online(price));
		System.out.println("오프라인 결제 금액 : "+simple.offline(price));
		
	}

}
