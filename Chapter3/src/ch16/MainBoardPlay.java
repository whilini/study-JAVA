package ch16;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel bLevel = new SuperLevel();
		player.upgradeLevel(bLevel);
		player.play(3);
		
		
	}

}
