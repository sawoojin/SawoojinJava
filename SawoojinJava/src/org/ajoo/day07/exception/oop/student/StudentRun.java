package org.ajoo.day07.exception.oop.student;

public class StudentRun {

	public static void main(String[] args) {
		StudnetController sController = new StudnetController();
		end :
		while(true) {
			int choice = sController.printMenu();
			switch(choice) {
			case 1 :
				sController.inputScore();
				break;
			case 2 :
				sController.printScore();
				break;
			case 3 : 
				sController.displayMsg("프로그램 종료");
				break end;
			default :
				sController.displayMsg("1 ~ 3 사이 값을 입력해주세요");
				break;
			}
		}

	}

}
