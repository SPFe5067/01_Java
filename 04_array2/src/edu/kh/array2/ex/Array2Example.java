package edu.kh.array2.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Example {

	Scanner sc = new Scanner(System.in);
	/*2차원 배열
	 * 
	 * 
	 * -자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념이 추가
	 * 
	 * 
	 */
	public void ex1() {
		
		//2차원 배열 선언
		int[][] arr;
		// int 2차원 배열을 참조하는 참조변수 arr선언
		//참조변수 == 참조형 == 레퍼런스 변수 == 레퍼런스
		
		
		//2차원 배열 할당
		// -> new 자료형[행 크기][열 크기];
		
		arr = new int[2][3];
		//Heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		//그 공간의 주소 arr 참조변수에 대입

		
		//2차원 배열 초기화
		//1) 행, 열 인덱스를 이용해서 직접 초기화
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		
		//2) 2중 for문을 이용한 초기화
		int num = 10;
		
		System.out.println(arr.length); // 행의 길이 (2)
		//arr가 참조하고 있는 2차원 배열의 행의 길이
		System.out.println(arr[0].length); //열의 길이 (3)
		//arr 0번째 행이 참조하고 있는 배열의 길이

		for(int row = 0; row < arr.length; row++) {
			for(int high = 0; high < arr[row].length; high++) {
				arr[row][high] = num;
				num += 10;
				
				
		//3) 선언과 동시에 초기화 하는 방법
		
		int[][] arr2 = {{10, 20, 30},{40, 50, 60}};
		
				
				
			}
		}
		
	
		
		
		
		
		
		
		//Arrays.toString(배열명) : 참조하고 있는 1차원 배열의 값을 문자열로 반환.
		System.out.println(Arrays.toString(arr));
		//Arrays.deepToString(배열명) :
		//참조하고 있는 배열의 실제 데이터가 나오는 부분까지 파고 들어가서
		//모든 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr));
		
		
		
	}
	public void ex2() {
		//2차원 배열 선언과 동시에 초기화
		//3행 3열짜리 정수형 2차원 배열 선언과 동시에
		//1~9까지 초기화
		int[][] arr = {{1, 2, 3},{4, 5, 6,},{7, 8, 9}};
		
		//행 별로 합 출력
		// 0행의 합 : 6
		// 1행의 합 : 15
		// 2행의 합 : 24
		
	
		
		for(int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			
			for(int o = 0; o < arr[i].length; o++) {
				
				sum += arr[i][o];
			}
			System.out.printf("%d행의 합 : %d\n",i , sum);
		}
		
		
		
		
		
	}
	public void ex3() {
		//열 별로 합 출력
		//0열의 합 : 12
		//1열의 합 : 15
		//2열의 합 : 18
		
		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
			for(int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			
			for(int o = 0; o < arr[i].length; o++) {
				sum += arr[o][i];
			}
			System.out.printf("%d열의 합 : %d\n", i, sum);
		
		
		
		
		
	}
	
	}
	public void ex4() {
		//가변 배열
		//-2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지 않고
		//나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		char arr[][] = new char[4][];
		arr[0] = new char[1];
		arr[1] = new char[3];
		arr[2] = new char[2];
		arr[3] = new char[4];
		
		char ch = 'a';
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int o = 0; o < arr[i].length; o++) {
			
				arr[i][o] = ch++;
			
			}System.out.println(i + "행의 값 : " + Arrays.deepToString(arr));
		
		}
		
		
		
		
		
		
		
	}

}
