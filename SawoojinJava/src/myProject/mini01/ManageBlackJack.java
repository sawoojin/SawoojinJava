package myProject.mini01;

import java.util.Scanner;

public class ManageBlackJack {
	BlackJack BJ = new BlackJack();

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
		Scanner sc = new Scanner(System.in);

		BlackJackCard aiCard1 = new BlackJackCard();
		BlackJackCard playerCard1 = new BlackJackCard();
		int playerCardHave = playerCard1.value;
		int aiCardHave = aiCard1.value;
		BJ.playerTotal = playerCardHave;
		BJ.aiTotal = aiCardHave;
		System.out.println("남은 플레이어 금액 : " + BJ.playerMoney);
		System.out.println("남은 컴퓨터 금액 : " + BJ.aiMoney);
		System.out.println("컴퓨터 승리 횟수 : " + BJ.aiWin);
		System.out.println("플레이어 승리 횟수 : " + BJ.playerWin);
		System.out.print("배팅 금액 입력 : ");
		int betting = sc.nextInt();
		if(betting == 0) {
			return 0;
		}
		burst :
		while(true) {
			BlackJackCard aiCard = new BlackJackCard();
			BlackJackCard playerCard = new BlackJackCard();

			System.out.println("플레이어 카드 합계 : " + BJ.playerTotal);
			System.out.println("컴퓨터 카드 합계 : " + BJ.aiTotal);
			System.out.print("1. Hit (카드 더 받기) / 2. Stay (카드 그만 받기) : ");		
			int choice = sc.nextInt();

			switch(choice) {
			case 1 :
				// 플레이어 카드 뽑기
				if(BJ.playerTotal > 21) {
					System.out.println("Burst! 플레이어가 패배합니다.!");
					BJ.aiMoney += betting;
					BJ.playerMoney -= betting;
					break burst;
				}else {
					int playerCardValue = playerCard.value;
					BJ.playerTotal += playerCardValue;
					System.out.println("당신이 뽑은 카드: " + playerCardValue);
					if(BJ.playerTotal > 21) {
						System.out.println("현재 플레이어의 합: " + BJ.playerTotal);
						System.out.println("Burst! 플레이어가 패배합니다.");
						BJ.aiMoney += betting;
						BJ.playerMoney -= betting;
						break burst;
					}
				}
				// 딜러 카드 뽑기
				if(aiCardHave > 21) {
					System.out.println("AI Burst! 플레이어가 승리합니다.");
					BJ.aiMoney -= betting;
					BJ.playerMoney += betting;
					break burst;
				}else {
					if(BJ.aiTotal < 17) {
						int aiCardValue = aiCard.value;
						BJ.aiTotal += aiCardValue;
						System.out.println("AI가 뽑은 카드: " + aiCardValue);
                        if(BJ.aiTotal > 21) {
                        	System.out.println("현재 AI의 합: " + BJ.aiTotal);
        					System.out.println("AI Burst! 플레이어가 승리합니다.");
							BJ.aiMoney -= betting;
							BJ.playerMoney += betting;
        					break burst;
        				}
					}
				}
				break;
			case 2 :
				// 딜러만 카드를 돌립니다.
				while(true) {
					if(BJ.aiTotal < 15) {
						int aiCardValue = aiCard.value;
						BJ.aiTotal += aiCardValue;
						if(BJ.aiTotal > 21) {
							System.out.println("AI가 뽑은 카드: " + aiCardValue);
							System.out.println("현재 AI의 합: " + BJ.aiTotal);
							System.out.println("AI Burst! 플레이어가 승리합니다.");
							BJ.aiMoney -= betting;
							BJ.playerMoney += betting;
							break burst;
						}
					}
					break;
				}
				// 여기서 나온 카드로 이긴사람을 판별
				if(BJ.aiTotal > BJ.playerTotal) {
					BJ.aiMoney += betting;
					BJ.playerMoney -= betting;
					System.out.println("플레이어가 패배합니다.");
					break burst;
				}else if(BJ.aiTotal < BJ.playerTotal) {
					BJ.aiMoney -= betting;
					BJ.playerMoney += betting;
					System.out.println("플레이어가 승리합니다.");
					break burst;
				}else {
					System.out.println("무승부");
					break burst;
				}
				
			default :
				System.out.println("1,2 중에서 선택해주세요");
				break;
			}		
		}
//		return 1;
		return betting;
	}
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}