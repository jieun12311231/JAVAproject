package com.yedam.java.t3;

public class CardPayment implements Payment {

	double cardRatio;

	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;

	}

	@Override
	public int online(int price) {
		int onmoney = price -(int)((ONLINE_PAYMENT_RATIO + cardRatio)*price);
		return onmoney;
	}
	

	@Override
	public int offline(int price) {
		int offmoney = price - (int)((OFFLINE_PAYMENT_PATIO + cardRatio)*price);
		return offmoney;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보***");
		System.out.println("온라인 결제 시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (OFFLINE_PAYMENT_PATIO + cardRatio));

		// TODO Auto-generated method stub

	}

}
