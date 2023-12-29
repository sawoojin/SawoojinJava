package org.ajoo.day05.oop;

public class Circle {
	public int radius;
	public String name;
	
	// 생성자
	// 1. 클래스 이름과 같은 메소드 이름
	// 2. 객체 생성시 최소 1번 실행됨
	// 3. 필드값을 초기화 함. -> 객체 초기화
	public Circle() {
		radius = 1;
		name = "일용자";
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
