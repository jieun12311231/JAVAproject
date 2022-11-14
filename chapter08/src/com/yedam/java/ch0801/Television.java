package com.yedam.java.ch0801;

public class Television implements RemoteControl ,Search{ // 인터페이스를 상속받으면 그 안의 요소들을 오버라이딩 해줘야함
//상속받는 애들은 정의해놓은 요소들을 무조건 재정의 해야됨.
//텔레비전 만드는 구현클래스
//Search >를 추가하면서 서치기능을 추가하면서 스마트 티비로 만들어보기 (두가지 기능(RemoteControl,Search)을 상속 받은 Television)
	
	private int volume;  //볼륨을 받기 위한 필드 필요
	
	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {  //데이터의 무결성을 지켜주기 위해
		// TODO Auto-generated method stub
		if( volume > RemoteControl.MAX_VOLUME) { //내가 정해놓은 최대볼륩 보다 소리가 크면
			this.volume = RemoteControl.MAX_VOLUME; // 최대볼룸으로 바꿈
		}	else if(volume < RemoteControl.MIN_VOLUME) {  //내가 정해놓은 최소볼륨인 0보다 작은 숫자가 들어오면 최소 볼룸을 가지게함
			this.volume = RemoteControl.MIN_VOLUME;  
		}else {
			this.volume = volume;  //이 외의 최대~최소(0~10)의 숫자가 들어오며 그냥 사용하겠다.
		}
		System.out.println("현재 tv볼륨 : "+ this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"검색합니다.");
	}		
}
