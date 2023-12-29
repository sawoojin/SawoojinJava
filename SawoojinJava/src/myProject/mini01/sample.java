package myProject.mini01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }

        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        System.out.println("=== 간단한 블랙잭 게임 ===");

        // 초기 카드 분배
        Card playerCard1 = deck.drawCard();
        Card playerCard2 = deck.drawCard();
        Card dealerCard1 = deck.drawCard();

        System.out.println("당신의 카드: " + playerCard1 + ", " + playerCard2);
        System.out.println("딜러의 카드: " + dealerCard1);

        // 플레이어 차례
        int playerTotal = getCardValue(playerCard1) + getCardValue(playerCard2);
        System.out.println("당신의 현재 점수: " + playerTotal);

        while (true) {
            System.out.print("카드를 더 받겠습니까? (y/n): ");
            String choice = scanner.nextLine();

            if ("y".equalsIgnoreCase(choice)) {
                Card newCard = deck.drawCard();
                System.out.println("새로 받은 카드: " + newCard);
                playerTotal += getCardValue(newCard);
                System.out.println("당신의 현재 점수: " + playerTotal);

                if (playerTotal > 21) {
                    System.out.println("버스트! 21을 넘겼습니다. 딜러의 승리!");
                    break;
                }
            } else if ("n".equalsIgnoreCase(choice)) {
                // 딜러 차례
                int dealerTotal = getCardValue(dealerCard1);
                System.out.println("딜러의 현재 점수: " + dealerTotal);

                while (dealerTotal < 17) {
                    Card newCard = deck.drawCard();
                    System.out.println("딜러가 카드를 더 받았습니다: " + newCard);
                    dealerTotal += getCardValue(newCard);
                    System.out.println("딜러의 현재 점수: " + dealerTotal);
                }

                if (dealerTotal > 21 || dealerTotal < playerTotal) {
                    System.out.println("축하합니다! 당신의 승리!");
                } else if (dealerTotal > playerTotal) {
                    System.out.println("딜러의 승리!");
                } else {
                    System.out.println("무승부! 비겼습니다.");
                }

                break;
            } else {
                System.out.println("올바른 선택이 아닙니다. 다시 선택하세요.");
            }
        }
    }

    private static int getCardValue(Card card) {
        String rank = card.toString().split(" ")[0];
        if ("Jack".equals(rank) || "Queen".equals(rank) || "King".equals(rank)) {
            return 10;
        } else if ("Ace".equals(rank)) {
            return 11; // Ace는 11 또는 1로 사용 가능
        } else {
            return Integer.parseInt(rank);
        }
    }
}
