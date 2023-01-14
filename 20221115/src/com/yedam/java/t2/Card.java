package com.yedam.java.t2;

public class Card {
	
	protected String cardNo;
	protected int vaildDate;
	protected int cvc;
	
	public Card(String cardNo, int vaildDate, int cvc) {
		this.cardNo = cardNo;
		this.vaildDate = vaildDate;
		this.cvc= cvc;
		
		
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getVaildDate() {
		return vaildDate;
	}

	public int getCvc() {
		return cvc;
	}
	public void showCardInfo() {
		System.out.printf("Card No : %s, 유효기간 : %d, CVC : %d\n",cardNo,vaildDate,cvc);
	}
	
}
