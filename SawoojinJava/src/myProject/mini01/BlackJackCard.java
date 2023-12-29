package myProject.mini01;

import java.util.Random;

public class BlackJackCard {
	public int cardNum;
	public int value;
	
	public BlackJackCard() {}
	
	public BlackJackCard(int cardNum, int value) {
		this.cardNum = cardNum;
		this.value = value;
	}
	private int RandomValue() {
		// 랜덤한 값을 리턴
		Random random = new Random();
		return random.nextInt(13) + 1;
	}
}