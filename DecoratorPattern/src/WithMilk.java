
public class WithMilk extends CoffeeDecorator {

	Coffee coffee;
	
	public WithMilk(Coffee coff) {
		this.coffee = coff;
	}

	@Override
	public String getDecscription() {
		return this.coffee.getDescription();
	}

	@Override
	public double cost() {
		return this.coffee.cost() + .50;
	}

}
