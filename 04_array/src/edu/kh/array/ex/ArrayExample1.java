package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

	/*배열(Array)
	-같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	묶여진 변수들은 하나의 배열명으로 불러지고
	구분은 index를 이용함(index는 0부터 시작하는 정수)
	*/
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		//변수 vs 배열
		
		//변수 선언
		int a;
		//stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		//그 안에 a 라는 이름을 부여했다.
		
		//변수 대입
		a = 10;
		//생성된 a이라는 변수 공간에 10이라는 정수값 대입.
		
		//변수 사용
		System.out.println(a);
		// a가 작성된 자리에 a에 저장된 값을 읽어와서 출력.
		
		//=============================
		
		//배열 선언
		int[] arr;
		//stack 영역에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr라는 공간을 부여한다.
		//**해당 변수는 참조형으로 주소값만을 저장할 수 있다.
		
		//배열 할당
		arr = new int[3];
		//new : "new 연산자"라고 하며
		// 		Heap 메모리 영역에 새로운 공간(배열,객체)를 할당
		
		//int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		//new int[3] : heap 영역에 int 형 변수 3칸짜리 int[] 을 생성(할당)
		
		//arr = new int[3];
		//int[]  int[]   -> 같은 자료형 == 연산가능
		
		System.out.println("arr : " + arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//Heap 영역에 저장된 공간은 절대 비어있을 수 없다
		//JVM 기본값이 저장되어 있다
		//boolean : false
		//나머지 : 0
		//참조형 : Null
		
		
		//배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//배열 사용
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	public void ex2() {
		//배열 선언 및 할당
		int[] arr = new int[4];
		//int[] arr = {100, 250, 500, 1000};
		//JVM 기본값에 의해 0으로 초기화 되어있음.
		
		arr[0] = 75;
		arr[1] = 250;
		arr[2] = 500;
		arr[3] = 1000;
		//arr[4] = 2500; - 없는 인덱스 번호인 4번에 입력했기에 문제.
		//코드에서 빨간줄 에러 : 컴파일 에러
		//실행중에 발생하는 에러 : 런타임 에러
		System.out.println(Arrays.toString(arr));
		
		
		//배열과 for문
		//배열의 길이  (몇 칸 인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			 // i = 0, 1, 2, 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
		//선언과 동시에 초기화하는 방법
		int arr2[] = {1, 2, 3, 4, 5};
		//Stack 영역에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr2 라는 이름 부여
		//Heap 메모리 영역에 int 5칸짜리 int[]를 생성하고
		//0번 인덱스부터 각 요소에 1~5까지 초기화함(대입)
		//int[] 주소값을 arr2 참조변수가 참조함.
		
		System.out.println(Arrays.toString(arr2));
		
		
	}
	public void test1 () {
		//5명의 키 (cm)를 입력받고 평균 구하기
		//1번 키 입력 : xxx.x
		//2번 키 입력 : xxx.x
		//...
		//5번 키 입력 : xxx.x
		//평균 : xxx.x
		
		double[] h = new double[5];
		//double[] 자료형 참조변수 h를 Stack 영역에 생성하고
		//height에 Heap 영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입.
		
		
		//배열의 각 요소에 값 대입하는 용도의 반복문.
		for(int i = 0; i < h.length; i++) {
			System.out.print((i+1) + " 번 키 입력 : ");
			h[i] = sc.nextDouble();
			//h[0] = xxx.x
			//h[1] = xxx.x
			//...
			//h[4] = xxx.x
		}
		System.out.println();
		
		double sum = 0;
		
		//배열의 각 요소에 대입되어 있는 값을 사용하는 용도의 반복문.
		for(int o = 0; o < h.length; o++) {
			sum += h[o];
			
		}
		
		System.out.printf("\n 평균 : %.1f cm",sum / h.length);
		
	}
	public void test2() {
		//입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		//입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력.
		
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 1번 점수 입력 : 100
		// 1번 점수 입력 : 100
		// 1번 점수 입력 : 100

		//합계 : xx
		//평균 : xx
		//최고점 : xxx
		//최저점 : xx
	
		System.out.print("입력 받을 인원 수 : ");
		int a = sc.nextInt();
		
		
		
	     int s[] = new int[a];
	     
	     for(int i = 0; i < s.length; i++) {
	    	 System.out.println((i+1) + "번 점수를 입력하세요. : ");
	    	 s[i] = sc.nextInt();
	     }
		System.out.println();
		
		int sum = 0;
		
		for(int i = 0; i< s.length; i++) {
			sum += s[i];
			
		}
		int max = s[0];
		int min = s[0];
		
		for(int i = 0; i <s.length; i++) {
			if(s[i] > max ) {
				max = s[i];
			}
			if(s[i] < min) {
				min = s[i];
			}
		}
		
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/a));
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
		
	}
	public void test3() {
		//점심메뉴 뽑기 프로그렘
		String[] arr = {"라면", "제육덮밥", "돈까스", "오므라이스", "오징어볶음"};
		System.out.println("오늘 점심 메뉴 : " + arr[ (int)(Math.random()*5) ]);
		
		
		
	}
	public void test4() {
		//배열을 이용한 검색
		//입력받은 정수가 배열에 있는지 없는지 확인
		//만약 있다면 몇번 인덱스에 존재하는지 출력
		
		//ex)
		//정수 입력 : 200
		//1번째 인덱스에 존재
		
		//정수 입력 : 5
		//존재하지 않음
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		
		//신호를 나타내기 위한 변수
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				System.out.println((i+1) + "번째 인덱스에 존재.");
				flag = true;//일치하는 값이 있으므로 true로 변경.
			}
			
			
		}
		if( !flag ) {
			System.out.println("존재하지 않음.");
		}
		
		
		
		
	}
	public void test5() {
		//입력받은 값과 일치하는 값이 있으면 인덱스번호 출력
		//없으면 존재하지 않음 출력
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도", "낙지볶음"};
		
		System.out.print("과일을 입력해주세요 : ");
		String a = sc.next();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(a)) {
				System.out.println((i+1) + "번째에 있음.");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
		
		
		
		
		
	}
	public void ex3() {
		//String 참조형.
		
		String str = "가나다";
		String str2 = new String("가나다");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.toString());
		System.out.println(str2.toString());
		
		//String 클래스의 toString() 메서드가 존재
		//toString() 메서드는 자기 자신을 그대로 반환.
		
		//주소값(객체의 해시코드)를 확인하고 싶다면 아래처럼 사용..
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		
	}
	public void testlast() {
		//문자열을 입력받아 한글자씩 잘라내어
		//char배열에 순서대로 저장.
		//문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		//단 일치하는 문자가 없을 경우 존재하지않음 출려
		
		//배열 검색
		//문자열의 길이 : String.length();
		//String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		//count
		
		int count = 0;
		
		System.out.println("문자열을 입력해주시오");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		String input = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		for(int i = 0; i < str.length(); i++) {
			if(arr[i] == ch) {
				count++;
				
				
			}
		}if(count > 0) {
			System.out.println(count + "개 존재함.");
		}else {
			System.out.println("존재하지 않음.");
		}
			
		
		
		
		
		
		
	}
	
	
}
