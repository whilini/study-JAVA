package ch16;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Run fast");
	}

	@Override
	public void jump() {
		System.out.println("Jump high");
	}

	@Override
	public void turn() {
		System.out.println("Can't turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***I'm Advanced***");		
	}	
}
