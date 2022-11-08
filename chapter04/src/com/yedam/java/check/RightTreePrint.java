package com.yedam.java.check;

public class RightTreePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최대한의 해석을 통해 숫자를 끄집어내고 규칙을 찾아야함.
		//    * >> 1번째 줄> 공백 3개,별 1개 =>총문자4개
		//   ** >> 2번쨰 줄> 공백 2개 별 2개 =>총문자4개
		//  *** >> 3번째 줄> 공백 1개 별 3개 =>총문자4개
		// **** >> 4번쨰 줄> 공백 0개,별 4개 =>총문자4개
		// 몇 번쨰 줄이든 공백 + 별 = 4
		// 비어있는 공백만큼 별이 생성
		for (int i = 1; i <= 4; i++) { // 최대 가질수 있는 수는 4 //몇번째 라인인지 
			for (int j = 1; j <= 4; j++) { // j 는 *를 나타냄 //한 라인에 생성된 문자(*,공백)의 수
				if (j <= (4 - i)) {  // 라인수 = *수 //
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// 왼쪽에 생성된 트리는 *만 신경쓰면 되지만, 오른쪽 트리는 공백까지 생각해야하기때문에 이중for문으로 돌아감.
		//

	}

}
