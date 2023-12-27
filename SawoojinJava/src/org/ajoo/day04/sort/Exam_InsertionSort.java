package org.ajoo.day04.sort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스값을 0번에서 n-1번 인덱스까지 비교
		// n 은 1부터 시작
		// 반복1
		int arrs[] = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arrs[j] > arrs[i]) {
					int temp = arrs[i];
					arrs[i] = arrs[j];
					arrs[j] = temp;
				}
			}
		}	
		// 배열 출력
		for(int i = 0; i < arrs.length; i ++) {
			System.out.print(arrs[i] + " ");
		}
//		// 2,5,4,1,3
//		// 반복2
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		// 2,4,5,1,3
//		// 반복3
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[1] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[0];
//			arrs[0] = temp;
//		}
	}

}
