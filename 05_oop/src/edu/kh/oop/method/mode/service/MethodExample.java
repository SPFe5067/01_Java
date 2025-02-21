package edu.kh.oop.method.mode.service;

public class MethodExample {

	//메서드가 호출될때마다 Stack에 메서드를 실행한 이력이 쌓인다.
	//-> 메서드를 호출한 순서대로 쌓임.
	
	//main - method1 - method2
	//그리고 제일 마지막에 쌓인 순서대로 스택에서 나감
	//->LIFO
	// : 마지막에 들어온게 첫번째로 나간다 == 후입선출
	//method2 - method1 - main
	
	public void method1() {
		int result = method2(3,5);	//method2() 함수 호출.
		System.out.println(result);
		// return; 생략된 상태(없어도 문제없음)
		// 호출한 곳으로 코드의 흐름이 되돌아감.
	}
	public int method2(int a, int b) {
		int sum = a + b; // int result = method2(3,5)라서 a = 3, b = 5이다
		return sum; // sum = 8 이며 public int method2를 사용했기에 정수값을 반환한다
					// method2() 호출한 쪽으로 sum(8)을 가지고
					//(코드의 흐름이) 되돌아감.
	}
	
	

	
	
	
	
}
