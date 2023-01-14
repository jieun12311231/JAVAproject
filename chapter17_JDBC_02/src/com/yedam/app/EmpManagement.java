package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.emp.EmpDAO;
import com.yedam.app.emp.EmpDAOImpl;
import com.yedam.app.emp.EmpVO;

public class EmpManagement {  //궁극적으로 사용자가보고 메뉴 선택하는
	//전부 함수로 치환
	Scanner sc = new Scanner(System.in);
	EmpDAO empDAO = EmpDAOImpl.getInstance();
	//뱐수로는 함수 사용 불가능
	
	public EmpManagement() {
		while(true) {
			//메뉴출력//
			menuPrint();
			//메뉴 선택//
			int menuNo = menuSelect();
			//각 메뉴의 기능을 실행(조건문 사용)
			if(menuNo ==1) {
				//전체조회
				selectAll();
			}else if(menuNo ==2) {
				//단건조회
				selectOne();
			}else if(menuNo ==3) {
				//사원등록
				insetEmp();
			}else if(menuNo ==4) {
				//사원 수정
				updateEmp();
			}else if(menuNo ==5) {
				//사원 삭제
				deleteEmp();
			}else if(menuNo ==9) {
				//종료
				end();  //메세지 출력
			}else {
			//기타사항	
				printErrorMessage();//메세지 출력

			}
		}
	}
	
	//기타사항		
	private void printErrorMessage() {
		System.out.println("========================");
		System.out.println("메뉴를 잘못 입력하였습니다.");
		System.out.println("메뉴를 다시 한번 확인해주세요.");
		System.out.println("========================");
	}
	//종료
	private void end() {
		System.out.println("========================");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("========================");
	}
	//메뉴출력//	
	private void menuPrint() {
		System.out.println("==================================================");
		System.out.println("1.전체사원 2.사원조회 3.사원등록 4.사원수정 5.사원삭제 9.종료");
		System.out.println("==================================================");
	}
	//메뉴 선택//
	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("메뉴는 숫자로 구성되어있습니다.");
		}
		return menuNo;
	}
	//전체조회
	private void selectAll() {
		List<EmpVO> list = empDAO.selectAll();
		if(list.isEmpty()) {  //정보가 비어있을 경우 >> if문이 돌지않으면 데이터가 있다는것
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		for(EmpVO empVO :list) {
			System.out.printf("%d: %s, %s \n",empVO.getEmpNo(),empVO.getFirstName(),empVO.getLastName());
		}
	}
	//단건조회
	private void selectOne() {  //사원조회
		EmpVO findEmp = inputEmpInfo();  //무엇인가로 정보를 찾고
		EmpVO empVO = empDAO.selectOne(findEmp);//정보를 가지고옴
		if(empVO ==null) {
			System.out.printf("%d 사원은 존재하지않습니다. \n",findEmp.getEmpNo());
		}else {
			System.out.println("검색결과 > ");
			System.out.println(empVO);
		}
	}
	//사원등록
	private void insetEmp() {
		EmpVO empVO = inputEmpAll();
		empDAO.insert(empVO);
	}
	//사원 수정
	private void updateEmp() {
		EmpVO empVO = inputEmpInfo();
		empDAO.update(empVO);

	}
	//삭제//
	private void deleteEmp() {
		int empNo = inputEmpNo();
		empDAO.delete(empNo);
	}
	
	private EmpVO inputEmpAll() {  //inset할떄 사용하기 떄문에 보
		EmpVO empVO = new EmpVO();
		
		System.out.println("사원번호 >");
		empVO.setEmpNo(Integer.parseInt(sc.nextLine()));
		
		System.out.println("생년월일 (yyyy-MM-dd) >");
		empVO.setBirthDate(sc.nextLine());
		
		System.out.println("이름 >");
		empVO.setFirstName(sc.nextLine());
		
		System.out.println("성 > ");
		empVO.setLastName(sc.nextLine());
		
		System.out.println("성별(M,F) >");
		empVO.setGender(sc.nextLine());
		
		System.out.println("입사일 (yyyy-MM-dd) >");
		empVO.setHireDate(sc.nextLine());
		
		return empVO;
	}
	
	private EmpVO inputEmpInfo() {  //inset할떄 사용하기 떄문에 보
		EmpVO empVO = new EmpVO();
		
		System.out.println("사원번호 >");
		empVO.setEmpNo(Integer.parseInt(sc.nextLine()));
		
		System.out.println("이름 >");
		empVO.setFirstName(sc.nextLine());
		
		return empVO;
	}
	
	private int inputEmpNo() {
		int empNo = 0;
		try {
			empNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("사원번호는 숫자로 구성되어있습니다.");
		}
		return empNo;
	}
	
	
	
	
}
