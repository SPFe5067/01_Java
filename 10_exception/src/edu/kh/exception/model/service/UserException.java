package edu.kh.exception.model.service;


//사용자 정의 예외 클래스
public class UserException extends Exception{

	public UserException() {}
	//기본 메서드

	public UserException(String message) {
		super(message);
	}
	
	
	
}
