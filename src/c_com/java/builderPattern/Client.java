package c_com.java.builderPattern;

public class Client {
	public static void main(String[] args) {
		Laptop l1 =new Laptop.LaptopBuilder("16 GB", "240 GB", "2.56 GHZ").build();
	
		System.out.println("Laptop Config: "+l1);
		
		Laptop l2 =new Laptop.LaptopBuilder("16 GB", "240 GB", "2.56 GHZ").setBluetoothEnabled(true).build();
		
		System.out.println("Laptop Config: "+l2);
		
		Laptop l3 =new Laptop.LaptopBuilder("16 GB", "240 GB", "2.56 GHZ").setGraphicsEnabled(true).setBluetoothEnabled(true).build();
		
		System.out.println("Laptop Config: "+l3);
	}
}
