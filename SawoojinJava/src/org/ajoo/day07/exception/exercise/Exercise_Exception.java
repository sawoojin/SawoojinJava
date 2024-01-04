package org.ajoo.day07.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void exercise01() {
		Scanner sc = new Scanner(System.in);
		while (true) { // for(;;){} or while(true){}
			try {
				System.out.print("정수 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력 : ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.printf("%d을 %d으로 나누면 몫은 %d입니다.\n", num1, num2, result);

			} catch (Exception e) {
				System.out.println("0으로 나눌 수 업따");
			}
		}
	}
	public void exercise02() {
		Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.println("정수 3개를 입력하세요.");
				int sum = 0;
				for(int i = 0; i < 3; i++) {
					try {
						System.out.print(i+1 +" : ");
						sum += sc.nextInt();
					
				} catch (InputMismatchException e) {
					System.out.println("정수로 다시 입력해주세요.");
					sc.next();
					i--;
				}
			}
			System.out.printf("합은 %d\n", sum);		
		}
	}
	public void exercise03() {
		// 범위를 벗어난 배열의 접근
		// ArrayIndexOutOfBoundsException
		int intArrs [] = new int[5];
		try {
			System.out.println(intArrs[5]);
		} catch (Exception e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
	public void exercise04() {
		// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		// NumberFormatException
		String [] str = new String[2];
		str[0] = "426";
		str[1] = "11.13";
		// String -> Int
		try {
			int result = Integer.parseInt(str[0]);
			System.out.println("숫자로 변환된 값은 " + result);
			int result2 = Integer.parseInt(str[1]);
			System.out.println("숫자로 변환된 값은 " + result2);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("해당 문자열은 정수로 변환 불가");
		}
	}
	public void exercise05() {
		// Null 값을 참조할 때 발생
		// NullPointerException
		String str = null;
		try {
			if(str.equals("null")) {
				System.out.println("같습니다.");
			}else {
				System.out.println("다릅니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null 값을 참조했습니다.");
		}
	}

}
