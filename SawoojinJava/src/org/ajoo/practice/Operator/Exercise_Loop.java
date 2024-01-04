package org.ajoo.practice.Operator;

import java.util.Scanner;

public class Exercise_Loop {

	public void exercise01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 숫자를 입력하세요.");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		else {
			for (int i = 0; i < num; i ++) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}
	
	public void exercise04() {
//		메소드 명 : public void practice4(){}
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//
//		ex.
//		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
//		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
//		4 5 6 7 8 	4 5 6 7 8 	1 이상의 숫자를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		do {
			System.out.println("첫번째 숫자를 입력해주세요 : ");
			num1 = sc.nextInt();
			if (num1 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}			
		} while (num1 < 1);
		
		do {
			System.out.println("두번째 숫자를 입력해주세요 : ");
			num2 = sc.nextInt();
			if (num2 < 1 ) {
				System.out.println("1 이상의 숫자를 입력해주세요");			
			}
		} while (num2 < 1);

		int min = (num1 > num2) ? num2 : num1;
		int max = (num1 > num2) ? num1 : num2;
		for(int i = min; i < max+1; i ++) {
			System.out.printf("%d,", i);
		}
		sc.close();
	}
}
