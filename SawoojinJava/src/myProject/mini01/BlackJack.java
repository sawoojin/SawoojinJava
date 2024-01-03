package myProject.mini01;

public class BlackJack {
	public int playerTotal;
	public int aiTotal;
	public int aiMoney = 1000;
	public int playerMoney = 1000;
	public int aiWin = 0;
	public int playerWin = 0;
	
	public BlackJack() {
		
	}
	
	public BlackJack(int playerTotal, int aiTotal, int aiMoney, int playerMoney, int aiWin, int playerWin) {
		this.playerTotal = playerTotal;
		this.aiTotal = aiTotal;
		this.aiMoney = aiMoney;
		this.playerMoney = playerMoney;
		this.aiWin = aiWin;
		this.playerWin = playerWin;
	}
}