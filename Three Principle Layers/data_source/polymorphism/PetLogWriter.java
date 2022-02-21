package polymorphism;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PetLogWriter {
	
	String fileName;
	
	public PetLogWriter(String fileName) {
		this.fileName = fileName;
	}
	
	public void log(String toLog) {
		try(PrintStream stream = new PrintStream(new FileOutputStream(this.fileName, true))) {
			stream.println(toLog);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
