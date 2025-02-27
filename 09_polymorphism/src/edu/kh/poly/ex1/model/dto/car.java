package edu.kh.poly.ex1.model.dto;

import javax.management.remote.SubjectDelegationPermission;

public class car {
	private String engine;
	private String fuel;
	private int wheel;
	
	
	public car() {
		//속성
	
	//기능(생성자 + 메서드)
	
	
	
	
	
	//Object.toString() 오버라이딩
	//오버라이딩?
	// 부모클래스에서 정의된 메서드를 자식클래스에서 재정의 하는 것.
	
	
	
	
	}


	public car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		this.wheel = wheel;
	}


	@Override
	public String toString() {
		return "car [engine=" + engine + ", fuel=" + fuel + ", wheel=" + wheel + "]";
	}

}
