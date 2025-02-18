package edu.kh.array.practice.service.PracticeService;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class PracticeTest {

	Scanner sc = new Scanner(System.in);
	
	
	public void test1() {
		
/*
 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

	[실행 화면]
	1 2 3 4 5 6 7 8 9
	짝수 번째 인덱스 합 : 25
 */
		int[] a = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (i+1);
		}
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i <a.length;i++) {
			if((i%2) == 0) {
				sum += (a[i]);
			}
		}
		System.out.println("짝수 번째 인덱스 합 : " + (sum));
		
		
		
		
		
		
		
	}
	public void test2() {
/*
 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

[실행 화면]
9 8 7 6 5 4 3 2 1
홀수 번째 인덱스 합 : 20
 */
		int[] a = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (i+1);
		}
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < a.length; i++) {
			if(i%2 != 0) {
				sum += (a[i]);
			}
		}
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
		
		
		
		
	}
	public void test3() {
/*
 * 메소드 명 : public void practice3(){}
사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

[실행 화면]
양의 정수 : 5
1 2 3 4 5
 */
		
		System.out.print("배열 크기 할당 : ");
		int a = sc.nextInt();
		
		int[] q = new int[a];
		
		System.out.println("양의 정수 : " + a);
		
		for(int i = 0; i < a; i++) {
			q[i] = (i+1);
		}
		System.out.println(Arrays.toString(q));
		
		
	}
	public void test4() {
/*
 * 정수 5개를 입력 받아 배열을 초기화 하고
검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

[실행 화면 1]
입력 0 : 5
입력 1 : 8
입력 2 : 9
입력 3 : 10
입력 4 : 4
검색할 값 : 8
인덱스 : 1

[실행 화면 2]
입력 0 : 5
입력 1 : 8
입력 2 : 9
입력 3 : 10
입력 4 : 4
검색할 값 : 1
일치하는 값이 존재하지 않습니다.		
 */
		
		System.out.print("1번째 정수 입력 : ");
		int a = sc.nextInt();
		int[] q = new int[5];
		q[0] = a;
		
		System.out.print("2번째 정수 입력 : ");
		int b = sc.nextInt();
		q[1] = b;
		
		System.out.print("3번째 정수 입력 : ");
		int c = sc.nextInt();
		q[2] = c;
		
		System.out.print("4번째 정수 입력 : ");
		int d = sc.nextInt();
		q[3] = d;
		
		System.out.print("5번째 정수 입력 : ");
		int e = sc.nextInt();
		q[4] = e;
		
		System.out.print("검색할 값 : ");
		int p = sc.nextInt();
		
		for(int i = 0; i < (a); i++) {
			
			if(q[i] == p) {
				
				System.out.println("인덱스 : " + q[i]);
				
				
			}else{System.out.println("불일치");}
				
			}
		
		
		}
	public void test5() {
/*
 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
 * 검색할 문자가 문자열에 몇 개 들어가 있는지
 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

[실행 화면]
문자열 : application
문자 : i
application에 i가 존재하는 위치(인덱스) : 4 8
i 개수 : 2		
 */
		System.out.print("문자열 입력 : ");
		String a = sc.nextLine();
		
		char[] b = new char[a.length()];
		
		for(int i = 0; i < a.length(); i++) {
			b[i] = a.charAt(i);
		}
		
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.println(a + "에 " + c + "가 존재하는 위치(인덱스) : ");
		
		for(int o = 0; o < a.length(); o++) {
			if(b[o] == c) {
				System.out.print(o + " ");
				
				count++;
			}
		}System.out.println();
		System.out.println(c + "개수 : " + count);
	
		
		
		
		
		
		
		
	}
	public void test6() {
/*
 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

[실행 화면]
정수 : 5
배열 0번째 인덱스에 넣을 값 : 4
배열 1번째 인덱스에 넣을 값 : -4
배열 2번째 인덱스에 넣을 값 : 3
배열 3번째 인덱스에 넣을 값 : -3
배열 4번째 인덱스에 넣을 값 : 2
4 -4 3 -3 2
총 합 : 2
 */
		int sum = 0;
		
		System.out.print("정수 :");
		int p = sc.nextInt();
		int[] q = new int[p];
		
		for(int i = 0; i < q.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int a = sc.nextInt();
			
				q[i] = a;
			
				sum += a;
			
		}
		System.out.println(Arrays.toString(q));
		System.out.println("총 합 : " + sum);
		
		
		
		
	}
	public void test7() {
/*
 * 주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.

[실행 화면]
주민등록번호(-포함) : 123456-1234567
123456-1******	
 */	
		
		
		System.out.print("주민등록번호(-포합) : ");
		String a = sc.nextLine();
		String q = a;
		
		char[] b = new char[q.length()];
		
		for(int i = 0; i < (a.length()-6); i++) {
			b[i] = a.charAt(i);
		
			
		}
		for(int i = 9; i < a.length(); i++) {
			b[i] = '*';
		}
		
		System.out.print(b);
		
		
		
		
		
	}
	public void test8() {
	/*
	 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
다시 정수를 받도록 하세요.

[실행 화면]
정수 : 4
다시 입력하세요.
정수 : -6
다시 입력하세요.
정수 : 5
1, 2, 3, 2, 1	
	 */
		
		int sum = 0;
		int sum2 = 0;
		
		System.out.print("정수 : ");
		int a = sc.nextInt();
		
		int[] q = new int[a];
		
		if(a < 3 || a%2 == 0) {
			System.out.print("다시 입력하시오.");
		}else {
			for(int i = 0; i < a; i++) {
				sum++;
				q[i] += sum;
			
			
				
			}	for(int o = ((a/2) + 1); o < a; o++) {
				sum2++;
				sum2++;
				q[o] -= sum2;
			}
			System.out.print(Arrays.toString(q));
		
		
		
		
		
		
		
		
		
	}





}
	public void test9() {
/*
 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.

[실행 화면]
발생한 난수 : 9 7 6 2 5 10 7 2 9 6		
 */
		
	
	int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
		
	for(int i = 0; i < a.length; i++) {
		int random = (int)(Math.random() * 10 + 1);
		a[i] = (int)random;
		
	}System.out.print(Arrays.toString(a));
		
		
		
		
		
	}
	public void test10() {
/*
 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
1~10 사이의 난수를 발생시켜 배열에 초기화 후
배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

[실행 화면]
발생한 난수 : 5 3 2 7 4 8 6 10 9 10
최대값 : 10
최소값 : 2
 */
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < a.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			a[i] = (int)random;

		}
		int max = a[0];
		int min = a[0];
		System.out.println("발생한 난수 : " + Arrays.toString(a));
		for(int i = 0; i <a.length; i++) {
			if(a[i] > max ) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		}
	public void test11() {
/*
 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

[실행 화면]
4 1 3 6 9 5 8 10 7 2
 */

		int a[] = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			a[i] = (int)random;
				
			for(int o =  0; o < i; o++) {
				
				if(a[o] == random) {
					i--;
					break;
					
				}
		}
	}System.out.println(Arrays.toString(a));
		
		
		
	}
	public void test12() {

		int[] a = new int[6];
		
		for(int i = 0; i < a.length; i++) {
			int random = (int)(Math.random()*45+1);
			a[i] = random;
			for(int o = 0; o < i; o++) {
				if(random == a[o]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
	}
	public void test13() {
/*
 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
문자의 개수와 함께 출력하세요.
 */		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false;
					break;
				}
				
				
			}
			if(flag) {
				if(i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
			
		}
		System.out.println();
		System.out.println("문자의 갯수 : " + count);
		
		
		
	}
	public void test14() {
/*
 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
 */
/* 1. 첫 배열 크기 지정
 * 
 * 2. 첫 배열에 저장할 문자열 입력받기
 * 
 * 3.반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
 * 
 * 
 */
		
		System.out.print("배열의 크기 입력 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		
		String[] arr = new String[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.println("더 값을 입력하시겠습니까? (y/n)");
			char ch = sc.next().charAt(0);
			
			if(ch == 'y' || ch == 'Y') {
				System.out.println("더 입력하고 싶은 갯수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + addSize];
				
				for(int i = 0; i < newArr.length; i++) {
					if(i<arr.length) {
						newArr[i] = arr[i];
					}else {
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
				
				
				
			}else if(ch == 'n' || ch == 'N') {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	
		
		
		
		
		
		
		
		
		
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	





