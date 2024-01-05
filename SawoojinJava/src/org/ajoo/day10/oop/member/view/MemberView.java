package org.ajoo.day10.oop.member.view;

import java.util.List;
import java.util.Scanner;

import org.ajoo.day09.collection.member.controller.MemberController;
import org.ajoo.day09.collection.member.model.vo.Member;

public class MemberView {
	MemberController mController;
	public MemberView() {
		mController = new MemberController();
	}
	public void startProgram() {
		end :
		while(true) {
			int choice = this.printMenu();
			switch(choice) {
			case 1 :
				this.inputMember();
				break;
			case 2 :
				memberId = this.inputMember();
				this.modifyMember(memberId);
				break;
			case 3 :
				this.removeMember();
				break;
			case 4 :
				this.printOneMember();
				break;
			case 5 :
				this.printAllMembers();
				break;
			case 6 :
				System.out.println("프로그램 종료");
				break end;
			default :
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(아이디)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public void inputMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("====== 회원 정보 등록 ======");
		System.out.print("아이디 : ");
		member.setMemberId(sc.next());
		System.out.print("비밀번호 : ");
		member.setMemberPw(sc.nextInt());
		System.out.print("이름 : ");
		member.setMemberName(sc.next());
		System.out.print("이메일 : ");
		member.setMemberEmail(sc.next());
		System.out.print("전화번호 : ");
		member.setMemberPhone(sc.nextInt());
		System.out.println("정보를 저장중입니다...");
		System.out.println("저장완료!");
		mController.addMember(member);
	}
	public void modifyMember(String memberId) {
//		List<Member> members = mController.findMember();
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 정보 수정 ======");
		System.out.print("아이디를 입력해주세요 : ");
//		String memberId = sc.next();
//		boolean memberFound = false;
//		for (int i = 0; i < members.size(); i++) {
//			Member member = members.get(i);
//			 if (member.getMemberId().equals(memberId)) {
//				 System.out.println("수정할 정보를 입력해주세요");
//				 System.out.print("비밀번호 : ");
//				 member.setMemberPw(sc.nextInt());
//				 System.out.print("이메일 : ");
//				 member.setMemberEmail(sc.next());
//				 System.out.print("전화번호 : ");
//				 member.setMemberPhone(sc.nextInt());
//				 System.out.println("정보를 수정중입니다...");
//				 System.out.println("수정완료!");
//				 memberFound = true;
//				 break;
//			 }
			 try {
				mController.updateMember(memberId, member);
				Thread.sleep(1500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//		if (!memberFound) {
//			System.out.println("회원정보가 존재하지 않습니다.");			
//		}
	}
	public void removeMember() {
		List<Member> members = mController.findMember();
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("삭제할 회원의 아이디를 입력해주세요 : ");
		String memberId = sc.next();
		boolean memberFound = false;
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			 if (member.getMemberId().equals(memberId)) {
					mController.deleteMember(member);
					System.out.println("정보를 삭제중입니다...");
					System.out.println("삭제완료!");
					memberFound = true;
					break;
			 }
		}
		if (!memberFound) {
			System.out.println("회원정보가 존재하지 않습니다.");			
		}
	}
	public void printOneMember() {
		List<Member> members = mController.findMember();
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 아이디 입력 : ");
		String memberId = sc.next();
		boolean memberFound = false;
		System.out.println("====== 회원 정보 출력(아이디) ======");
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			 if (member.getMemberId().equals(memberId)) {
				 System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %d\n"
						 ,member.getMemberId()
						 ,member.getMemberName()
						 ,member.getMemberEmail()
						 ,member.getMemberPhone());
				memberFound = true;
				break;
			 }
		}
		if (!memberFound) {
			System.out.println("회원정보가 존재하지 않습니다.");			
		}
	}
	public void printAllMembers() {
		List<Member> members = mController.findAllMember();
		System.out.println("====== 회원 전체 정보 출력 ======");
		for (int i = 0; i < members.size(); i++) {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %d\n"
					,members.get(i).getMemberId()
					,members.get(i).getMemberName()
					,members.get(i).getMemberEmail()
					,members.get(i).getMemberPhone());
		}
	}
}
