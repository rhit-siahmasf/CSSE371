package polymorphism;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Dog extends Pet {
	
	public boolean goodDog = true;
	PetLogWriter logger;
	
	public Dog(String name, String isGoodBoy, PetLogWriter log) {
		super(name);
		this.goodDog = "yes".equals(isGoodBoy);
		this.logger = log;
	}

	@Override
	public void doSpecialAbility() {
		
		this.logger.log(getName() + " says: Yawn. ZzzzzZzZzZzzzz....");
		
		if (startsWithVowel(this.getName())) {
			this.logger.log("Arf!");
		} else {
			this.logger.log("Bow wow!");
		}
		this.logger.log(this.goodDog ? "Good dog!" : "Bad dog!");
		
	}
	
	private boolean startsWithVowel(String s) {
		char ch = Character.toLowerCase(s.charAt(0));
		// When y is the first letter of a word, it isn't a vowel.
		return ch == 'a' || ch == 'e' || ch == 'i' 
				|| ch == 'o' || ch == 'u';
	}	
}
