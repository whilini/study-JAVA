package ch19;

public class Car {

	private static int serialNum = 10000;
	
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarId(int carNum) {
		this.carNum = carNum;
	}

}
