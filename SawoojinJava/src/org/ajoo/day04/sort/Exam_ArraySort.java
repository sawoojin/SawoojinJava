package org.ajoo.day04.sort;

public class Exam_ArraySort {

	public static void main(String[] args) {
		// 알고리즘, 문제 해결을 하기 위한 절차나 방법
		// 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		int num1 = 11;
		int num2 = 13;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		// num1에는 13이 들어가고 num2 에는 11이 들어가도록 해주세요
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
		int nums[] = {2, 1, 3};
		// 321
		int temp3 = nums[0];
		nums[0] = nums[2];
		nums[2] = nums[1];
		nums[1] = temp3;
		System.out.printf("%d\n%d\n%d", nums[0], nums[1], nums[2]);
		
	}

}
