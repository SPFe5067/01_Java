package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExemple4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextint() 사용 후 nextLine 을 사용시 문제점.
		
		System.out.print("nextInt() 입력 : ");  //정수값 입력
		int intNum = sc.nextInt();				//->정수값과 엔터(\n)가 입력버퍼에 들어감.
		//=> nextInt() 는 정수값만을 (공백) 수집 => 입력버퍼에는 \n만 남는ㄷ상태.
		
		sc.nextLine(); // 입력버퍼에 남은 (\n)개행문자 제거용
		
		System.out.print("nextLine() 입력 : ");
		String word = sc.nextLine();  //공백까지 포함(개행 포함)
		// nextLine의 경우 입력버퍼에 남아있는 \n을 수집후 종료
		
}
}
