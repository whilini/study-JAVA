package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("Arrays.stream(arr).forEach(n -> System.out.println(n));");
		
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("IntStream is = Arrays.stream(arr);");
		System.out.println("is.forEach(n -> System.out.println(n));");
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("int sum = Arrays.stream(arr).sum();");
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		System.out.println();
		System.out.println("int sum = Arrays.stream(arr).sum();");
		
		long count = Arrays.stream(arr).count();
		System.out.println(count);

	}

}
