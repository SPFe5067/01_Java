package edu.kh.variable.ex1;

public class VariableExam1 {
	// 생성된 .java 파일과 class 오른쪽에 작성된 클래스명(이름)은 같아야 함.
	public static void main(String[] args) {
		
		//변수 미사용시
		System.out.println(2 * 3.141592653589793 * 5); //원의 둘레
		System.out.println(3.141592653589793 * 5 * 5);  // 원의 넓이
		System.out.println(3.141592653589793 * 5 * 5 * 20); // 원기둥의 부피
		System.out.println(4 * 3.141592653589793 * 5 * 5); // 구의 겉넓이
		
		
		//3.14...는 반복사용되기에 해당 값을 변수로 저장함.
		
		//변수 사용시
				
		double pi = 3.141592653589793; // 원주율
	//  변수 이름 =(대입연산자) 값 ;	
		int r = 5; // 반지름
	//	정수 이름 =(대입연산자) 값 ; 
		int h = 20; // 높이

		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
		
		
	/* 변수 (Variable)
	 * - 메모리(RAM)에 값을 기록하는 공간
	 * -> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.
	 * 
	 * - 변수는 여러 종류가 존재한다 (저장되는 값의 형태, 크기가 다름) *double, int 등
	 * 
	 * 
	 * 변수 사용의 장점
	 * 1. 가독성 증가
	 * 2. 재사용성 증가(한번 만든 변수를 계속해서 사용)
	 * 3. 코드의 길이 감소
	 * 4. 유지보수성 증가(코드 수정이 간단해짐)
	 */
	
		
	}
	
	
}
