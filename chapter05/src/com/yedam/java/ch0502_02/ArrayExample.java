package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/////////다차원배열 교재 190  >>어떻게 내부에 있는 값을 가지고 올지 항상 생각하기☆★☆★ 

////////방법1) 변수 사용		
		int[][] mathScores = new int[2][3]; // >> 크기를 먼저 지정해줌
		// int[]가 값인 배열(자기가 가지고있는 int배열의 크기>> 뒤에있는 배열 [3]//값으로 가진 배열을 몇개 가지고 있는지 >> 앞에 적음 [2]
		// >>>>크기가 3인 int배열의 개수 2개

		for (int i = 0; i < mathScores.length; i++) { // mathScores.length : 2 >>index 0,1
			System.out.println("mathScores [" + i + "]"); // int 배열인 mathScore의 개수
			int[] mathScore = mathScores[i]; // >>내부변수를 변수에 담는 것// type은 int

			// mathScores의 내부 배열을 출력시키는 이중for문
			for (int j = 0; j < mathScore.length; j++) { // mathScore.length : 3 >>index 0,1,2
				System.out.println("\t mathScore [" + j + "] :" + mathScore[j]);
			}
		}
//		mathScores [0]
//			 mathScore [0] :0
//			 mathScore [1] :0
//			 mathScore [2] :0
//		mathScores [1]
//			 mathScore [0] :0
//			 mathScore [1] :0
//			 mathScore [2] :0
		System.out.println("==============구분선==============");
////////방법2) 변수 사용 X	mathScores만 사용해서 출력
//			int[] mathScore = mathScores[i]; // 방법1의 이 문장이 삭제 된 방법
		for (int i = 0; i < mathScores.length; i++) { // mathScores.length : 2 >>index 0,1
			System.out.println("mathScores [" + i + "]"); // int 배열인 mathScore의 개수

			for (int j = 0; j < mathScores[i].length; j++) { // mathScore.length : 3 >>index 0,1,2
				System.out.println("\t mathScores[" + i + "] [" + j + "] :" + mathScores[i][j]);
			}
		}
		// mathScores[i].length 의 i를 이해해야함. int배열의 크기가 같기떄문에 사용가능함
		
		System.out.println("==============구분선==============");

		// 크기가 다른 배열을 선언 하는 방법 /하나의 배열안에 값으로 주어지는 것이 배열임
		int[][] scoreList = {   
								{ 86, 65 }, 
								{ 58, 95, 73 } 
							};
		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			for (int j = 0; j < scoreList[i].length; j++) {  
				//scoreList[i].length꼭 [i]를 넣어서 동적으로 움직이도록 해줘야함
				//최대로 가질수 있는 index는 1 [2]를 넣으면 크기보다 index가 크기떄문에 에러발생
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] englishScore = new int[2][]; //크기만 주고 싶을때는 이렇게도 가능함. 크기는 필수값ex)서랍장을 만들때 서랍장을 만들어 준다고 생각하면됨.
		englishScore[0] = new int[3];  //서랍을 사간 사람이 서랍장을 3칸으로 만들수도, 2칸으로 만들수도 있다는것! 유동적으로 줄 수 있음 
		englishScore[1] = new int[2];
		for(int i = 0; i<englishScore.length;i++) {
			for(int j =0 ;j<englishScore[i].length;j++) { //안쪽 for문의 조건식 항상 주의하기 [i]꼭!!!!!!
				System.out.println("englishScore["+i+"]["+j+"] :"+englishScore[i][j]);
			}
		}

		System.out.println("==============구분선==============");
		
////////교재 194

		String[] strArray = new String[3];
		strArray[0] = "Java";	//"Java"라는 값을 주면 힙영역에 객체가 만들어짐 //strArray변수는 스택영역
		strArray[1] = "Java";  //
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] ==strArray[1]);  //true
		System.out.println(strArray[1] ==strArray[2]);  //false
		System.out.println(strArray[1].equals(strArray[2]));  //true
		
		System.out.println("==============구분선==============");
		
/////////for문으로 배열 복사 (작은 그릇에있던거 큰 그릇으로 옮기기 )
		// >> 첫번째 부터 값을 집어넣을떄는 편하게쓸수있지만 2번떄부터 값을 넣거나 n번쨰에 넣기에는 어려움이있음
		int[] oldIntAry = {1, 2, 3};  //old를 new로 넘겨줌
		int[] newIntAry = new int [5];
		for (int i = 0 ; i < oldIntAry.length ; i++) { 
			//조건식에는 인덱스가 가질수있는 최대 크기
			//최대 크기를 5로 잡으면 oldIntAry가 1,2,3을 넣고 남는 3,4의 크기를 감당을 하지 못하기때문에
			//크기가 작은 배열을 기준으로 해야함
			newIntAry[i] = oldIntAry[i];
		}
		for(int i = 0;i<newIntAry.length;i++) {
			System.out.println(newIntAry[i]);
			//new에는 old에 있는 값을 index0부터 돌면서1,2,3이 들어가고 , 남은자리(3,4)에는 디폴트 값인 0,0 이 들어감 
		}

		System.out.println("==============구분선==============");

/////////System.arraycopy()사용해서 배열복사 :1차원배열에 사용한다고 생각하면 됨. //잘쓸일은 없지만 알아두기 
		//2차원 배열을 옮길수는 있지만 수식이 여러번 들어감
		String[] oldStrAry = {"java","array","copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		//String배열은 초기값은null.
		for(int i = 0;i<newStrAry.length;i++) {
			System.out.println(newStrAry[i]);
		}
		
		System.out.println("==============구분선==============");

/////////향상된 for문  
		//배열의 전체의 값을 한번에 계산할떄 사용하기 좋음// 단순 순환, 인덱스 필요없는 경우에 유용
		int[] scores = { 95, 71, 84, 93, 87};
		int sum = 0;
//		int index = -1;
		for ( int score : scores ) {
			sum += score;
//			System.out.println(score);
//			System.out.println("인덱스 : "+ ++index);  >>이렇게 사용할거면 굳이 향상된 for문을 사용할 필요가 없음.
		}
		System.out.println("점수의 총합 : " +sum);
		double avg = (double)sum / scores.length;  //scores가 들어가는 이유는 score는 for문 안에서만 살아있음 
		System.out.println("점수의 평균 : " +avg);
		
		
		
		
		
	}

}
