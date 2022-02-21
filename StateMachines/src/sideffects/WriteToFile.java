package sideffects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import libstatemachines.SideEffect;

public class WriteToFile implements SideEffect {
	
	String fileName;
	FileOutputStream file;
	boolean appendToEnd;
	String textToAdd;
	
	public WriteToFile(String fn, boolean boo, String text) {
		
		this.fileName = fn;
		this.appendToEnd = boo;
		this.textToAdd = text;
		
	}

	@Override
	public boolean applySideEffect() {
		
		try {
			this.file = new FileOutputStream(this.fileName, this.appendToEnd);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try(PrintStream out = new PrintStream(new FileOutputStream("log.txt", true))){
//			if (state == 'A') {
//				if (next == 'A') {
//					out.println("Found the " + next);
//				} else {
//					// This else branch handles the * edge in the diagram.
//					out.println("Did not find the A. Still looking for A...");
//				}
//			} else if (state == 'b') {
//				if (next == 'b') {
//					out.println("Found the " + next);
//				} else if (next == 'A') {
//					out.println("Saw another A, going to b");
//				} else {
//					out.println("Did not find the b. Restarting the search...");
//				}
//			} else if (state == 'c') {
//				if (next == 'c') {
//					out.println("Found the " + next);
//				} else if (next == 'A') {
//					out.println("Saw another A, going to b");
//				} else {
//					out.println("Did not find the c. Restarting the search...");
//				}
//			} else if (state == FINAL_STATE) {
//				out.println("In the final state, saw a meaningless " + next);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
		return false;
	}

}
