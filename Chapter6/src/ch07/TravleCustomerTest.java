package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravleCustomerTest {

	public static void main(String[] args) {
		
		TravleCustomer customerLee  = new TravleCustomer("이순신", 40, 100);
		TravleCustomer customerKim  = new TravleCustomer("김유신", 20, 100);
		TravleCustomer customerHong = new TravleCustomer("홍길동", 13, 50);
		
		List<TravleCustomer> customerList = new ArrayList<TravleCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("=====고객 명단 출력=====");
		customerList.stream().forEach(s -> System.out.println(s));
		
		System.out.println("=====고객 name 출력=====");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("=====여행 비용 출력=====");
		System.out.println(customerList.stream().mapToInt(e -> e.getPrice()).sum());
		
		System.out.println("=====20세 이상 고객=====");
		customerList.stream().filter(a -> a.getAge() >= 20).map(n -> n.getName()).sorted().forEach(c -> System.out.println(c));

	}

}
