package com.kh.practice.snack.controller;



import com.kh.practice.snack.model.vo.Snack;



public class SnackController {
	
	private Snack s = new Snack();
	
	
	public SnackController() {
		
	}
	
	public void saveData(String kind,String name,String flavor,int numOf,int price) {
		s.setKind(kind);
	}
	
	
	
	
	
	
}
