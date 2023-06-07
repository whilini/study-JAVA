package ch09;

public abstract class Computer {
	
	// 하위 클래스에서 쓸 공통 method를 미리 선언
	// 구현은 하위 클래스마다 다르게 할 수 있음.
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("turn ooooon");
	}
	
	void turnOff() {
		System.out.println("turn offffff");
	}

}
