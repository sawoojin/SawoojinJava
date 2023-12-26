package org.ajoo.day03.array;

import java.util.Scanner;

public class Exercise_Array01 {

	public static void main(String[] args) {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램 작성.
		// 배열의 크기는 5 이다.
		Scanner sc = new Scanner(System.in);
		int arrs [] = new int [5];
		int sum = 0;
		for(int i = 0; i < arrs.length; i ++) {
			System.out.print("정수 입력 ("+(i+1)+") : ");
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		} 
		sc.close();
		System.out.println("평균은 " + sum/arrs.length + "입니다.");
		
		
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		int nums [] = new int [5];
//		int max = 0;
//		for(int i = 0; i < nums.length; i ++) {
//			System.out.print("정수 입력 ("+(i+1)+") : ");
//			nums[i] = sc.nextInt();
//			if(nums[i] > max) {
//				max = nums[i];
//			}
//		}
//		System.out.println("가장 큰 수는 " + max + "입니다.");
//		
	}

}
