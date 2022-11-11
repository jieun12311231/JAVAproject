package com.yedam.java.ch0701;

public class DmbCellphone extends Cellphone{
//자식 클래스
	
	//필드
	public int channel;
	
	
	
	//생성자
	public DmbCellphone(String model, String color, int channel) {
		//super(); 가 생략 되어있는것.
		//부모클래스에 생성자가 없기떄문에 super가 생략됨
		
		//부모클래스가 가지고있는 필드
		this.model = model;
		this.color = color; 
		//자식 가지고있는 필드
		this.channel = channel;   
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 :"+channel + "번 DMB방송 수신을 시작합니다.");
	}
	
	
	
	

}
