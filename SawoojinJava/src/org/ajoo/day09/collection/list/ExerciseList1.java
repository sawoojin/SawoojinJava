package org.ajoo.day09.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseList1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		List<String> strList = new ArrayList<String>(); // 업캐스팅
		// 키보드로부터 4 개의 이름을 입력받아 ArrayList에 삽입
		for(int i = 0; i < 4; i ++) {
			System.out.print("이름을 입력하세요 : ");
			String input =  sc.next();
			strList.add(input);
		}
		// ArrayList에 들어있는 모든 이름 출력
		for(int i = 0; i < 4; i++) {
			System.out.println(strList.get(i));
		}
		// 가장 긴 이름 출력
		int longIndex = 0;
		for(int i = 0; i < 4; i++) {
			if(strList.get(longIndex).length() < strList.get(i).length()) {
				longIndex = i;
			}
		}
		System.out.println(longIndex);

	}

}
