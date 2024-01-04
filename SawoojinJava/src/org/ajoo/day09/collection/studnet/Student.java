package org.ajoo.day09.collection.studnet;

public class Student {
	// 필드
	private String name;
	private int firstScore;
	private int secondScore;
	// 생성자
	public Student() {}
	// 메소드 setter
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	// getter
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
}
