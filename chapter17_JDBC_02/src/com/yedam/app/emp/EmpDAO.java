package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
//해당되는 테이블에 접근할때 사용하는 시그니처
	
	//전체 조회 : 해당 테이블이 가지고있는 모든 정보- 복수의 값을 리턴
	List<EmpVO> selectAll();  //EmpVO의 값을 가지고온다
	//단건 조회
	EmpVO selectOne(EmpVO empVO);//리턴되는 값은 하나 
	
	//등록
	void insert(EmpVO empVO);  //내부에서 처리하도록 void지정, 외부에서 하려면 int insert()
	//수정
	void update(EmpVO empVO);
	//삭제
	void delete(int empNo);  //삭제는 pk로만 삭제되도록!!!!
}
