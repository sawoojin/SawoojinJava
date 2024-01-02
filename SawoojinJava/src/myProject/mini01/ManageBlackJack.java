package myProject.mini01;

import java.util.Scanner;

public class ManageBlackJack {
	BlackJack BlackJack = new BlackJack();
			
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 블랙잭 게임 =========");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 규칙");
		System.out.println("3. 게임 종료");
		System.out.print("숫자 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public int gameStart() {
		BlackJack BJ = new BlackJack();
		BlackJackCard aiCard = new BlackJackCard();
		BlackJackCard playerCard = new BlackJackCard();
		Scanner sc = new Scanner(System.in);
		
		int playerCardHave = playerCard.value;
		int playerTotal = playerCardHave;
		int aiCardHave = aiCard.value;
		int aiTotal = aiCardHave;
		System.out.print("배팅 금액 입력 (최소100, 100단위로) : ");
		int betting = sc.nextInt();
		if(betting == 0) {
			return 0;
		}
		System.out.println("컴퓨터 카드 정보 : " + aiCardHave);
		System.out.println("현재 AI의 합: " + aiTotal);
		System.out.println("플레이어 카드 정보 : " + playerCardHave);
		System.out.println("현재 플레이어의 합: " + playerTotal);
//			System.out.println("남은 플레이어 금액 : " + BJ.playerMoney);
//			System.out.println("남은 컴퓨터 금액 : " + BJ.aiMoney);
//			System.out.println("컴퓨터 승리 횟수 : " + BJ.aiWin);
//			System.out.println("플레이어 승리 횟수 : " + BJ.playerWin);
		burst :
		while(true) {
			
			System.out.print("1. Hit (카드 더 받기) / 2. Stay (카드 그만 받기) : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				// 플레이어 카드 뽑기
				if(playerTotal > 21) {
					System.out.println("Burst!");
					break burst;
				}else {
					int playerCardValue = playerCardHave;
					playerTotal += playerCardValue;
					System.out.println("당신이 뽑은 카드: " + playerCardValue);
	                System.out.println("현재 플레이어의 합: " + playerTotal);
					if(playerTotal > 21) {
						System.out.println("Burst!");
						break burst;
					}
				}
				// 딜러 카드 뽑기
				if(aiCardHave > 21) {
					System.out.println("AI Burst!");
					break burst;
				}else {
					if(aiTotal < 15) {
						int aiCardValue = aiCardHave;
						aiTotal += aiCardValue;
						System.out.println("AI가 뽑은 카드: " + aiCardValue);
                        System.out.println("현재 AI의 합: " + aiTotal);
                        if(aiTotal > 21) {
        					System.out.println("AI Burst!");
        					break burst;
        				}
					}
				}
				break;
			case 2 :
				// 딜러만 카드를 돌립니다.
				while(true) {
					if(aiTotal < 15) {
						int aiCardValue = aiCardHave;
						aiTotal += aiCardValue;
						System.out.println("AI가 뽑은 카드: " + aiCardValue);
						System.out.println("현재 AI의 합: " + aiTotal);
						if(aiTotal > 21) {
							System.out.println("AI Burst!");
							break burst;
						}
					}
					else {
						// 여기서 나온 카드로 이긴사람을 판별
						if(aiTotal > playerTotal) {
							
						}
					}
					break;	
				}
			default :
				System.out.println("1,2 중에서 선택해주세요");
				break;
			}
			
			
		}
		return 1;
	}
	public void gameRule(String msg) {
		System.out.println(msg);

	}
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}