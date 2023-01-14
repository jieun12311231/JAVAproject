package com.yedam.app.emp;
import java.util.ArrayList;
//인터페이스의 구현페이스 
import java.util.List;

import com.yedam.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
//브라우저에서DAO(상속) Add에서 EmpDAO(implements)
	//싱글톤//동일한 테이블에 대해서는 인스턴스가 하나면됨.
	//하나의 변수의 값을 담음
	private static EmpDAO instance = null; //인터페이스로 필드를 가짐  >>구현 클래스 사용
	public static EmpDAO getInstance() {  //타입은 인터페이스로 지정
		if(instance == null)
			instance = new EmpDAOImpl();
		return instance;  //null이면 기존의 값을 반환
	}
	
	//밑에는 각각의 sql문으로 실행 
	//sql문으로 돌리려면 try catch문 반드시 필요
	@Override
	public List<EmpVO> selectAll() {  //전체 조회
		List<EmpVO> list = new ArrayList<>();
		try {
			connect();  //디비와 연결 //반드시 들어가야함!!!!!
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees";  //모든데이터 담으려면 * 사용
			rs = stmt.executeQuery(sql);
			int count = 0; //데이터를 20개만 받아오기 위해서 넣는것임 
			while(rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setEmpNo(rs.getInt("emp_no"));
				empVO.setBirthDate(rs.getString("birth_date"));
				empVO.setFirstName(rs.getString("first_name"));
				empVO.setLastName(rs.getString("last_name"));
				empVO.setGender(rs.getString("gender"));
				empVO.setHireDate(rs.getString("hire_date"));
				
				list.add(empVO);
				if(++count >= 20) break;  //가지고있는 필드가 너무 많아서 넣는 구문
			}
		}catch(Exception e) {
			e.printStackTrace();  //예외 그대로 처리 
		}finally {
			disconnect();  
			//다음을 실행하기 전까지 얼마나 걸릴지 모르기때문에 데이터베이스의 로스를 줄이기 위해 
		}
		return list;  //****중요****// 
	}

	@Override
	public EmpVO selectOne(EmpVO empVO) { //단건조회
		EmpVO findVO = null;
		try {
			connect();
			//select에 대한 조건
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees WHERE emp_no = "+empVO.getEmpNo();//empVO에서 해당되는 값을 가지고 오도록
			rs = stmt.executeQuery(sql);
			//확실하게 한건만 가지고오려면 if
			if(rs.next()) {
				findVO = new EmpVO();
				findVO.setEmpNo(rs.getInt("emp_no"));
				findVO.setBirthDate(rs.getString("birth_date"));
				findVO.setFirstName(rs.getString("first_name"));
				findVO.setLastName(rs.getString("last_name"));
				findVO.setGender(rs.getString("gender"));
				findVO.setHireDate(rs.getString("hire_date"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			disconnect();
		}
		return findVO;
	}

	@Override
	public void insert(EmpVO empVO) {  //추가 기능
		try {
			connect();
			String sql = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmpNo());
			pstmt.setString(2, empVO.getBirthDate());
			pstmt.setString(3, empVO.getFirstName());
			pstmt.setString(4, empVO.getLastName());
			pstmt.setString(5, empVO.getGender());
			pstmt.setString(6, empVO.getHireDate());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();

		}

	}

	@Override
	public void update(EmpVO empVO) {  //수정
		try {
			connect();
			String sql = "UPDATE employees SET first_name = ? WHERE emp_no  = ? ";
			pstmt =conn.prepareStatement(sql);
			// ? 채워주기
			pstmt.setString(1, empVO.getFirstName());
			pstmt.setInt(2, empVO.getEmpNo());
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();

		}
	}

	@Override
	public void delete(int empNo) {  //삭제
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM employees WHERE emp_no = " + empNo;  //empNo변수로 넘겨주기
			int result =stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();

		}
	}

}
