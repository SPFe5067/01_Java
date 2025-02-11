package edu.kh.variable.ex1;

public class VariableExam4 {

	public static void main(String[] args) {
		
		/* 강제 형변환
		 * -기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 * 1.값의 범위가 큰 자료형을 작은 자료형으로 변환할 떄
		 * 2.출력되는 데이터의 표기법을 변환시키고 싶을 떄
		 * 
		 * -강제 형변환 방법.
		 * 자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 */
		
		double temp = 3.14;
		int num = (int)temp;
		System.out.println("num : " + num);
		System.out.println("temp : " + temp);
		//실수형 double -> 정수형 int 변환 시 소수점 아랫단위 손실(데이더 손실)
		
		int i1 = 290;
		byte b1 = (byte)i1;
		
		System.out.println("i1 : " + i1); //290
		System.out.println("b1 : " + b1); //34
		//같은 정수형을 강제 형변환 할 시에도 값의 범위 차이 때문에 데이터의 손실이 일어난다.
		
		//char -> int 강제 형변환
		
		char na = 'A';
		System.out.println((int)na);
		
		int ga = 23456;
		System.out.println((char)ga);
		
		//오버플로우 현상은 컴퓨터가 미리 예측할 수 없다.
		//-개발자가 미리 예측해야함.
		int i0 = 2147483647;
		int result2 = i0 + 2147483647;
		System.out.println(result2); // -2
	}
}
