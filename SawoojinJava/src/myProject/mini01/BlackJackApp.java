package myProject.mini01;

public class BlackJackApp {

	public static void main(String[] args) {
		ManageBlackJack manBJ = new ManageBlackJack();
		end :
		while(true) {
			int choice = manBJ.mainMenu();
			switch(choice) {
			case 1 : 
				while(true) {
					int result = manBJ.gameStart();
					if(result == 0) {
						break;
					}
				}
			case 2 : manBJ.gameRule("	====== 게임 규칙 =========="); break;
			case 3 : manBJ.displayMsg("	== 프로그램을 종료합니다 =="); break end;
			default : manBJ.displayMsg("====== 숫자 입력 오류 ====="); break;
			}
		}
	}
}