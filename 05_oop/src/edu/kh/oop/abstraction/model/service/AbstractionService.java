package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//service : 특정 기능(비즈니스 로직)을 제공하는 패키지 or 서비스
//(비밀번호 -> 암호화, 파일 -> 유효한파일 걸러내는 작업)
public class AbstractionService {

	
	public void ex1() {
		//people 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		//people p1 : people 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		//new people() : 새로운 people 객체를 Heap 영역에 생성
		
		
		// * 클래스 이름이 자료형처럼 사용된다. * 
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다.
		
		 /*p1.name = "갈매기";
		 p1.gender = '수';
		 p1.pNum = "123456-7891011";
		 p1.address = "을왕리 해수욕장";
		 p1.phone = "010-1234-5678";
		 p1.age = 7;
		
		//int[] arr = new int[5];
		 System.out.println("p1의 name : " + p1.name);
		 System.out.println("p1의 gender : " + p1.gender);
		 //char타입 jvm 기본값은 0
		 //유니코드 문자체계에서 0은 공백을 나타냄
		 //int형으로 강제형변환 하면 0인것을 확인할 수 있음.
		 System.out.println("p1의 pNum : " + p1.pNum);
		 System.out.println("p1의 address : " + p1.address);
		 System.out.println("p1의 phone : " + p1.phone);
		 System.out.println("p1의 age : " + p1.age);
		 */
		 p1.tax();
		 p1.vote();
		 
		 p1.setName("갈매기");
		 System.out.println(p1.getName());
		 
		 p1.setGender('남');
		 System.out.println(p1.getGender());
		 
		p1.setPNum("123456-1234567");
		System.out.println(p1.getPNum());
		 
		p1.setAddress("울릉도");
		System.out.println(p1.getAddress());
		
		p1.setPhone("010-1234-5678");
		System.out.println(p1.getPhone()); 
		
		p1.setAge(7);
		System.out.println(p1.getage());
		
		//본인 객체
		//people 클래스 이용하여 본인 이름 객체 생성하기
		//본인의 정보 setter 값 대입
		// getter 이용해서 콘솔창 출력까지
		
		//메모리 구조에 그리기.
		
		
		
		
		
		
	}
    public void extest(){
    	People p2 = new People();
    	
    	p2.setName("황인철");
    	System.out.println(p2.getName());
    	
    	p2.setGender('남');
    	System.out.println(p2.getGender());
    	
    	p2.setPNum("990412-1******");
    	System.out.println(p2.getPNum());
    	
    	p2.setAddress("서울시 서대문구 북가좌동");
    	System.out.println(p2.getAddress());
    	
    	p2.setPhone("010-5067-0412");
    	System.out.println(p2.getPhone());
    	
    	p2.setAge(27);
    	System.out.println(p2.getage());
    }
}
