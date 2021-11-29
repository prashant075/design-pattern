package h_com.java.ProxyPattern;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {

	public VeryExpensiveProcessProxy() {
		heavyInitialConfigurationSetup();
	}
	@Override
	public void process() {
		System.out.println("Processing DOne");

	}
	
	private void heavyInitialConfigurationSetup() {
		System.out.println("Setting up Initial Config");
		
	}

}
