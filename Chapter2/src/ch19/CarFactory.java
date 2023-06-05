package ch19;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public Car createCar() {
		Car newCar = new Car();
		return newCar;
	}
	
	public static CarFactory getInstance() {
		if(instance == null) instance = new CarFactory();
		return instance;
	}
}
