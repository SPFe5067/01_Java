package edu.kh.variable.ex2;

public class PrintExemple {

	public static void main(String[] args) {
		
		//System.out.println() : 한 줄 출력용 메서드 (출력 후 줄바꿈 수행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		//System.out.print() : 단순 출력용 메서드 (출력 후 줄바꿈 X)
		System.out.print("테스트3");
		
		System.out.println(); 		//내용 없는 println() : 단순 줄바꿈 용도.
		
		System.out.print("테스트4");
		
		System.out.println(); 		//단순 줄바꿈 용도.
		//줄바꿈 여부 차이점은 있지만 괄호 내부의 내용이 그대로 출력 되는것은 같음.
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));  	//10 + 5 = 15
		
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);  	// 10 + 5 = 15
		//System.out.printf("패턴 입력." , 패턴자리에 각각 들어갈 값/변수 나열..)
		// 줄바꿈 : \n
		/*
		%d : 정수형, %o : 8진수, %x : 16진수
		%c : 문자, %s : 문자열
		%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
		%A : 16진수 실수
		%b : 논리형
		*/
		
		
		//test : 10 + 10 * 5 / 2 = 35
		int i1 = 10;
		int i2 = 10;
		int i3 = 5;		
		System.out.printf("%d + %d * %d / 2 = %d\n", i1, i2, i3, i1 + i2 * i3 / 2);
		//test - 종료

		//패턴연습
		int n1 = 3;
		System.out.printf("%d\n", n1);
		System.out.printf("%5d\n", n1); // 5칸 공간 확보 후 우측 정렬.
		System.out.printf("%-5d\n", n1); // 5칸 공간 확보 후 좌측 정렬.
		
		// 소수점 자리 제어 (반올림 처리) 연습
		System.out.printf("%f\n", 10 / 4.0); //2.500000
		System.out.printf("%.4f\n", 10 / 4.0); //2.5000
		System.out.printf("%.2f\n", 10 / 4.0); //2.50
		
		//문자, 문자열, boolean 연습.
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세용"; //참조형
		//false / 가 / 안녕하세용
		System.out.printf("%b / %c / %s\n", isTrue, ch, str); //false / 가 / 안녕하세용
		
		// \ , \t 연습
		System.out.println("\\"); // \
		System.out.println("\\o/"); // \o/
		
		// \t : tab (한 공간씩 표현 x , 한번에 공간 차지
		System.out.println("a\tb\tc\td"); // a	b	c	d
		
		//유니코드 이스케이프 연습
		System.out.println("\u0041"); // A
		//유니코드 16진수
		//65를 16진수로 표현
		//65 / 15 = 몫 4, 나머지 1 = 0041
		
		
		
	}
}
