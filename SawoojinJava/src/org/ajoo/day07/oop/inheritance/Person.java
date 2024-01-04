package org.ajoo.day07.oop.inheritance;

public class Person {
	//  클래스 Person을 아래와 같은 멤버 필드를 갖도록 선언하고 
	//  클래스 Student는 클래스 Person 을 상속받아 각 멤버 필드에 값을 저장하시오. 
	//  이 예제에서 Person 클래스의 private 필드인
	//  weight는 Student 클래스에서는 접근이 불가능하여 
	//  슈퍼 클래스인 Person의 getXXX, setXXX
	//  메소드를 통해서만 조작이 가능하다.
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
