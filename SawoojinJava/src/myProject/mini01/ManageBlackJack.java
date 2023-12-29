package myProject.mini01;

import java.util.Scanner;

public class ManageBlackJack {
	BlackJack BlackJack = new BlackJack();
			
	public int MainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 블랙잭 게임 =========");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 규칙");
		System.out.println("3. 게임 종료");
		System.out.print("숫자 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public void gameStart() {
		BlackJackCard BJCard = new BlackJackCard();
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배팅 금액 입력 (최소100, 100단위로");
		int betting = sc.nextInt();
			System.out.println("컴퓨터 카드 정보 : ");
			System.out.println("플레이어 카드 정보 : ");
			System.out.println("1. Hit (카드 더 받기) / 2. Stay (카드 그만 받기)");
			System.out.println("남은 플레이어 금액 : ");
			System.out.println("남은 컴퓨터 금액 : ");
			System.out.println("컴퓨터 승리 횟수 : ");
			System.out.println("플레이어 승리 횟수 : ");
			
			
		}
		
	}
	public void gameRule() {
		
	}
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}