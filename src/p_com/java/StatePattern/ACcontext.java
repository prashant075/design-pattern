package p_com.java.StatePattern;

public class ACcontext implements State {
	
	private State state;
	
	public void setState(State state) {
		this.state =state;
	}
	
	
	public State getState() {
		return state;
	}


	@Override
	public void doAction() {
		state.doAction();

	}

}
