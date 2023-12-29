package org.ajoo.day06.oop.student;

public class StudentApp {
	public static void main(String[] args) {
		ManageStudent manStd = new ManageStudent();
		end :
		while(true) {
			int choice = manStd.printMenu();
			switch(choice) {
			case 1 : manStd.inputScore(); break;
			case 2 : manStd.printScore(); break;
			case 3 : manStd.displayMsg("프로그램 종료"); break end;
			default : manStd.displayMsg("숫자 입력 잘못됨"); break;
			}
		}
	}

}