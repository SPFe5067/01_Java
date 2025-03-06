package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {
	
	/* 스트림(Stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * -1byte 단위로 데이터를 입/출력하는 스트림
	 * -최상위 클래스 : InputStream. OutputStream
	 * -문자열, 이미지, 영상, 오디오, pdf 등
	 *  모든것을 입/출력 할 수 있음
	 *  (단, 통로가 좁아 속도가 느림, char형 문자의 경우 깨질 우려가 있음)
	 */
	
	
	//IO 관련된 코드 IOException이 발생될 가능성이 높다
	//-> 거의 모든 메서드가 Throws IOException
	//-> IOException 예외 처리 구문을 작성하는 것이 필수!
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력
	 * + 데이터 출력
	 */
	public void fileByteOutput() {
		FileOutputStream fos = null;
		
		//FIleOutputStream 참조 변수 선언
		try {
			//new FileOutputStream("경로") :
			//경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			//출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			//단, 폴더는 생성되지 않음
			//기존 파일이 존재하면 내용을 덮어쓰기 함
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
			//String 의 불변성 문제를 해결한 객체 StringBuilder(비동기)/StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Good Night\n");
			sb.append("자고싶다");
			sb.append("자바 어렵다");
			sb.append("나만 못하는건가?, 다들 천재인가봐");
			sb.append("살려줘..");
			
			//출력방법 1. 한 글자(2byte)씩 파일로 출력
				//StringBuilder -> String 변환 -> charAt() -> char 변환
			String content = sb.toString();
		/*	for(int i = 0; i < content.length(); i++) {
				char ch = content.charAt(i);
				fos.write(ch); //1byte 출력 스트림이 연결된 파일에 ch 쓰기
			}
			fos.flush(); //= Stream 안에 남아있는 모든 데이터를 모두 밀어냄
			//fileOutputStream에서는 flush()는 선택 사항이다*/
			
			System.out.println("출력완료");
			
			//2byte 범주의 문자(영어,숫자,기본특수문자 제외)는
			//바이트 기반 스트림 통과 시
			//데이터 손실이 발생해서 글자가 깨지는 문제가 발생
			
			//출력방법 2. String을 byte[] 배열로 변환 후 출력하기
			
			//**********수행시간 확인할 수 있는 방법*********
			//write() 수행되는 시간 측정
			//System.nanoTime() : 1970.01 01 오전 9:00:00 부터
			//현제 시간까지의 차이를 ns(nano second)로 변환
			//nano second == 1/1000 mily second
			
			//이전
			long startTime = System.nanoTime();
			
			fos.write(content.getBytes()); //byte[]로 만들어서 반환
			//이후
			long endTime = System.nanoTime();
			System.out.println("[수행시간] : " + (endTime - startTime) + "ns");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {//try에서 예외가 발생 했든 안했는 관계없이 무조건 수행
			//사용완료한 스트림을 제거(닫기, 메모리 반환)하는 코드 작성
			// 메모리 누수 방지
			
		try {if(fos != null)//스트림이 정상 생성된 경우 스트림을 닫는다
						    //(NullPointerException 방지)
							//close() 메서드도 IOException을 발생시키기 떄문에
							//try-chatch 이용하여 예외 처리 필수
			fos.close(); //+fluch 포함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	/**버퍼를 이용한 파일 출력
	 * +BufferedOutputStream 보조 스트림 이용
	 * 
	 */
	public void bufferedFileByteOutput() {
		
	/* 버러(Buffer)란?
	 * -데이터를 모아두는 공간, 마치 바구니 같은 메모리 공간.
	 * 
	 * BufferdOutputStream / BufferdInputStream
	 * 출력용 보조 스트림(바이트)  / 입력용 보조 스트림(바이트)
	 * 
	 * -FileOutputStream 은 1byte씩 데이터를 입출력
	 * -통로가 좁아서 데이터 입출력시 속도가 느림
	 * 
	 * -보조 스트림을 이용시 버퍼에 입출력할 내용을 모아서 한번에 입출력
	 * (내부 버퍼에 데이터를 모아뒀다가 일정 크기가 되면 한번에 출력)
	 * 기반스트림을 이용하는 횟수가 적어짐
	 * 성능, 시간 효율 상승
	 */
		FileOutputStream fos = null;	 //기반 스트림 참조변수 선언
		BufferedOutputStream bos = null; //보조 스트림 참조변수 선언
		
		try {
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
			
			//기반 스트림 fos를 이용해서 보조스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Good Night\n");
			sb.append("자고싶다\n");
			sb.append("자바 어렵다\n");
			sb.append("나만 못하는건가?, 다들 천재인가봐\n");
			sb.append("살려줘..");
			
			String content = sb.toString();
			//이전
			long startTime = System.nanoTime();
			
			
			bos.write(content.getBytes()); //buffer는 작성이 아닌 모으기만.
			
			
			//이후
			long endTime = System.nanoTime();
			System.out.println("[수행시간] : " + (endTime - startTime) + "ns");
			bos.flush(); //모은걸 밀어냄
			//버퍼 내용을 강제로 파일에 등록
			//BufferedOutputStream 사용 시 flush() 필수
			
			System.out.println("출력완료");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {if(bos != null) bos.close();//보조만 닫아도 메인도 닫음.
				
			}catch(IOException e) {
				e.printStackTrace();

			}
			
		}
		
		
		
		
		
		
		
	}
	/**바이트 기반 파일 입력
	 * 
	 */
	public void fileByteInput() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			//FileInputStream 이용시 해당 경로에 반드시 실제 파일이 존재해야한다
			//존재하지 않을시 FileNOtFoundException 발생
			
			//읽어오는 방법 1 : 파일 내부 내용을 1byte씩 끊어서 가져오기
			// -2byte 범주의 글자들은 깨지는 문제 발생
			
			//byte -> 정수형을 의미함
			//다루기 힘들기 때문에 같은 정수형 기본형Int로 변환해서 사용
			
			int value = 0; //읽어온 바이트값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read(); //1byte씩 끊어서 읽어오는 메서드
				//단, 더이상 읽어올 값이 없으면 -1을 반환
				
				if(value == -1) break;
				
				sb.append((char)value); //char로 강제 형변환해서 글자 형태로 sb추가
				
			}
			System.out.println(sb.toString());
			
			// InputStream은 flush() 없음
			// flush()는 출력스트림에만 관련된 동작.
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	/**바이트 기반 파일 입력2
	 * 
	 */
	public void fileByteInput2() {
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			//방법 2 : 파일에 저장된 모든 byte값을 다 읽어와서
			// byte[] 배열 형태로 반환 받기
			//byte[]배열 을 이용해서 String객체 생성
			
			byte[] bytes = fis.readAllBytes();
			String content = new String(bytes);
			
			System.out.println(content);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}
	/**BufferedInputString
	 * 
	 * InputStream의 경우 외부 파일의 데이터를 읽어올 때 사용하는데
	 * 읽어오는 파일의 크기가 작으면 보조 스트림의 성능이 크게 눈에 띄지 않는다. 
	 */
	public void bufferedFileByteInput() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		//파일 입력용 보조 스트림 선언
		BufferedInputStream bis = null;
		
		try {
			//기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			//보조 스트림 생성
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {if(bis != null)
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	/** 외부에 있는 config.properties 파일 입출력하기
	 * -> Map 계열인 properties 클래스 사용하기
	 * 
	 */
	public void readProperties() {
		
		//properties 클래스는 Hashtable의 하위클래스로 Map 계열 클래스 중 하나.
		//Key와 Value 모두 String 타입으로 이루어져있다
		
		//properties객체 생성
		Properties properties = new Properties();
		
		//byte 기반 파일 입력 스트림 참조변수 선언
		FileInputStream fis = null;
		
		//byte 기반 파일 출력 스트림 참조변수 선언
		FileOutputStream fos = null;
		
		try {
			//(읽기)
			fis = new FileInputStream("/io_test/20250305/config.properties");
			
			properties.load(fis);//파일 로드
			
			//properties.getProperty(key) : key에 대응되는 value 반환
			System.out.println("username : " + properties.getProperty("username"));
			System.out.println("password : " + properties.getProperty("password"));
			System.out.println("language : " + properties.getProperty("language"));
			
			//(쓰기)
			
			fos = new FileOutputStream("/io_test/20250305/config.properties");
			
			properties.setProperty("theme","night"); // 새로운 속성 추가
			//theme = night (Key : value) 추가
			
			properties.store(fos, "Update");//저장
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {if(fis != null)
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	/**파일 복사
	 * 
	 * 파일 경로를 입력받아
	 * 지정된 파일과 같은 경로에 복사된 파일 출력하기
	 * 
	 * [실행화면]
	 * 파일 경로 입력 : /io_test/20250305/노래가사.txt
	 * 복사 완료 : /io_test/20250305/노래가사_copy.txt
	 * 
	 * 1)입력된 경로에 파일이 있는지 검사
	 * 2)있으면 파일 내용을 모두 읽어오기 : FileInputStream + BufferedInputStrea
	 * 3)읽어온 파일 내용을 같은 경로 위치에 "파일명_copy.확장자" 로 출력
	 *		:FileOutputStrea + BufferedOutputStream
	 * +Scanner 대신 BufferedReader(문자열 입력용 스트림) 이용
	 * BufferedReader는 보조스트림으로 단독사용 불가능
	 * BufferedReader 생성 시 기반스트림인 InputStreamReader 사용 
	 */
	public void fileCopy() {
		
		//스트림 참조 변수 선언
		BufferedReader br = null;	    //문자열 입력용 스트림 
		
		FileInputStream fis = null; 	// 파일 입력 기반 스트림
		BufferedInputStream bis = null; // 파일 입력 보조 스트림
		
		FileOutputStream fos = null;	// 파일 출력 기반 스트림
		BufferedOutputStream bos = null;// 파일 출력 보조 스트림
		
		try {
			//파일 입력을 받기 위한 스트림 객체 생성
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//경로 입력 받기
			System.out.println("파일 경로 입력 : ");
			String target = br.readLine();//입력된 한줄 읽어오기
			
			//해당 경로에 파일이 존재하는지 확인
			File file = new File(target);
			
			if(!file.exists()) {
				//해당 경로에 파일이 존재하지 않으면
			System.out.println("해당 경로에 파일이 존재하지 않습니다");
			return;
			
			
			}
			//해당 경로에 파일이 존재하면
			//target이 가리키는 파일을 입력받을 수 있도록
			//입력용 Stream 생성
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			//입력용 스트림을 이용해서 target파일의 내용 입력하기
			
			byte[] bytes = bis.readAllBytes();
			//==============================================================
			//출력할 파일의 경로 + _copy가 붙은 파일 이름
			//target : io_test/20250305/노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target);//io_test/20250305/노래가사.txt
			
			//int String.lastIndexOf("문자열")
			// - 주어진 문자열이 마지막으로 등장하는 인덱스를 찾아
			//int값으로 반환. 찾지 못하면 -1 반환
			int insertPoint = target.lastIndexOf(".");
			
			//System.out.println(insertPoint);
			sb.insert(insertPoint, "_copy"); //22번 인덱스 자리에 _copy를 추가
			String copy = sb.toString(); //복사할 파일의 경로를 String 변환
			
			//출력용 스트림 생성하기
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
			//원본에서 읽어온 내용 bytes를 bos를 이용해서 쓰기(출력)
			bos.write(bytes);
			bos.flush();//스트림에 남아있는 데이터 밀어내기
			
			System.out.println("복사 완료 : " + copy);
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//사용한 스트림 모두 반환하기
			try {
				if(br != null) br.close();
				if(bis != null) bis.close();
				if(bis != null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
