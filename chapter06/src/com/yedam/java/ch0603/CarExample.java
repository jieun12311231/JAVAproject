package com.yedam.java.ch0603;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car car2 = new Car("팰리세이드");
		System.out.println("car2.copany : "+car2.company);
		System.out.println("car2.model : "+car2.model);
//		System.out.println("car2.color : "+car2.color);
//		System.out.println("car2.maxSpeed : "+car2.maxSpeed);

		System.out.println();
		
		Car car3 = new Car("모닝","흰색");
		System.out.println("car3.copany : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
//		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		System.out.println();
		
		Car car4 =  new Car("베뉴","네이비",200);
		System.out.println("car4.copany : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		
		
	}

}
