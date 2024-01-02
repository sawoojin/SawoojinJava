package myProject.mini01;

import java.util.Random;

public class BlackJackCard {
	public int value;
	
	public BlackJackCard() {
		this.value = randomValue();
	}
	private int randomValue() {
		// 랜덤한 값을 리턴
		Random random = new Random();
		return random.nextInt(13) + 1;
	}

}