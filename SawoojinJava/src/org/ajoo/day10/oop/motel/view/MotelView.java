package org.ajoo.day10.oop.motel.view;

import java.util.List;
import java.util.Scanner;

import org.ajoo.day10.oop.motel.controller.MotelController;
import org.ajoo.day10.oop.motel.model.vo.Room;

public class MotelView {
	MotelController mController;
	public MotelView() {
		mController = new MotelController();
	}
	public void launchProgram() {
		end :
		for(;;) {
			int input = this.printMainMenu();
			switch(input) {
			case 1 :
				this.checkIn();
				break;
			case 2 :
				this.checkOut();
				break;
			case 3 :
				this.printAllRooms();
				break;
			case 4 :
				break end;
			}
		}
	}
	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1. 입실");
		System.out.println("2. 퇴실");
		System.out.println("3. 방보기");
		System.out.println("4. 나가기");
		int input = sc.nextInt();
		return input;
	}
	public void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();
		mController.checkIn(roomNum);
	}
	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("퇴실할 방 번호");
		int roomNum = sc.nextInt();
		mController.checkOut(roomNum);
	}
	public void printAllRooms() {
		int i = 1;
		List<Room> rooms = mController.printAllRooms();
		for(Room r : rooms) {
			if(r.isAvailable()) {
				System.out.println(i + "번째 방은 현재 손님이 있습니다.");				
			}else {
				System.out.println(i + "번째 방은 현재 비어 있습니다.");				
			}
			i++;
		}
	}
}
