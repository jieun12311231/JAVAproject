package com.yedam.java.ch07_1;

public class DmbCellphone extends Cellphone {

	int channel;
	
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		
	}
	
	
	void turnOnDmb() {
		System.out.println("채널 "+channel +"번으로 방송 수신을 시작합니다.");
	}
	void changeChannleDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel +"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("방송 수신을 종료 합니다.");
	}
	
	
	
	
	
}
