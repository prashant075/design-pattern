package p_com.java.StatePattern;

public class ACstopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is tured OFF");
	}

}
