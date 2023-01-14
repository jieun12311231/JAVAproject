package com.yedam.java.t3;

public class SimplePayment implements Payment {

	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	
	@Override
	public int online(int price) {
		int onmoney = price -(int)((ONLINE_PAYMENT_RATIO + simplePaymentRatio)*price);
		return onmoney;
	}

	@Override
	public int offline(int price) {
		int offmoney = price - (int)((OFFLINE_PAYMENT_PATIO + simplePaymentRatio)*price);
		return offmoney;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("***간편결제시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : "+(ONLINE_PAYMENT_RATIO+simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율 : "+(OFFLINE_PAYMENT_PATIO+simplePaymentRatio));
	}

}
