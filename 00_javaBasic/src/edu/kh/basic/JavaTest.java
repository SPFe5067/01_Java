package edu.kh.basic;


// class : 자바 코드가 작성되는 영역
public class JavaTest {
	//main 메서드 : 자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 구문
	public static void main(String[] args) {
		// 실행 단축키 : ctrl + f11
		System.out.println("Hello World.");
		System.out.println("저녁 뭐 먹을까?");
		System.out.println("12345");
		System.out.println("黃人鐵");
		//syso 작성 후 ctrl + space -> System.out.println 자동완성
		//ctrl + alt + 방향키(위아래) = 해당 방향으로 지정한 줄을 복사
		System.out.println("12345");
		
		System.out.println("1 + 2"); // = 1 + 2
		System.out.println(1 + 2);  // = 3
		System.out.println(1 - 2);  // = -1
		System.out.println(1 * 2);  // = 2
		System.out.println(2 / 2);  // = 1
		System.out.println(2 % 2);  // = 0(나누기 공식의 나머지를 출력)
		
		System.out.println("1 + 2 =" + 3);  // = 0(나누기 공식의 나머지를 출력)
								// + <- 는 문자열에 이어쓰는 용도이다.
		System.out.println("1 + 2 =" + (1 + 2));
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		// 자바는 사칙연산으 ㅣ우선 순위를 그대로 따른다.
		// -> 우선 계산을 원하면 () 를 사용한다.
		
		/* 	+ 기호의 역할
		 * (숫자 + 숫자) = 덧셈 연산 결과
		 * ("문자열") + 숫자 or ("문자열") + ("문자열")  = 이어쓰기 역할
		 */
	}
	
}
//해당 주석은 자택에서의 코드변경을 했을 시의 업로드 되는지를 확인하기 위한 테스트 문구. [git test.]
//해당 주석은 자택에서의 코드변경을 했을 시의 업로드 되는지를 확인하기 위한 두번째 테스트 문구. [git test.]