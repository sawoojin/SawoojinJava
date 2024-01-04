package org.ajoo.day08.oop.ploymorphism.overriding;

public class Shape {
	private String name; // 캡슐화
	
	public Shape() {}
	
	public void draw() {
		System.out.println("Shape Something");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
