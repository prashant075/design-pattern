package e_com.java.AbstractfactoryPattern;

public class ComputerFactoryNew {
	
	private ComputerFactoryNew() {
		
	}
	
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}
}
