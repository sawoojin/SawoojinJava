package org.ajoo.pratice.loop;

import java.util.Scanner;

public class Practice_Loop10 {

	public static void main(String[] args) {
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i < num; i ++) {
			
			System.out.println("*");
		}
	}

}
