package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber myNumber = (x, y) -> {
			if(x > y) return x;
			else return y;
		};
		
		System.out.println(myNumber.getMax(10, 1000));

	}

}
