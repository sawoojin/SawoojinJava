package org.ajoo.day10.oop.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0; // 자료형 int -> 기본형
		// 기본형 -> 참조형으로 바꾼 클래스
		Integer su = Integer.valueOf(0);
		su = Integer.valueOf(425);
		su = 425; // 오토 박싱
		int suNum = su.intValue(); // 참조형 -> 기본형
		suNum = su; // 오토 언박싱
		
		// int -> Integer
		// double -> Double
		// float -> Float ==> 오른쪽에 있는 클래스를 Wrapper 클래스라 함
		// char -> Character
		String openDay = "20231113";
		int openDate = Integer.parseInt(openDay);
		// Double.parseDouble(openDay);
		// Folat.parseFolat(openDay);
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		char c1 = '4', c2 = 'F';
		if(Character.isAlphabetic(c2)) {
			System.out.println(c1 + "는 숫자");			
		}
		if(Character.isDigit(c1)) {
			System.out.println(c2 + "는 영문자");
		}
			
	}

}
