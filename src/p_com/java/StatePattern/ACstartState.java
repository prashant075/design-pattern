package p_com.java.StatePattern;

public class ACstartState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is tured ON");
	}

}
