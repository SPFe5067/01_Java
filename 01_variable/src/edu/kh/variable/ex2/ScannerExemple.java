package edu.kh.variable.ex2;

import java.util.Scanner;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문.
// import java.util.Scanner : java.util 패키지에서 Scanner Class(설계도) 수입.

public class ScannerExemple {

	public static void main(String[] args) {
		
		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할.
		
		//Scanner 객체 생성
		//-> 내 프로그램 안에 스캐너라는 기계를 새로 만드는 것.
		Scanner sc = new Scanner(System.in);
	//  import 구문이 없으면 설계도가 없는 것과 같기에 기계를 만들 수 없음.
	// -> 오류 확인될 시 적절히 import 작성하여 오류 해결.
		
		System.out.print("정수 1 입력 : ");
		int itemSelect1 = sc.nextInt(); // sc.nextInt - 정수를 입력받는 것.
		// 스캐너를 통해 입력받은 정수를 itemSelect 변수에 대입한 것.
		
		
		//System.out.println(itemSelect1);
		
		System.out.print("정수 2 입력 : ");
		int itemSelect2 = sc.nextInt();
		
		System.out.print("안녕하세요 라고 입력하시오 : ");
		String itemName1 = sc.next();
		
	}
}
