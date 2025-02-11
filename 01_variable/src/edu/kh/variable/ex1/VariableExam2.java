package edu.kh.variable.ex1;

public class VariableExam2 {

	public static void main(String[] args) {
		
		/* 자바의 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 
		 * 정수형 : byte(1), short(2), int(4), long(8)
		 * 실수형 : float(4),double(8)
		 * 
		 * 문자형 : char(2) - 유니코드 문자체계
		 * 문자열 : String(참조형)
		 *
		 */
		
		// 변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입 : 변수에 값을 대입 하는 것.
		
		boolean booleanData; //-> 변수의 선언
	// (논리형) (변수명) ;
	// (메모리에 논리값(참/거짓)을 저장할 공간을 1byte 할당하고) / (할당 된 공간의 이름을 booleanData라고 정하겠다.)
		
		booleanData = true;
	// booleanData 변수에 true 논리값 (대입)집어넣기
		
		System.out.println("booleanData : " + booleanData);
				
				
				
				
		byte byteNumber = 127;
	//(메모리에 정수값을 저장할 공간을 1byte 할당하고) / (할당 된 공간의 이름을 byteNumber라고 정하겠다.
	// =(선언된 byteNumber 변수에 처음으로(초기값) 123을 넣겠다.
	// --> 초기화 : 처음 변수에 값을 대입.
		
		short shortNumber = 32767;
		
	// 정수 자료형 기본형 ! int (short, byte 는 옛날코드의 잔재이다(거의 사용하지 않는다.))
		int intNumber = 2147483647;
	// (자료형) (변수명) (대입연산자) (리터럴;)
		//프로그래밍에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로도 표현함.
		//리터럴 = 변수에 대입되거나 작성되어지는 값 자체.
		//자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000l;
		//long의 경우 int byte를 오버하는 숫자를 사용할 경우 뒤에 l or L 을 붙여줘야한다.
		//리터럴 값 자체를 int로 인식함. l or L 을 사용하여 long 리터럴 값으로 바꿔준다.

		float floatNumber = 1.2345f;
		//float의 경우 소수숫자를 인식하지 못하기에 f or F를 붙여줘야한다.
		//리터럴 값 자체를 double로 인식함. f or F 를 사용하여 float 리터럴 값으로 바꿔준다.
		
		double doubleNumber = 3.141592;
		//double이 실수형 중에서 기본형
		//리터럴 표기법이 없는 실수는 double로 인식.
		//d or D 라는 리터럴 표기법을 보유하고 있기는 하다.
		
		//문자형(char) 리터럴 표기법 : ''
		//문자열(String) 리터럴 표기법 : ""
		char ch = 'A';
		char ch2 = 65;
		
		System.out.println("ch :" + ch);
		System.out.println("ch2 : " + ch2);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유.
		 * -컴퓨터에는 문자표(유니코드)가 존재함
		 *  숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 *  'A' 문자 그대로 대입되면 변수에 숫자 65으로 변환되어 저장
		 *  변수에 65 라는 숫자를 저장하는 것도 가능함.
		 */
		
		//변수 명명 규칙
		
		//1. 대소문자 구분함, 길이제한은 없음.
		int abcdefghijklmnopqrstuvwxyz1234567890;
		int Abcdefghijklmnopqrstuvwxyz1234567890; //a -> A
		//대소문자를 구분하기에 서로 엄연히 다르다고 인식함.
		
		//2. 예약어는 사용하면 안됨. - 예약어 = (자바개발자들이 뜻이 이미 있는 단어들 %class, package, byte, public, int, short 등)
		
		//3. 숫자로 시작하면 안됨.
		
		//4. 특수문자는 ‘_’와 ‘$’만을 허용한다.
		//	 자바는 카멜표기법 사용
		// 	 _ 작성 표기법은 DB에서 사용
		// 	 자바의 상수에서 사용 ex) MEMBER_NAVE
		
		//5. 시작은 소문자 이후는 대문자를 사용(카멜케이스)하는 것이 관례이다.
		//ex) helloWorld, userName, appleBanana 등
		
		//6. 변수명은 언어를 가리지 않는다.(하지만 영어를 쓰자.)
		int 숫자 = 1;
		System.out.println(숫자);
		
		//===========================================================
		//상수
		//항상 같은 수
		//변수의 한 종류이기는 함.
		//한번 값이 대입되면 다른 값을 재대입 할 수 없음.
		//자료형 앖에 final 키워드를 작성.
		//상수의 명명규칙 : 모두 대문자로, 여러단어 작성시 _ 사용.
		
		//상수를 사용하는 경우
		//-변하면 안되는 고정된 값을 저장할 때
        //-특정한 값에 의미를 부여할 때
		final int MIN_AGE = 1;
		final int MAX_AGE = 100;
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		//형변환(Casting(캐스팅))
		//자료형을 바꾸는 것.(boolean 제외)
		//같은 종류의 자료형만 대입,계산이 가능함.
		System.out.println(1 + 1.3); //int 1 + doubel 1.3 => double 1.0 + doubel 1.3 (자동형 변환)
		System.out.println('A' + 1); //char 'A' + int 1 => int 65 + int 1 
		System.out.println(3.14f + 1); //float 3.14f + int 1 => float 3.14f + float 1.00f
		
		//-자동 형변환 (값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환함)
		// byte - short/char - int - long - float - double
		
		//-강제 형변환 (값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환함)
		//데이터의 손실이 일어날 것을 알고도 강제로 변환하는 것.
	}
}
