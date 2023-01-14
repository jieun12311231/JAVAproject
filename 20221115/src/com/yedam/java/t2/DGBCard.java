package com.yedam.java.t2;

public class DGBCard extends Card{
	
	String company = "대구은행";
	String cardStaff;
	
	
	
	public DGBCard(String cardNo, int vaildDate, int cvc,String cardStaff) {
		super(cardNo, vaildDate, cvc);
		this.cardStaff = cardStaff;
	}



	@Override
	public void showCardInfo() {
		// TODO Auto-generated method stub
//		super.showCardInfo();
		System.out.println("카드정보 - Card No "+ cardNo+", 유효기간 : "+vaildDate+", CVC :"+cvc);
		System.out.println("담당직원 - "+cardStaff+","+company);
		
	}

}
