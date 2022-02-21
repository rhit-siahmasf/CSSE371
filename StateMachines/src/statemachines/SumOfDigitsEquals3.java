package statemachines;

import java.util.LinkedList;
import java.util.List;

import libstatemachines.StateMachine;
import libstatemachines.Transition;
import sideffects.WriteToFile;

/**
 *
 * Deterministic finite state machine to sum up a list of numbers and see if it
 * equals 3. Notice there is no + operator in this code - state machines do not
 * do arithmetic. Finite state machines have very simple instruction sets that
 * take in the next character and decide (based on the current state) the next
 * state to enter.
 *
 */
public class SumOfDigitsEquals3 implements StateMachine {

	private List<Transition> transitions;
	
	private WriteToFile sideEffect = new WriteToFile("log.txt", true, "");
	
	
	public SumOfDigitsEquals3() {
		transitions = new LinkedList<Transition>();
		transitions.add(new Transition(0, '0', 0, sideEffect));
		transitions.add(new Transition(0, '1', 1, null));
		transitions.add(new Transition(0, '2', 2, null));
		transitions.add(new Transition(0, '3', 3, null));
		transitions.add(new Transition(1, '0', 1, sideEffect));
		transitions.add(new Transition(1, '1', 2, null));
		transitions.add(new Transition(1, '2', 3, null));
		transitions.add(new Transition(2, '0', 2, sideEffect));
		transitions.add(new Transition(2, '1', 3, null));
		transitions.add(new Transition(3, '0', 3, sideEffect));
	}
	
	@Override
	public boolean accept(List<Character> streamOfChars) {
		return true;
	}
	
	@Override
	public StateMachine createNewStateMachine() {
		return new SumOfDigitsEquals3();
	}

	@Override
	public <T> boolean sendState(List<T> states) {
		return false;
	}
}
