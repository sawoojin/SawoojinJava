package org.ajoo.day05.oop;

public class Book {
	public String title;
	public String author;
	// 기본 생성자 (매개변수 생성자가 아님)
	public Book() {
		title = "";
		author = "";		
	}
	// 매개변수 1개 있는 생성자
	public Book(String title) {
		this.title = title;
	}
	// 매개변수 2개 있는 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
}
