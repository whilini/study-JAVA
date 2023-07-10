package ch06;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		TreeDPrinter3 printer = new TreeDPrinter3();
		
		printer.setMaterial(powder);
		Powder p = (Powder)printer.getMaterial();

	}

}
