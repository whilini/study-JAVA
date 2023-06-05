package ch09;

public class LocalVariableinter {

	public static void main(String[] args) {

		var i = 10000000000000L;
		var j = 10.0;
		var str = "test";
		var str2 = str;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		System.out.println(str2);
		
		str = "hello";
		
		System.out.println(str);
	}

}
