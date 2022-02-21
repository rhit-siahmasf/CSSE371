package libstatemachines;

public class Transition<T> {
	
	private T currentState;
	private char nextChar;
	private T nextState;
	private SideEffect sideEffect;
	
	public Transition(T cs, char nc, T ns, SideEffect se) {
		this.currentState = cs;
		this.nextChar = nc;
		this.nextState = ns;
		this.sideEffect = se;
	}


}
