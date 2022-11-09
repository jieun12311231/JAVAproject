package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====myCar====");
		Car myCar = new Car("모닝","skyblue"); //모델명과 색깔이 들어가있는 곳은  >> 인스턴스의 값이 바뀐 것 , 힙영역에 인스턴스가 새롭게 생긴것
		//this는 힙영역에 새로 생긴 인스턴스를 대체해서 출력 시켜 주는 것
		System.out.println("제조회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색 : "+myCar.color);
		
		System.out.println("====newCar====");

		Car newCar = new Car();  //매개변수가 없어서 값을 주지 않는 경우 >> 에러 발생
//		에러문구 : The constructor Car() is undefined  //constructor:생성자 라는 Car()이 정해지지 않았다는 의미 
		//이미 Car에 대해서 생성자가 있기떄문에 자바가 기본생성자를 만들지 않음.
		//개발자가 의도적으로 기본생성자를 뺸건지, 빼먹은건지 자바는 모르기때문에
		//기본 생성자가 단 한군데라도 존재하지 않으면 자바는 기본생성자를 만들어 주는 것임.
		//Car 클래스에 public Car() {}를 내가 넣어주면 정상적으로 작동을 함.
		//작동 결과는 class에 있는 값을 가지고 오지 this에 있는 값을 가지고 오는 것이 아님.
		System.out.println("제조회사 : "+newCar.company);
		System.out.println("모델명 : "+newCar.model);
		System.out.println("색 : "+newCar.color);
		
		System.out.println("====subCar====");
		
		Car subCar = new Car("아이오닉","하얀색");
		System.out.println("제조회사 : "+subCar.company);
		System.out.println("모델명 : "+subCar.model);
		System.out.println("색 : "+subCar.color);
		//각각의 인스턴스가 다른 값을 가짐. 
		//생성자를 호출> 
		//this는 힙에 있는 인스턴스를 말함. 기존의 힙에 있는 코드를 덮에 씀
		//this.model = model;  >>이 문구를 통해서 수많은 케이스를 만들어낼수있음
		//this.color = color;
		//왜 this를 쓰는가 생성자를 통해서 this를쓰면 기본값이 정해져있더라도 값을 변경할 수 있음.생성자 내에서 필드를 가르킬떄는 필드에 같은 이름이 존재하
		//내부에 있는 model의 힘이 더 쎄기 떄문에 this를 붙여서 값을 넣어주는거임.
		//클래스에 있는 필드값 자체는 수정할 수 없음.
		
		//중요//
		//생성자는 이름이 같음 //우리가 알고있는 선에서는 같은 이름의 매서드, 함수는 정의될수없음. 
		//생성자는 이름이 같은 것이 허용 >>생성자 오버로딩 
		//원래는 이름이 같으면 누구를 찾는건지 알수없기떄문에 같은 이름 사용 안됨
		//하나의 생성자만 같은 이름을 허용한다면 제한이 많이 생기게 됨.
		//매개변수의 타입, 개수, 순서를 다르게 선언을 하면 
		//다른 생성자로 인정을 해줌,
		//ex)같은 설계도로 만든 차의 이름을 같은 이름으로 정할수없으면 어려움이 생길듯<<이렇게 이해하면 될듯
		//변수명은 전혀 의미가 없음 우리의 눈에만 색깔, 모델 순 or 모델, 색 순서로 보일 뿐 자바 입장에서는 순서만 봄// 값을 두개를 담을 수있는 공간만 있으면 됨.
		//타입과 개수 순서가  중요함.
		//
		
		
		
		
		
	}
}
