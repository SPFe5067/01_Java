package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {

	Scanner sc = new Scanner(System.in);
	
	//얕은 복사
			// 주소를 복사하여 서로 다른 두 참조변수가
			//하나의 배열 또는 객체를 참조하는 상태를 만드는 복사 방법.
			
	public void shallowCopy() {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = arr1;	//주소만 복사.
		
		System.out.println("변경 전");
		System.out.println("arr1 주소 : " + arr1);
		System.out.println("arr2 주소 : " + arr2);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		//얕은 복사한 배열의 값을 변경
		arr2[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
	}
	
	// 깊은 복사
	//같은 자료형의 새로운 배열을 만들어서
	//기존 배열의 데이터를 모두 복사하는 방법
	public void deepCopy() {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		
		//1.for문을 이용한 깊은 복사 방법.
		
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("arr1 주소 : " + arr1);
		System.out.println("arr2 주소 : " + arr2);
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		//2.System.arraycopy(원본배열, 원본복사 시작 인덱스, 복사배열, 
		// 					복사배열의 삽입 시작 인덱스, 복사길이)
		
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		System.out.println("arr3 : " + Arrays.toString(arr3));
	
		//3.복사할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할 길이);
		
		int[] arr4 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		//값 변경 후 확인
		arr1[1] = 3;
		arr2[1] = 33;
		arr3[1] = 333;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		
		
	}

	public void creatLottoNumber() {
		//중복데이터 제거 + 정렬
		
		//1 ~ 45 사이 중복되지 않는 난수 6개 생성
		//생성된 난수가 오름차 순으로 정렬
		
		
		//정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		//생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i = 0; i < lotto.length; i++) {
			
			//1 ~ 45 사이 난수 생성
			int random = (int)(Math.random() * 45 + 1);
			
			//생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = (int)random;
		
			//중복 검사를 위한 중첩for문 작성
			for(int o =  0; o < i; o++) {
				
				//현제 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사
				if(random == lotto[o]); {
					i--;
					//i가 1씩 증가할때마다 난수가 하나 생성됨
					// 중복 값이 있으면 난수를 새로 하나 더 생성해야함.
					//ㅑ값을 인위적으로 1 감소시켜서 난수 발생의 기회를 한번 더 주는
					break;
					//앞쪽에서 중복데이터를 발견하면
					//남은 값은 비교할 필요 없다.
					
				}
			}
			//정렬은 되어 있지 않지만, 중복 제거가 된 배열이 완성됨
			//오름차순 정렬
			//선택, 삽입, 버블, 퀵 등등
			//자바가 정렬 방법을 미리 만들어서 제공하고 있음
			//Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬됨
			
			
		}
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
		
		
		
	}

	

	public void test1() {
		
		
		
		
		
		
		
	}
	
	
}
