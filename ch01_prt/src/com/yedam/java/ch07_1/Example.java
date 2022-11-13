package com.yedam.java.ch07_1;

public class Example {

	public static void main(String[] args) {
		
		DmbCellphone phone = new DmbCellphone("자바폰", "검정", 17);
		
		System.out.println("모델 "+phone.model);
		System.out.println("색상 :"+phone.color);
		
		System.out.println("채널 "+phone.channel);
		
		
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice("여보세요");
		phone.reciveVoice("누구세요");
		phone.hangUp();
		
		phone.turnOnDmb();
		phone.changeChannleDmb(90);
		phone.turnOnDmb();
	}
}
