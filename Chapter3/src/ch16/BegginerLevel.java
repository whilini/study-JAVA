package ch16;

public class BegginerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Run slowly");
	}

	@Override
	public void jump() {
		System.out.println("Can't jump");
	}

	@Override
	public void turn() {
		System.out.println("Can't turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***I'm Begginer***");
	}	

}
