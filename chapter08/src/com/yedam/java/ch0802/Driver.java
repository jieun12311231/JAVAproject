package com.yedam.java.ch0802;

public class Driver {

	public void drive(Vehicle vehicle) {
		// 객체 타입확인
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			// 버스 객체가 맞으면 강제 변환을하고 checkFare싱행하라
			// b instanceof a >> b한테 너는 a냐 라고 묻는것
			// 맞으면 true출력
			// bus는 true이기떄문에 checkFare, run둘다 출력
		}
		vehicle.run();
		// 택시의 경우에응 if문이false이기때문에 run만 실행됨
	}
}
