package com.yedam.java.ch0605;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String confirm;

		BankCustomer customer = new BankCustomer("김지은", "카카오뱅크", 123456789, 1000000);

		customer.getInfo(); // 고객정보

		customer.withDraw(); //
		System.out.println("출금 하시겠습니까? Y/N");

		confirm = sc.nextLine(); //
		if (confirm.toLowerCase().equals("y")) {

			System.out.println("출금 완료");

		} else {
			System.out.println("시스템 종료");
		}

		// 인스턴스를 만들어서 heap영역에 저장하는 것
		// 다 똑같은 기능을 여러 클래스에 선언해서 쓰게 되는 것을
		// static을 사용해서 한번 제대로 등록하고 쓰게 하자//
		// >>싱글턴 프로젝트할때 많이 사용하게 될것
		// 데이터 베이스 연결도 한번 연결해놓고 가져오면 됨(싱글톤으로 DB를 한번 연결)
		// 데이터 베이스 연결할수있느 객체 한개만들어서 전체 프로그램에서 사용.
		//

		// 접근 제한자//
		Access access = new Access();

		// 1)public
		access.free = "public";

		// 2)private
		// access.privacy = "privacy"; >>에러 발생하는거 맞음

		// 3)protected
		access.parent = "parent";

		// 4)
		access.basic = "basic";

		// 메소드에서 접근제한자 걸기//
		// 1)
		access.free();
		// 2)
		// access.privacy();
		// >>에러뜨는거 맞음
		// Access의 public 메소드에 privacy()을 추가 해주었기때문에
		// access.free();에서 접근이 불가능합니다.가 출력되는것이 맞음..!!!!!
		// private안에 있는 내용을 출력하고 싶으면 다른 메소드를 통해서 접근하고 출력

		// 싱글톤// //Singleton == new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// >>Singleton s1 =new Singleton()
		// s1과 s2는 같음 이미 만들어진 것이 들어가기떄문에 같음

		System.out.println(s1);
		// >>com.yedam.java.ch0605.Singleton@35bbe5e8
		System.out.println(s2);
		// >>com.yedam.java.ch0605.Singleton@35bbe5e8
		// 주소값이 같음
		//// >>>>>싱글톤을 통해서 객체를 가지고 오게되면 같은 객체만 계속 불려지게되는것임

		// getInstance를 호출하면 Singleton이 불려짐 근데 Singleton 은 new Singleton()랑 같음
		// 따라서 삼단논법에 의해서 결과적으로 getInstance는 new Singleton()이 됨
		// >>Singleton = getInstance()
		// >>>>>>getInstance() = new Singleton()

		// 싱글톤을 통해서 불러오는것이 메모리 관리에 좋음

		// Singleton클래스에 있는 싱글톤 사용
		s1.run();
		s2.connectDB();

		// Member의 getter setter 이용///
		Member mem = new Member();

		// 1) mem의 인스턴스 필드에 접근 가능한지 혹인
		// 2)getter setter로 데이터 입력및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(22);

		System.out.println("id : " + mem.getId());
		System.out.println("tel : " + mem.getTel());
		System.out.println("age : " + mem.getAge());

		
		
		
	}

}
