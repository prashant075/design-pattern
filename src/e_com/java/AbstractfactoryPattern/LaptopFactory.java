package e_com.java.AbstractfactoryPattern;

public class LaptopFactory implements AbstractComputerFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	
	public LaptopFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}


	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(ram, hdd,cpu,isGraphicsEnabled,isBluetoothEnabled);
	}

}
