package ch02;

public class AddTest {
	
	public static void main(String[] args) {
		
		Add add = (x, y) -> x+y;
		
		System.out.println(add.calc(2, 3));
		
	}

}
