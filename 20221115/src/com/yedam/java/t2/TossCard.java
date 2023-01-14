package com.yedam.java.t2;

public class TossCard extends Card {

	String company = "Toss";
	String cardStaff;
	
	

	public TossCard(String cardNo, int vaildDate, int cvc,String cardStaff) {
		super(cardNo, vaildDate, cvc);
		this.cardStaff = cardStaff;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void showCardInfo() {
		// TODO Auto-generated method stub
//		super.showCardInfo();
		System.out.println("카드정보 - Card No "+ cardNo);
		System.out.println("담당직원 - "+cardStaff+","+company);
	}

	
}
