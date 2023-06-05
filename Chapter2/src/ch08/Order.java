package ch08;

public class Order {
	
	public long orderId;
	public int phoneNum;
	public String address;
	public int orderDate;
	public int orderTime;
	public int price;
	public String menuId;
	
	public Order(long orderId, int phoneNum, String address, int orderDate, int orderTime, int price, String menuId) {
		
		this.orderId = orderId;
		this.phoneNum = phoneNum;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.price = price;
		this.menuId = menuId;
		
	}
	
	public void OrderDetail() {
		System.out.println("주문 접수 번호 : " + orderId);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderDate);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuId);
	}

}
