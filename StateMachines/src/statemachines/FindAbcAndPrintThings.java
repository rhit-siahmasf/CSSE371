package statemachines;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import libstatemachines.StateMachine;
import libstatemachines.Transition;

public class FindAbcAndPrintThings implements StateMachine {
	int state = 'A';
	static final int FINAL_STATE = 'f';
	private List<Transition> transitions = new LinkedList<Transition>();
	
	public FindAbcAndPrintThings() {
	
		transitions.add(new Transition('A', 'A', 'b', null));
		transitions.add(new Transition('A', '*', 'A', null));
		transitions.add(new Transition('b', 'b', 'c', null));
		transitions.add(new Transition('b', 'A', 'b', null));
		transitions.add(new Transition('b', '*', 'A', null));
		transitions.add(new Transition('c', 'c', FINAL_STATE, null));
		transitions.add(new Transition('c', 'A', 'b', null));
		transitions.add(new Transition('c', '*', 'A', null));
		transitions.add(new Transition(FINAL_STATE, '*', FINAL_STATE, null));
		
	}
	
	
	@Override
	public StateMachine createNewStateMachine() {
		return new FindAbcAndPrintThings();
	}
	
	
	@Override
	public <T> boolean sendState(List<T> states) {
		return false;
	}


	@Override
	public boolean accept(List<Character> streamOfChars) {
		return false;
	}
	
}
