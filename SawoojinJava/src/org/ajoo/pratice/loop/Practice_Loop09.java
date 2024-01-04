package org.ajoo.pratice.loop;

import java.util.Scanner;

public class Practice_Loop09 {

	public static void main(String[] args) {
//		메소드 명 : public void practice9(){}
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
//
//		ex.
//		자연수 하나를 입력하세요 : 15
//		2 3 4 6 8 9 10 12 14 15
//		count : 2
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i ++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			else if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
