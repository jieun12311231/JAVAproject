package com.yedam.java.ch0801;

public class LGWashingMachine implements WashingMachine{

	@Override
	public void startBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기가 빨래를 시작합니다.");
	}

	@Override
	public void pauseBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기를 일시중지합니다");
	}

	@Override
	public void stopBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁가기 중지합니다.");
	}

	@Override
	public int changeSpeed(int speed) {  //1번모드 세탁기 20 2번모드 속도 5 ..
		switch(speed) {
		case 1:
			return 20;
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0;
	}

}
