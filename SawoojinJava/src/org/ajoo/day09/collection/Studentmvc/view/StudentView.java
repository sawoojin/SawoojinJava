package org.ajoo.day09.collection.Studentmvc.view;

import java.util.List;
import java.util.Scanner;

import org.ajoo.day09.collection.Studentmvc.controller.StudentController;
import org.ajoo.day09.collection.Studentmvc.model.Student;

public class StudentView {
	StudentController sController;
	public StudentView() {
		sController = new StudentController();
	}
	public void startProgram() {
		end :
		while(true) {
			int choice = this.printMenu();
			switch(choice) {
			case 1 :
				this.inputScore();
				break;
			case 2 :
				this.printScore();
				break;
			case 3 : 
				this.displayMsg("프로그램 종료");
				break end;
			default :
				this.displayMsg("1 ~ 3 사이 값을 입력해주세요");
				break;
			}
		}
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	// 성적 압력(이름, 정수1, 정수2)
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("첫번째 점수 : ");
		int firstScore = sc.nextInt();
		System.out.println("두번째 점수 : ");
		int secondScore = sc.nextInt();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);

	}
	// 성적 출력
	public void printScore() {
		List<Student> students = sController.allStudentList();
		for (int i = 0; i < students.size(); i++) {
			System.out.println("======" + (i + 1) + "번째 학생의 정보 출력 ======");
			System.out.printf("%s 학생의 첫번째 점수는 %d점, 두번째 점수는 %d점입니다.\n", students.get(i).getName(),
					students.get(i).getFirstScore(), students.get(i).getSecondScore());
		}
	}
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
