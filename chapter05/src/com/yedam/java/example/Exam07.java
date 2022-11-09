package com.yedam.java.example;

//import java.net.MulticastSocket;
import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 로또 번호를 예측하는 프로그램 = 6개
//		int num1 = (int)(Math.random()*45)+1;

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[] numList = null;
		int count = 0; // 경우에 따라인덱스의 증감연산자가 앞에 올수도 뒤에 올수도 인덱스 일때는 -1 카운트(몇번째)일때는 0

		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.새로고침 | 2.번호 예측 | 3.기존번호삭제 | 4.번호출력 | 5.분석 | 6.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 로또 담을수있는 배열 초기화
				numList = new int[6];
				count = 0;
			} else if (selectNo == 2) {// 1~45중에 랜덤한 값을 하나씩 가져옴 // 2번은 6번만 돌수있음
				if (count < numList.length) { // 개수를 넘어설 것에대해 미리 제한을 거는것. //6이되면 채울수 없기때문에 else로 빠짐.
					int num = (int) (Math.random() * 5) + 1;
					// count는 무한정 늘어날수없기 때문에 if문이 한번 더 들어감
					numList[count++] = num; // count가 인덱스의 역할도 하면서 현재 몇개가 카운트 됐는지도 알수있음.
					System.out.println("현재 가져 온 개수 : " + count);
				} else {
					System.out.println("더이상 가져올 수 없습니다.");
				}

			} else if (selectNo == 3) {// 기존의 값 중에 가장 최근 값을 삭제(하나만)
				// count = 6 (index상으로는 5가지의 값이 들어있음 => index = count -1
				numList[--count] = 0;
				// []안에는 기존의 count의 값에서 작은 값을 넣어줘야함//
				// 기존의 6이었던 값을 5로 감소 시켜야 최근의 값을 삭제할수있음 (count-1)과같은 의미임
				// int는 삭제가 안되기떄문에 무의미한 값을 넣으면 됨. 기존의 값을 0으로 대체
				System.out.println("현재 가져 온 개수 : " + count);

			} else if (selectNo == 4) {// 배열의 값을 전부 출력
				System.out.println("현재 가지고있는 수의 개수 : " + count);
				for (int i = 0; i < count; i++) { // i<count 무의미한 0을 출력하지 않게하기위해 현재있는 개수만 출력시키기 위해
					System.out.print(numList[i] + " ");
				}
				System.out.println();
			} else if (selectNo == 5) {// 중복유무와 중복된 값이 몇번 중복 되었는지, 중복되지않았으면 6개의 값이 있어야함. //실질적으로 있는 값에 대해 처리
				int[] list = new int[45]; // 새로운 배열을 만들고 가질 수 있는 범위를 크기로 줌. //list - 각각의 수가 몇개가 있는지
				// 총 45개의 후보를 두고 6명이 투표를 한다고 생각하면됨 >>list는 선거 후보명단이라고 생각하면됨.

				// 개표
				for (int i = 0; i < count; i++) {// numList.length사용가능 > 0이라는 값을 카운트 하지않기떄문
					int index = numList[i] - 1; // index를 구함
					list[index]++; // 여기까지 투표완
				}

				// 개표상황을 정리해서 보여주는것 (몇명이 중복투표를 했는지 보여주는것)
				boolean isChecked = false; // >> 중복여부를 확인해줄 것. false는 중복값없는거
				for (int i = 0; i < list.length; i++) { // list의 최대값만큼 반복문을 돌림
					if (list[i] <= 1) {
						continue;
					} // 0은 투표가 안된 상태, 1은 자기자신만 있는 상태이기때문에 자기자신만 있어야함.
						// >> 1보다 작으면 다 날리면 됨.
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i + 1), list[i]);// (i+1)인덱스의 값 +1/
					isChecked = true; // >> 중복값있는것
				}
				if (!isChecked) { // 내가 원하는 값이 되면 true값을 출력하게 됨
					System.out.println("중복 값이 존재하지 않습니다.");
				}
			} else if (selectNo == 6) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("정해진 번호가 입력되지 않았습니다.다시입력하세요.");
			}

		}

		// numList가 가질수있는 수는 1~45>> index로 사용이 가능함. => numList -1 를하면 index랑 같은 의미가 됨
		// index는 0~44
		// 다 list배열 안에 속함.
		// 3 1 1 5 4 5 현재 numlist가 갖고있는 값//// list(length 45) >>0~44
		// 2 0 0 4 3 4 (-1한 값) >>인덱스화시킴 인덱스 번호 [2][0][0][4][3][4] >>[0]과[4]는 두개씩 나옴>>
		// !중복!
		// 200434에 +1 을 하면 배열의 값이 됨 이 성질을 이용.
		// 첫번째 for문 각 값이 몇개씩 있는지 확인
		// 두번째 for문
	}

}
