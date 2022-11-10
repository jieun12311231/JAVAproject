package com.yedam.java.ch0605;

public class ShoesApplication {
	//같은 지역에 바로 만들기
	//필드
	int statisT = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//내 자신을 인스턴스로 만들어야지 밖에 있는 필드를 끌어와서 쓸수있음..
		//int statisT = 0;를 쓰고싶은데 static이 아니라서 쓸수없음 >> 내자신을 인스턴스로 만들어야 쓸수있음
		ShoesApplication ap = new ShoesApplication();
		ap.statisT =2;  //내 자신을 인스턴스로 만들어주면 사용 가능하게 됨.
		
		
		
		Shoes shoes = new Shoes();

		shoes.makeRunning();
		shoes.makeslipper();
		shoes.makemule();

		shoes.getCount();  //만들어진 신발을 getCount를 통해서 다 카운트해줌.

		System.out.println(Shoes.totalCount);  //클래스 이름.static문 이름
		
		
		
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.word);
		System.out.println(csno.words);
		//>>> 인스턴스를 만들어서 꺼내와서 써야함 ..?무슨소리,,,
		//다른 지역에 만든 클래스를 끌어와서 쓰는것 
		
		
		System.out.println(ConstantNo.EARTH_ROUND);
		//ConstantNo에 있는 earthgound를 사용할수 있도록 하는게 static......
	
		//은행 고객 정보를 관리 하는 클래스 
		//클래스 3개 만들어야함 
		// 1) 메인 클래스 실행
		//>> 생성자를 통한 고객의 정보를 저장, 출력
		
		// 2) Customer //고객정보
		//>> 고객의 정보를 저장하는 클래스 (이름, 은행명, 계좌 , 잔액에 대한 필드 존재
		//>> getInfo()라는 메소드를 통해서 입력한 정보를 출력
		//>> withDraw() : 출금 할 때 정보를 출력 
		
		// 3) Bank 
		//>> 해당 은행의 금리를 저장   //(현재 잔액 + (현재 잔액*금리))
		
	
	}

}
