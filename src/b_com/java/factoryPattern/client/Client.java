package b_com.java.factoryPattern.client;

import b_com.java.factoryPattern.Computer;
import b_com.java.factoryPattern.ComputerFactory;
import b_com.java.factoryPattern.ComputerType;

public class Client {
	public static void main(String[] args) {
		Computer pc  =ComputerFactory.getComputer(ComputerType.PC, "16 GB", "120 GB", "1 GHZ", true, false);
		System.out.println("Pc Config :" + pc );
		
		Computer server  =ComputerFactory.getComputer(ComputerType.SERVER, "32 GB", "120 GB", "3 GHZ", true, false);
		System.out.println("Server Config :" + server );
	
	}
}
