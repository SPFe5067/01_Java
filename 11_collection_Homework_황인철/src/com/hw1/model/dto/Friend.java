package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.List;



public class Friend {

	
	
	private List<Object> Friend = new ArrayList<Object>();
	
	private String name;
	
	public Friend() {
		Friend.add("철수");
		Friend.add("훈이");
		Friend.add("유리");
		Friend.add("짱구");
		Friend.add("맹구");
		
	/*	System.out.println(Friend.get(0));
		System.out.println(Friend.get(1));
		System.out.println(Friend.get(2));
		System.out.println(Friend.get(3));
		System.out.println(Friend.get(4));*/
	}
	
	
	
	public void pickLeader() {
		int random = (int)(Math.random() * 5);
	System.out.println(Friend.get(random) + "가 떡잎마을 방범대 대장이다!");
	}
	
	
	
	
	
	public Friend(String name) {
		super();
		this.name = name;
	}




	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	

}
