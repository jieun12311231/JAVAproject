package com.yedam.app.common;

import java.util.Scanner;

import com.yedam.app.deal.ProductStockManagement;
import com.yedam.app.deal.RecivingGoodsDAO;
import com.yedam.app.deal.TakeOutGoodsDAO;
import com.yedam.app.products.ProductInfoManagement;
import com.yedam.app.products.ProductsDAO;

public class Management {
	// 필드
	protected Scanner sc = new Scanner(System.in);
	protected ProductsDAO pDAO = ProductsDAO.getInstance();
	protected RecivingGoodsDAO rDAO = RecivingGoodsDAO.getInstance();
	protected TakeOutGoodsDAO tDAO = TakeOutGoodsDAO.getInstance();

	// 생성자 -> run
	public void run() {
		while (true) {
			menuPrint();

			int menuNo = menuSelect();

			if (menuNo == 1) {
				// 제품정보관리
				new ProductInfoManagement(); // 한번 더 실행(제품과 재고 분리) 원래는 매개 변수만 넘겨도 상관이 없지만 프로젝트 구조상 두개가 왓다갓다해야함. but로그인
												// 정보는 들고있어야함
			} else if (menuNo == 2) {
				// 제품관리
				new ProductStockManagement();
			} else if (menuNo == 9) {
				// 프로그램 종료
				exit();
				break;
			} else {
				// 입력오류
				showInputError();
			}
		}
	}

	// 메소드
	protected void menuPrint() {
		System.out.println("==================================");
		System.out.println("1.제품정보관리 2.제품재고관리 9.로그아웃");
		System.out.println("==================================");
	}

	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}

	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}

	protected boolean selectRole() { // 권한이 두개밖에 없어서 불린 관리자 true 유저 false
		int memberRole = LoginControl.getLoginInfo().getMemberRole();// LoginControl얘 의 정보를 기반으로 getMemberRole멤버의 롤값을
																		// 들고옴
		if (memberRole == 0) {
			return true;
		} else {
			return false;
		}
	}

}
