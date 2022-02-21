package polymorphism;

public class Cat extends Pet {

	PetLogWriter logger;
	
	public Cat(String name, PetLogWriter pLW) {
		super(name);
		this.logger = pLW;
	}

	@Override
	public void doSpecialAbility() {
		this.logger.log(getName() + " says: Yawn. ZzzzzZzZzZzzzz....");
	}
}
