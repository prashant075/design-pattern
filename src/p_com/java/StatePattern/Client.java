package p_com.java.StatePattern;

public class Client {
	public static void main(String[] args) {
		ACcontext  ac = new ACcontext();
		State acstate = new ACstartState();
		ac.setState(acstate);
		ac.doAction();
		
		State acStop = new ACstopState();
		ac.setState(acStop);
		ac.doAction();
	}
}
