package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors();
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		Method[] methods = c.getMethods();
		for(Method mth : methods) {
			System.out.println(mth);
		}
		
	}

}
