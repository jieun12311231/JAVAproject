package com.yedam.java.hw1114_1;

public class ArcadeGame implements Keypad {
	int mode = NORMAL_MODE;

	public ArcadeGame() {

		System.out.println("ArcadeGame 실행");
	}

	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		if (mode == 0) {
			System.out.println( "캐릭터가 일반 공격");
		}else if(mode ==1){
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		if (mode == 0) {
			System.out.println("캐릭터가 HIT 공격.");
		}else if(mode ==1){
			System.out.println( "캐릭터가 Double HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		// TODO Auto-generated method stub
		if(mode == 0) {
			this.mode = Keypad.HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");
		}else if(mode ==1){
			this.mode = Keypad.NORMAL_MODE;
			System.out.println(("현재모드 : NORMAL_MODE"));
		}
	}

}
