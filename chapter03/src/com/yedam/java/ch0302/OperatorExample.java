package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {   //main은 java에서만 들어감
		// TODO Auto-generated method stub
/////////부호 연산자 
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		
		byte b = 100;
//		byte result3 = -b;  // 부호 연산자를 붙이면 타입이 int이기 때문에 byte를 쓰면 오류 발생
		byte result4 = (byte)-b;  //강제 타입변환을 하면 허용
		System.out.println("result4 : "+ result4);
		//변수에 노란색주은 warning 선언은 됐지만 사용이 안돼서 알려주는것
		int result5 = -b;
		System.out.println("result5 : "+ result5);

/////////증감연산자(++,--) ❗❗피연산자 뒤에 증감연산자 붙었을 경우 조심해야함❗❗
		int x = 10;
		int y =10;
		int z; 
		System.out.println("---------------------------");
		
		x++;  // 11
		++x;  // 12
		System.out.println("x = " + x);
		
		System.out.println("---------------------------");
		
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("---------------------------");

		z = x++;  //증감연산자, 대입연산자 
		//x의 값을 z에 먼저 대입하고 나서 >> x++이 일어남 
		//증감연산자가 피연산자 뒤에 있기떄문에 대입연산자가 일어남
		//원래는 증감 연산자가 대입연산자 보다 우선적으로 일어남.
		System.out.println("z = " + z);
		System.out.println("x = " + x);

		System.out.println("---------------------------");
		
		z = ++x;
		//증감연산자가 앞에 있기때문에 증감연산자가 먼저 적용되고, x가 z에 대입
		System.out.println("z = " + z);  //z = 14
		System.out.println("x = " + x);  //x = 14
		
		System.out.println("---------------------------");
		
		z = ++x + y++;   //z 23  x 15 y 9
		//1. ++x   >>15
		//2. x+y   >>23
		//3. y++ ⭐⭐주의⭐⭐  >>9
		//4. z= x+y  >>23
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("---------------------------");
		
		x = 5;
		y = 5;
		z = x++ + --y;
		// y = 4
		// 5+4 9
		// x = 6
		// z = 9
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("---------------------------");
		
		z = --x + y++;
		// x = 5 
		// 5+4 9
		// y = 5
		// z = 9 
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("---------------------------");
		
/////////논리 부정연산자 (!)
		boolean play = true;
		System.out.println(play);
		
		play = !play;  //논리 부정연산자, 대입연산자
		//토글 : 값이 왔다갔다 할 수있음 
		System.out.println(play);
		
		play = !play; 
		System.out.println(play);
		
		
		//if문에서는 true를 찾기때문에 if문을 돌리기위해서 강제로 논리부정연산자를 사용해서 
		//false값을 확인할수있도록 함.
		boolean isOpen = true;
		if(!isOpen) {
			System.out.println("영엽시간이 종료되었습니다.");
		}else {
			System.out.println("영업중입니다.");
		}
		
/////////산술 연산자
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1+v2;
		System.out.println("result : "+result);
		
		result = v1-v2;
		System.out.println("result : "+result);
		
		result = v1*v2;
		System.out.println("result : "+result);
		
		result = v1/v2;
		System.out.println("result : "+result);
		
		result = v1%v2;  //나머지를 구하는 부호 % 
		System.out.println("result : "+result);
		
/////////비교연산자 
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = (num1 <= num2);  // =이 등호 뒤에 있어야함 
		System.out.println(">= :"+bResult);
		
		bResult = (num1 == num2); //자스에서는 ===있지만 자바에는 없음 
		System.out.println("== :"+bResult);
		
		bResult = (num1 != num2);   //같지 않은 것을 비교 
		System.out.println("!= :"+bResult);
		
		//char유형 비교//유니코드의 숫자로 비교하게됨.
		char char1= 'A'; //65
		char char2= 'B'; //66
		System.err.println("문자비교 : "+ (char1>char2));
		
		//실수형//
		int v3 =1;
		double v4 = 1.0;
		System.out.println("int VS double : "+(v3 == v4));   
		//true값이 나옴 1과 1.0은 같은 값
		
		float v5 =0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : "+ (v5 == v6));
		//정밀도가 다르기 때문에 false가 출력됨
		System.out.println("v5 : "+ v5);
		System.out.println("v6 : "+ v6);
		//똑같은 0.1이라도 자바에서는 float의 0.1과 double의 0.1은 다르게 인지
		//정수와 실수는 상관없음.
		System.out.println("float VS float : "+ (v5 == (float)v6));
		//비교할때는 동일한 타입으로 변환해서 비교하는 것이 좋음
		//사람이 볼때는 같은 값이라도 컴퓨터는 다른게 인지.
		System.out.println("----논리연산자----");
/////////논리 연산자
		int charCode ='A';  //char은 int보다 크기때문에 가능한 수식,'A'는 숫자에 맞춰서 65로 인식이 됨.
		System.out.println(charCode);
		
		//유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자 
		if((charCode >=65) && (charCode<=90)) {   //산술비교 연산자가 우선//먼저 실행하고 싶은게 있으면 괄호에 ㅓ넣으면 됨
			System.out.println("대문자");
		}//앞이 false이면 뒤에 수식 확인하지않고 false출력함.
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if((charCode >=97) & (charCode <=122)) {
			System.out.println("소문자 ");
		}else {
			System.out.println("대문자");
		}//앞이 false이더라도 뒤에 수식을 확인
		
		//유니코드 중 48보다 크고 57보다 작으면 0~9
		if((charCode >48)&&(charCode<57)) {
			System.out.println("숫자0~9");
		}
		int numValue = 6;
		if((numValue % 2 ==0) || (numValue % 3 ==0)) {
			System.out.println("2또는 3의 배수입니다.");
		}//앞이 true이면 바로 true값을 출력함
		
		if((numValue % 2 ==0) | (numValue % 3 ==0)) {
			System.out.println("2또는 3의 배수입니다.");
		}//앞이 true이더라도 뒤의 수식을 확인함.
		
		System.out.println("----복합대입연산자----");
/////////복합대입연산자 
		int resultA = 0;
		resultA += 10;  //resultA = resultA + 10 >> 10
		//등호 앞에 있는 연산자를 먼저 진행한다고 생각하면됨.
		//+=의 경우 resultA + 10을 먼저 진행하고,
		//resultA = 10을 진행하면 됨.
		System.out.println("+= : "+ resultA);
		resultA -= 5;  //resultA = resultA -5  >> 5
		System.out.println("-= : "+ resultA);
		resultA *= 3;  //resultA = resultA * 3 >> 15
		System.out.println("*= : "+ resultA);
		resultA /= 5;  //resultA = resultA / 5 >> 3
		System.out.println("/= : "+ resultA);
		resultA %= 3;  //resultA = resultA % 3 >> 0
		System.out.println("%= : "+ resultA);
		
/////////삼항연산자  ?  :  ;
		int score = 85;
		char grade = (score >90)? 'A' : 'B';  //?:; 먼저 찍어놓고 적기 
//		System.out.println(grade.getClass().getName());
//		System.out.printf("성적은 %d점이고, 등급은 '%c'입니다\n",score,grade);
		System.out.printf("성적은 %d점이고, 등급은 '%s'입니다\n",score,grade);
		//printf뒤에 항상 \n붙여 주기
		//%s은 to string이라는 의미도 있기때문에 char타입까지도 포함할 수 있음
		int age = 17;
		String message = (age > 19) ? "성인" : "미성년자" ;
		System.out.printf("나이는 %d살이고, '%s'입니다.\n",age,message);
		
		
	}

}
