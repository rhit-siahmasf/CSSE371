package libstatemachines;

import java.util.LinkedList;
import java.util.List;

/**
 * Added this interface so we are programming to the interface and not the implementation.
 */
public interface StateMachine {
	
	public static final List<Transition> transitions = new LinkedList<Transition>();

	boolean accept(List<Character> streamOfChars);
	
	/* Creates a new instance of the given state machine without having to re-generate all
	 * the given transitions & corresponding SideEffects
	 */
	public StateMachine createNewStateMachine();
	
	public <T> boolean sendState(List<T> states);

}
