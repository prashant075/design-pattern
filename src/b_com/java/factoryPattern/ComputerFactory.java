package b_com.java.factoryPattern;

public class ComputerFactory {
	
	private ComputerFactory() {
		
	}
	
	public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		switch(computerType) {
		case PC:
			return new PC(ram, hdd, cpu,isGraphicsEnabled,isBluetoothEnabled);
		case SERVER:
			return new Server(ram, hdd, cpu,isGraphicsEnabled,isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, hdd, cpu,isGraphicsEnabled,isBluetoothEnabled);
		default:
			throw new RuntimeException("NO class");
		}
		
	}
}
