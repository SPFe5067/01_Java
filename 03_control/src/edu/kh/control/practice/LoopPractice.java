package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void test1() {
	/*
	 * 메소드 명 : public void practice1(){}
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

	ex.
	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
	1 2 3 4 1 이상의 숫자를 입력해주세요.
	 */
		
		System.out.print("수를 입력하세요. : ");
		int q = sc.nextInt();
		
		String result = "";
		
		if(q < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1; i <= q; i++) {
				
				result += i + " ";
			}System.out.print(result);
		}
		
	}
	public void test2() {
		System.out.print("입력 : ");
		int a = sc.nextInt();
		
		String result = "";
		
		if(a < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = a; i >= 1; i--) {
				result += i + " ";
			}System.out.println(result);
		}
	}
	public void test3() {
		/*
 * 메소드 명 : public void practice3(){}
   1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

   ex.
   정수를 하나 입력하세요 : 8
   1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		
		int sum = 0;
		String result = "";
		int count = 0;
		
		for(int i = 1; i <= (a-1); i++) {
			result += i + " + ";
			sum += i;
			
		}System.out.println(result + a + " = " + sum );
		
		
		
		
	}
	public void test4() {
/*
 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
  만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

  ex.
  첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
  두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
  4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.		
 */
		System.out.print("첫번째 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int b = sc.nextInt();
		
		String result = "";
		
		if(a < 1 || b < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else if(a < b){
			for(int i=a; i <= b; i++) {
				result += i + " ";
			}System.out.println(result);
		}else {
			for(int i=b; i <= a; i++) {
				result += i + " ";
			}System.out.println(result);
		}
		
		
		
	}
	public void test5() {
/*사용자로부터 입력 받은 숫자의 단을 출력하세요.

ex.
숫자 : 4
===== 4단 =====
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
 */
		
		
		System.out.print("숫자 : ");
		int a = sc.nextInt();
		
		int sum = 0;
		
		System.out.println("====== "+ a + "단 " + "=====");
		
		for(int i = 1; i <= 9; i++ ) {
			sum += a;
			System.out.printf("%d * %d = %d \n", a, i, sum);
			
		}
		
		
		
	}
	public void test6() {
/*
 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.

숫자 : 4 숫자 : 10
===== 4단 ===== 2~9 사이 숫자만 입력해주세요.
===== 5단 =====
===== 6단 =====
===== 7단 =====
===== 8단 =====
===== 9단 =====
(해당 단의 내용들은 길이 상 생략)
 */
		System.out.print("숫자 : ");
		int a = sc.nextInt();
		
	
		int sum = 0;
		int count = a;
		
		if(a > 9 || a < 0) {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
			
		}else {
			for(int i = a; i <= 9; i++) {
				System.out.println("=========== " + i + "단 " + "===========" );
				
				for(int w = 1; w <= 9; w++) {	
					sum += a;
					System.out.printf(" %d * %d = %d \n",count , w, (count * w));
				}
				sum += a;
				count++;
				
				
			}
		}
		
		
	}
	public void test7() {
/*다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
**
***
****
 */
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		String result = "*";
		
		for(int i = 1; i <= a; i++) {
			System.out.printf("%s \n", result);
			result += "*";
		}
		
	}
	public void test8() {
		
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		for(int p = 1; p <= a; p++){
			
			for(int i = p; i <= a; i++) {
			
				if(i <= a) {System.out.print("*");
			
			
			}
			
			}System.out.println();
		}
		
	}
	public void test9() {
/*
 다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
   *    -> 1행  (공백 몇개 필요? 3 ) 
  **    -> 2행  (공백 2개 필요)
 ***    -> 3행  (공백 1개 필요)
****    -> 4행   (공백 0개 필요)
 
 *  input = 4 
 *  
 *  4 - 현재행 = 공백갯수
 *  // 4  -  1   =  3
 *  // 4  -  2   =  2
 *  // 4  -  3   =  1
 *  // 4  -  4   =  0
 *
 */
		
		String str = "*";
		
		System.out.print("수 입력");
		int a = sc.nextInt();
		
		for(int b = 1; b <= a; b++) {
			for(int c = b+1; c <= a; c++) {
				System.out.print(" ");
			}System.out.print(str);
			str += "*";
			System.out.println();
		}
			
		
		
		
			
		}

	public void test10() {
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		String str = "*";
		
		for(int i = 1; i <= num; i++) {
			System.out.print(str);
			str += "*";
			System.out.println();
			
		}
		
		for(int w = 2; w <= num; w++) {
			for(int e = w; e <= num; e++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	
	
	public void test13() {
		
		
/*
 * 1부터 사용자에게 입력 받은 수까지 중에서
1) 2와 3의 배수를 모두 출력하고
2) 2와 3의 공배수의 개수를 출력하세요.

* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
모두 나머지가 0이 나오는 수

ex.
자연수 하나를 입력하세요 : 15
2 3 4 6 8 9 10 12 14 15
count : 2		
 */
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int one = sc.nextInt();
		
		
		String result = "";
		int count = 0;
		
		for(int i = 1; i <= one; i++) {
			if(i%2 == 0 || i%3 == 0) {
				result += i + " ";
			} if (i%2 == 0 && i%3 == 0) {
				count++;
			}
		}System.out.println(result);
		System.out.println("count : " + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}