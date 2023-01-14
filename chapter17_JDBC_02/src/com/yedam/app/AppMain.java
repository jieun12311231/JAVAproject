package com.yedam.app;

//import java.util.List;
//
//import com.yedam.app.emp.EmpDAO;
//import com.yedam.app.emp.EmpDAOImpl;
//import com.yedam.app.emp.EmpVO;

public class AppMain {

	public static void main(String[] args) {
		
//		EmpDAO empDAO = EmpDAOImpl.getInstance();
//		
//		List<EmpVO> list = empDAO.selectAll();
//		
//		for(EmpVO emp : list) {
//			System.out.println(emp);
//		}
		new EmpManagement();  // 프로그램을 하나의 객체로 실행
		
	}

}
