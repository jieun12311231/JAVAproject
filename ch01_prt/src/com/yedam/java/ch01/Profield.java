package com.yedam.java.ch01;

public class Profield {
	// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서 >> product 클래스
	// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.

	// Homework 클래스에 선언
	// 1) 상품 수 someNum
	// 2) 상품 some 및 가격입력 somePrc
	// 3) 분석 totalSum

	// 상품 수 - 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
	// Product 클래스에 Scanner사용해서 넣기
	// 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
	// if 문을 써서 최대가격 상품 찾고 그 상품 제외 제품의 총합(?)
	// 분석기능 메소드를 따로 선언??

	// 클래스 생성
	// 필드

//	private int proNum;
	private String pro;
	private int proPrice;
	private int proStock;    //재고

	// 상품의 수
	// 가격입력

	// 생성자

	// 메소드
	// 출력
	// 상품의 수
	// 상품
	// 가격입력
	// 분석

	
	public void getInfo() {
		System.out.println("=== 입력 한 상품의 정보 ===");
		System.out.println("상품 이름 : " + pro);
		System.out.println("상품 수량 : " + proStock);
		System.out.println("상품의 가격 : " + proPrice + "원");

	}
	//최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
	// 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// if 문을 써서 최대가격 상품 찾고 그 상품 제외 제품의 총합(?)
		// 분석기능 메소드를 따로 선언??
//	public void totalSum() {
//		System.out.println("최대가격의 상품을 제외한 상품들 가격의 총합");
//		int maxPro = 0;
//		int sum =0;
//		if(maxPro < proPrice ) {
//			maxPro = proPrice;
//			if(maxPro != proPrice) {
//				sum += proPrice;
//			}
//		}
//		System.out.println(sum);
//	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getProStock() {
		return proStock;
	}
	public void setProStock(int proStock) {
		this.proStock = proStock;
	}
}
