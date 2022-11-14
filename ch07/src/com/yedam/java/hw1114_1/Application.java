package com.yedam.java.hw1114_1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keypad kp = new RPGgame();
		kp.leftDownButton();
		kp.rightUpButton();
		kp.changeMode();
		kp.rightDownButton();
		kp.rightUpButton();
		kp.leftDownButton();
		kp.changeMode();
		kp.rightDownButton();
		System.out.println("==============");
		kp =new ArcadeGame();
		kp.leftUpButton();
		kp.rightUpButton();
		kp.leftDownButton();
		kp.changeMode();
		kp.rightDownButton();
		kp.rightUpButton();
		kp.leftUpButton();
		kp.rightDownButton();
		
	}

}
