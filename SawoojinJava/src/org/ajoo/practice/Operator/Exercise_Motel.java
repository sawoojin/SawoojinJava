package org.ajoo.practice.Operator;

import java.util.Scanner;

import org.ajoo.practice.Operator.run.MotelRun;

public class Exercise_Motel {
	
	public static void room() {

		Scanner sc = new Scanner(System.in);
		MotelRun room[] = new MotelRun[10];
		int input;
		int roomNum;
		System.out.println("모텔 관리 프로그램");
		System.out.println("1.입실\t2.퇴실\t3.방보기\t4.종료");
		System.out.print("선택 > ");
		input = sc.nextInt();
		for(int i = 0; i < room.length; i ++) {
			room[i] = 0;
		}
		
		if (input == 1) {
			System.out.println("몇번방에 입실하시겠습니까?");
			roomNum = sc.nextInt();
			if (room[roomNum] = 0)
				System.out.println(roomNum + "번방에 입실하셨습니다");
				room[roomNum]
		}
		else if (input == 2) {
			
		}
		else if (input == 3) {
			
		}
		else if (input == 4) {
	
		}
		else {
			
		}
	}
}