package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "Lee");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(1234, "noname");
//		이렇게 만들 수는 있지만 agentID나 bonusRatio, salesRatio 변수에는 접근할 수 없음(Custom 인스턴스만 접근 가능)
		
	}

}
