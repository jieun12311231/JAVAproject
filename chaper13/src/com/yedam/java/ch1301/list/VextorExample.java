package com.yedam.java.ch1301.list;

import java.util.List;
import java.util.Vector;

public class VextorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();

		// 생산자를통해 값 넣디
		list.add(new Board("제목1", "내용1", "글쓴이1"));
//		list.add(new Board("제목2","내용2","글쓴이2"));

		Board board = new Board("제목2", "내용2", "글쓴이2");
		list.add(board);

		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		list.remove(2);
		list.remove(3);

		// list도 배열구조이기떄문에 향상된for문 가능
		// for문으로 출력되는 값을 담아놓기 위해 임시공간 temp 설정
		//데이터가 없을때까지 반복문이 돌아감.
		for (Board temp : list) { // 보드 타입으로 데이터를 하나씩 꺼내주는거
			System.out.println(temp.subject + temp.content + temp.writer);
		}
		System.out.println();
		// 일반for문으로 list을 데이터 가져오기
		for (int i = 0; i < list.size(); i++) {
			Board board2 = list.get(i);
			System.out.println(board2.subject + board2.content + board2.writer);

		}
	}

}
