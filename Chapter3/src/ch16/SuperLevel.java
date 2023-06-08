package ch16;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Run faster");
	}

	@Override
	public void jump() {
		System.out.println("Jump higher");
	}

	@Override
	public void turn() {
		System.out.println("Can turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***I'm Super***");		
	}	
}
