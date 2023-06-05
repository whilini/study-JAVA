package ch03;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private String agentID;
	
	
	public String getAgentID() {
		return agentID;
	}

//	하위클래스가 생성될 때, 항상 상위클래스가 먼저 생성된다.
//	명시적으로 호출하지 않으면 자동으로 super();가 호출됨.
	
//	public VIPCustomer() {
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//
//		System.out.println("VIPCustomer() call");
//	}
	
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
}
