package h_com.java.ProxyPattern;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	private static  VeryExpensiveProcess veryExpensiveObject;
	
	@Override
	public void process() {
		if(veryExpensiveObject == null) {
			veryExpensiveObject = new VeryExpensiveProcessImpl();
		}
		veryExpensiveObject.process();
	}
}
