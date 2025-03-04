package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	//map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	//Key : Value -> Entry라고 부름
	
	//-Key를 모아두면 Set의 특징(중복저장X)
	//-Value를 모아두면 List의 특징(중복저장O)
	
	
	public void ex1() {
		
		//HashMap<K , V> : Map의 자식클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(Integer Key, String Value) : 추가
		map.put(1, "김끼룩");
		map.put(2, "이끼룩");
		map.put(3, "박끼룩");
		map.put(4, "나끼룩");
		map.put(5, "최끼룩");
		map.put(6, "끼룩");
		
		//key 중복 테스트
		
		map.put(1, "금광갈매기"); //Key는 중복 허용하지 않는다, 대신 Value 덮어쓰기.
		
		//Value 중복 테스트
		
		map.put(7, "저거독수리");
		map.put(7, "저거독수리");
		map.put(8, "저거독수리");
		map.put(8, "저거독수리");
		map.put(9, "저거독수리");//value는 중복값을 허용한다.
		
		System.out.println(map); // map.toString() 오버라이딩 되어있음.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void ex2() {
		
		// Map 사용 예제
		
		//Vo / DTo (값 저장용 객체) 한사람의 정보를 저장하기 위한 용도
		// 특정 데이터 묶음의 재사용이 많은 경우 주로 사용함.
		// 재사용이 적은 Vo는 오히려 코드 낭비이다.
		// Map을 이용해서 Vo와 비슷한 코드를 작성할 수 있음
		
		//1) Vo 버전
		Member member = new Member();
		
		//값세팅
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(27);
		
		//값출력
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		//2)Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
		//value가 Object 타입 == 어떤 객체든 Value에 들어올 수 있따!
		
		//값세팅
		map.put("id","user02");
		map.put("pw", "pass02");
		map.put("age", 27);
		
		//값출력
		//Object(Value) Map.get(String Key) : 매개변수로 전달받은 Key와 대응되는 Value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("==============================================================");
		
		// ** Map에 저장된 데이터 순차적으로 접근하기 **
		// {"id"="user02","pw"="pass02","age"=27}
		
		//Map에서 Key만 모아두면 Set의 특징을 가진다(중복저장 X)
		//이를 활용해서 만들어진 메서드 : keySet()
		//key만 모아서 Set객체로 반환
		
		Set<String> set = map.keySet(); // id,pw,age,가 저장된 Set 객체를 반환
		
		System.out.println("keySet() : " + set);
		
		//향상된 for문
		for(String key : set) {
			System.out.println(map.get(key));
		}
		
		//map에 저장된 데이터가 많거나 
		//어떤 key가 있는지 불분명할때(향상된 for문 사용하면 유용함)
		//또는 map에 저장된 모든 데이터에 접근해야 할 때
		//keySet() + 향상된 for문 코드 사용
		
		
		
		
		
		
	}
	public void ex3() {
		
		//List<Map<Key,Value>>
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		//List 객체만 생성되었고, 해당 list에는 Map만 들어올 수 있음을 제한함
		//Map 객체는 현제 생성X
		
		for(int i = 1; i < 11; i++) {
			//반복될 때 마다 Map객체 생성하기
			Map<String, Object> map = new LinkedHashMap<String, Object>();//HashMap은 순서를 보장하지 않음.
											 //순서를 유지하고 싶다면 LinkedHashMap 이용하기.
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			
			//Map을 List에 추가
			list.add(map);
			
			
		}
		
		System.out.println(list);
		
		//향상된 for문을 이용하여 key가 "id"에 대응되는 value값 출력
		for(Map<String,Object> temp : list) {
			System.out.print(temp);
			System.out.println("  " + temp.get("id"));
		}
		
		
		
	}
	
	
	

}
