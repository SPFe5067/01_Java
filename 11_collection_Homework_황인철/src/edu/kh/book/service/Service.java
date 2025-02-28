package edu.kh.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.book.Book;

public class Service {

	private Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList<>(); 
	
	
	
	
	public Service() {
	bookList.add(new Book(1111, "머릿말씀", "유황길", 39000, "문화상가"));
	bookList.add(new Book(2222, "중간말씀", "김동길", 23000, "전자상가"));
	bookList.add(new Book(3333, "꼬릿말씀", "자갈길", 36000, "상가"));
	bookList.add(new Book(4444, "맺음말씀", "최윤길", 42000, "수산시장"));
	bookList.add(new Book(5555, "맺음말씀", "최윤길", 42000, "도서관"));
	
	}

	
	public void DisplayMenu() {
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
