package com.yedam.java.ch0801;

public class Audio implements RemoteControl { // 오디어 리모컨

	private int volume;

	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨" + this.volume);
	}
//하나의 인터페이스를 통해 텔레비전 과 오디오 리모컨를 만듬
}
