package com.yedam.java.ch01;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 상품의 수를 입력 받아서 상품의 수 크기의 배열을 생성
		System.out.print("상품의 수를 입력하세요 > ");
		int count = Integer.parseInt(sc.nextLine());
		Profield[] pro = new Profield[count];

		// 배열의 크기만큼 반복문 재생하면서
		// 상품, 상품 가격 입력
		for (int i = 0; i < pro.length; i++) {

			// 배열안에 정보를 담을 객체 생성
			Profield prof = new Profield();

			// 정보 입력 문구, 입력공간 만들기
			// 상품 이름
			System.out.print("상품의 이름을 입력하세요. > ");
			String product = sc.nextLine();
			prof.setPro(product);
			// 상품의 수량
			System.out.print("상품의 개수를 입력하세요. > ");
			int proSt = Integer.parseInt(sc.nextLine());
			prof.setProStock(proSt);
			// 상품 가격
			System.out.print("상품의 가격을 입력하세요. > ");
			int price = Integer.parseInt(sc.nextLine());
			prof.setProPrice(price);

			pro[i] = prof;
		}
		// 모든 상품 출력
		for (int i = 0; i < pro.length; i++) {
			pro[i].getInfo();
		}

		// 최대값
		int maxPro = pro[0].getProPrice();
		int sum = 0;
		for (int i = 0; i < pro.length; i++) {
//			pro[i].totalSum();

			if (maxPro < pro[i].getProPrice()) {
				maxPro = pro[i].getProPrice();
//		System.out.println("최대가격을 갖는 상품의 이름 : " + pro[i].getPro());

			}
		}
		// 최대가격의 상품을 제외한 상품들의 가격의 총합//
		for (int i = 0; i < pro.length; i++) {
			if (maxPro == pro[i].getProPrice()) {
				continue;
			} else {
				sum += (pro[i].getProPrice() * pro[i].getProStock());
			}
		}
//		System.out.println(sum);

		// for문돌리면서 최대가격의 상품 출력하고,합계 출력
		for (int i = 0; i < pro.length; i++) {
			if (maxPro == pro[i].getProPrice()) {
				System.out.println("최대가격을 갖는 상품의 이름은 " + pro[i].getPro() + "입니다.");
			}
		}
		System.out.println("최대가격을 상품을 제외한 상품의 총 가격은 " + sum + "입니다.");
	}

}
