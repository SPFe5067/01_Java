package edu.kh.oop.method.run;

import edu.kh.oop.method.mode.service.MethodExample;
import edu.kh.oop.practice.model.service.MemberService;

public class MethodRun {
 public static void main(String[] args) {
	 MethodExample me = new MethodExample();
	 MemberService ms = new  MemberService();
	 ms.displaymenu();
	 
	 
	 /* (Stack영역) - 메서드를 호출한 이력이 쌓임.
	  * LIFO - Last - Input - First - Out
	  * 		후     입      선      출
	  * method2() 메서드 호출
	  * method1() 메서드 실행
	  * main 메서드 실행
	  *
	  */
}
}
