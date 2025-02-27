package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.car;
import edu.kh.poly.ex1.model.dto.spark;
import edu.kh.poly.ex1.model.dto.tesla;

public class PolyService {

	public void ex1() {
		
		//car 객체 생성
		car ca = new car();
		
		tesla tesl = new tesla();
		
		
		car car2 = new tesla();
		//tesla 객체를 참조하는 변수의 타입이 car(부모)이기 때문에
		//tesla 객체가 car(부모) 객체로 변화함
		// 업 캐스팅
		
		
		car car3 = new spark();
		//spark 객체를 참조하는 변수의 타입이 car(부모)이기 때문에
		//spark 객체가 car(부모) 객체로 변화함
		// 업 캐스팅
		
		//1) 자식 객체가 부모 객체로 변하였기 때문에
		//	 자식만의 고유한 필드, 메서드를 사용할 수 없음.
		
		//1-1)car(부모 = 부모)
		ca.setEngine("v6 6기통 엔진");
		ca.setFuel("휘발유");
		ca.setWheel(4);
		//car 본인의 메서드 모두 사용 가능
		
		//1-2) tesla(자식 = 자식)
		tesl.setEngine("전기모터");
		tesl.setFuel("전기");
		tesl.setWheel(4);
		tesl.setBatteryCapacity(1000000);
		//tesla 부모, 본인의 메서드 모두 사용 가능
		
		//1-3) car2 (부모 = 자식(tesla))
		ca.setEngine("전기모터");
		ca.setFuel("전기");
		ca.setWheel(4);
		
		//ca.setBatteryCapacity(1000000);
		
		//car3 (부모 = 자식(spark))
		ca.setEngine("경차엔진");
		ca.setFuel("휘발유");
		ca.setWheel(4);
		//ca.setDiscountoff(0.5);
		
		//car2, car3 는 부모타입 참조변수(car)이기 때문에
		//tesla, spark와 같은 자식객체의 고유 필드, 메서드 사용 불가.
		
		//===================================================================
		
		//2) 다형성을 이용한 객체배열
		
		//객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		//다형성을 이용한 객체배열 : 
		//부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것.
		car[] arr = new car[3]; // 부모타입 참조변수 배열 선언 및 할당.
		//각 요소 car 타입 참조변수
		arr[0] = ca;	//car 주소
		arr[1] = car2;	// tesla 주소
		arr[2] = car3;	// spark 주소
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진 : " + arr[i].getEngine());
		}
				
		//상속 + 다형성
		//상속 특징 : car 상속 클래스는 모두 getEngine()을 가지고 있다.
		//다형성(업캐스팅) : 부모타입 참조변수 arr[i] 로 자식객체를 참조할 수 있다.
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	//전달받은 car 또는 자식객체(tesla, spark)의 엔진, 연료, 바퀴갯수를 출력하는
	//메소드
	public void printcar(car temp) {
		//부모타입 참조변수 = 자식타입객체
		//다형성의 업캐스팅 모양과 똑같다
		// -> temp라는 car타입 매개변수에는 주소가 참조되어도 된다.
		System.out.println("엔진" + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴갯수 : " + temp.getWheel() + "개");
		System.out.println();
		
		
	}
	//매개변수로 전달받ㅇ느
	public void creatCar() {
		car result = null;
		case 1 : return = new car(); break;
		case 2 : return = new tesla(); break;
		case 3 : return = new spark(); break;
		
		car[] arr = {createcar(1)	,createcar(2)	,createcar(3)	};
		
		//객체가 어떤 타입(자료형)인지 검사
		//instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		//참조하는 객체가 특정 자료형이거나 상속관계인지 확인
		//arr[1] -> car 타입 tesla 객체
		System.out.println(arr[1] instanceof tesla);
		System.out.println(arr[1] instanceof spark);
		System.out.println(arr[1] instanceof car);
		
	}
	
	
	public void ex2() {
		
		
		
		
		//다형성(업캐스트)를 이용한 매개변수 사용법
		tesla t = new tesla("전기모터","전기",4,1000000);
		
		spark s = new spark("경차엔진","휘발오,",4,0.5);
		
		car c = new car("경유엔진","경유",12);
		
		printcar(t);
		printcar(s);
		printcar(c);
		
		System.out.println("===================================");
		
		//다형성을 이용한 반환형 사용법
		//car[ arr = {new car(), new tesla(), new spark());
		
		car[] arr = (create)
		
	}

	public void ex3() {
		
	}
	
	public void ex5() {
		//바인딩
		//실제 실행될 메소드 코드와 호출하는 코드를 연결시키는것.
		car c1= new car("경유엔진", "경유",8);
		//컴파일러는 toString() 메서드가 car에 있는 걸로 인식해서
		//c1.toString() 호출코드와
		//edu.kh.poly.ex1.model.dto.car.tostring
		
		
		car c2 = new spark("경차엔진", "휘발유", 4, 0.5);
		System.out.println(c2.toString());
		
		
		
	}
}
