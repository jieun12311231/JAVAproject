package com.yedam.java.ch0605;

public class Game {
//필드
//인스턴스 필드>> 객체를 만든다 (인스턴스화로 된다)
//>>내부에 존재하는 필드값이 인스턴스화 되면
//필드 - 설계도의 이름

//필드에 이미 데이터를 넣어놓으면 주소에 정보를 들어갈때 기본값으로 들어가게됨.
//계속 중복적으로 들어가는 객체의 정보는 미리 넣어놓는것이 좋음. 
	static String gameName="마인크래프트";  //인스턴스를 사용하지 않고 필드를 사용할수있게하는 것이static  
	String server="한국";
	String id;
	String passWd;
//셍성자

	//똑같은 함수명을 가지고있지만 매개변수에 따라 다른 개체로 인식하겠다
	//생성자를 꼭 하나만 만드는것은 아님.
	
	public Game() {
		
	}
	public Game(String id) {
		this.id = id;
	}
	//하나의 매개변수가 있더라도 타입이 다르면 가능함
	
	public Game(String id,String passWd) {
		this.id = id;
		this.passWd = passWd;
		
	}
	//객체를 생성할때 생성자를 통해 만들수있음
	//String id 를 입력하면 필드의 String id에 입력됨.
	//여러가지의 생성자를 만들어놓고 내가 쓰고싶은 형태의 생성자를 선택해서쓰면됨.
	// 생성자의 이름은 클래스 이름과 무조건 같아야하기때문에 이런 경우가 생김.
	//>> 생성자의 이름이 같더라고 매개변수가 다르면 다른 형태임 >>>오버로딩
	
	//메소드
//>>인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : " +gameName);
		System.out.println("id : " +id);
		System.out.println("passWd : " +passWd);
	}
	void getInfo(String temp) {
		
	}
//인스턴스 필드 + 인스턴스 메소드 == 인스턴스 멤버	
	
	
}
