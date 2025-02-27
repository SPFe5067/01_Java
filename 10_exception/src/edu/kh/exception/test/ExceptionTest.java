package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		
		//컴파일 에러 => 개발자가 코드를 잘못 작성한 경우
		//자료형이 맞지 않아 연산 불가하여 "컴파일 에러"가 발생(코드 틀림)
		int a = (int)99.9; //Type mismatch: cannot convert from double to int = double 자료형을 어찌 Int에 넣으려고 하느냐.
		//(int) 강제형변환을 사용하면 해결됨.
		
		//런타임 에러 => 프로그램 수행 중 발생하는 에러
		//				 주로 if 문으로 처리 가능함.
		
		int[] arr = new int[3]; //길이 3 : 인덱스 0,1,2까지 존재
				
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
			//	arr[3] = 40;
				//배열 범위 초과 예외
				
				if( 3  >= arr.length ) {//배열 인덱스 범위 초과한 값이 들어왔다면
					System.out.println("배열 범위를 초과 했습니다.");
				}else {
					arr[3] = 40;
					System.out.println("배열 범위 안정적...");
				}
		
		
		
		
	}
	
	
			
	
	
	
	
	
	public ExceptionTest() {
	}

}
