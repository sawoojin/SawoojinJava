package org.ajoo.day06.oop.objectArray;

public class Exam_ObjectArray01 {

	public static void main(String[] args) {
		// 객체 배열 생성
		Circle [] cArrs = new Circle[5];
		System.out.println(cArrs[0]);
		// 베열 중 첫번째 공간에 객체 생성 후 필드 초기화 선언
		cArrs[0] = new Circle();
		System.out.println(cArrs[0]);
		cArrs[0].radius = 10;
		System.out.println(cArrs[0].getArea());
		// for 문을 이용하여 배열의 모든 공간에 객체를 생성하여 필드에 대입
		for(int i = 0; i < cArrs.length; i++ ) {
			cArrs[i] = new Circle();
		}
		for(int i = 0; i < cArrs.length; i++ ) {
			cArrs[i].radius = i+1;
			System.out.println(cArrs[i].getArea());
		}
	}

}
