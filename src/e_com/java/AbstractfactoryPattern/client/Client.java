package e_com.java.AbstractfactoryPattern.client;

import e_com.java.AbstractfactoryPattern.Computer;
import e_com.java.AbstractfactoryPattern.ComputerFactoryNew;
import e_com.java.AbstractfactoryPattern.PCFactory;
import e_com.java.AbstractfactoryPattern.ServerFactory;

public class Client {
	public static void main(String[] args) {
		Computer pc  =ComputerFactoryNew.getComputer(new PCFactory( "16 GB", "120 GB", "1 GHZ", true, false));
		System.out.println("Pc Config :" + pc );
		
		Computer server  =ComputerFactoryNew.getComputer(new ServerFactory( "32 GB", "120 GB", "3 GHZ", true, false));
		System.out.println("Server Config :" + server );
	
	}
}
